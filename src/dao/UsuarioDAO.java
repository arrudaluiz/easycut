package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioDAO implements DaoGenerica<Usuario> {

    @Override
    public void inserir(Usuario usuario) {
        String sql = "INSERT INTO USUARIO (USU_COD, USU_LOGIN, USU_PASSWORD, USU_NAME, USU_CPF, USU_TYPE, USU_REMOVE) VALUES (0, ?, ?, ?, ?, 0, 0)";

        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            sentenca.setInt(1, usuario.getUsuCod());
            sentenca.setString(2, usuario.getUsuLogin());
            sentenca.setString(3, usuario.getUsuPassword());
            sentenca.setString(4, usuario.getUsuName());
            sentenca.setString(5, usuario.getUsuCpf());

            sentenca.execute();
            con.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void alterar(Usuario usuario) {
        String sql = "UPDATE USUARIO SET USU_LOGIN = ?, USU_PASSWORD = ?, USU_NAME = ?, USU_CPF = ?, USU_TYPE = ?, USU_REMOVE = ? WHERE USU_COD = ?";

        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            sentenca.setString(1, usuario.getUsuLogin());
            sentenca.setString(2, usuario.getUsuPassword());
            sentenca.setString(3, usuario.getUsuName());
            sentenca.setString(4, usuario.getUsuCpf());
            sentenca.setBoolean(5, usuario.isUsuType());
            sentenca.setBoolean(6, usuario.isUsuRemove());
            sentenca.setInt(7, usuario.getUsuCod());

            sentenca.execute();
            sentenca.close();
            con.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public void excluir(Integer cod) {
        String sql = "UPDATE USUARIO SET USU_REMOVE = 1 WHERE USU_COD = ?";
        
        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            sentenca.setInt(1, cod);

            sentenca.execute();
            sentenca.close();
            con.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public ArrayList<Usuario> consultar() {
        String sql = "SELECT * FROM USUARIO";
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {

            Connection con = ConexaoBanco.getConexao();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet query = statement.executeQuery();
            while (query.next()) {
                Usuario usuario = new Usuario();
                usuario.setUsuCod(query.getInt(1));
                usuario.setUsuLogin(query.getString(2));
                usuario.setUsuName(query.getString(3));
                usuario.setUsuCpf(query.getString(4));
                //CONTINUA AQUI ALFREDO, SETANDO VARIAVEL POR VARIAVEL DO RETORNO DA CONSULTA

                usuarios.add(usuario);
            }

            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        } finally {
            return usuarios;
        }
    }
        

}
