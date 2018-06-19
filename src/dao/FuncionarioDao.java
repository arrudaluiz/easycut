package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Funcionario;
import model.Usuario;

public class FuncionarioDao {


    public void inserir(Funcionario funcionario) {
        String sql = "INSERT INTO FUNCIONARIO (SERVICO_SER_COD, USUARIO_USU_COD) VALUES (?, ?)";

        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            sentenca.setInt(1, funcionario.getCodServico());
            sentenca.setInt(2, funcionario.getCodFuncionario());

            sentenca.execute();
            sentenca.close();
            con.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<String> consultarFun(int cod) {
        String sql = "SELECT U.USU_NAME FROM USUARIO AS U, FUNCIONARIO AS F WHERE U.USU_COD = F.USUARIO_USU_COD and F.SERVICO_SER_COD = ?;";

        List<String> resultados = new ArrayList<>();
        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            sentenca.setInt(1, cod);
            ResultSet query = sentenca.executeQuery();
            while (query.next()) {
                String resultado = query.getString(1);
                resultados.add(resultado);
            }

            sentenca.close();
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return resultados;

    }
    
    public String consultarLogin(String login) {
        String sql = "USU_LOGIN FROM USUARIO AS U WHERE U.USU_LOGIN = ?;";

        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            sentenca.setString(1, login);
            
            sentenca.close();
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return "";
    }



}
