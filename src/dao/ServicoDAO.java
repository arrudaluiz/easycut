package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Servico;

public class ServicoDAO {
    

    public void inserir(Servico servico) {
        String sql = "INSERT INTO USUARIO (SER_COD, SER_NOME, SER_TIME, SER_VALOR, SER_REMOVE) VALUES (0, ?, ?, ?, 0)";

        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            sentenca.setString(2, servico.getSerNome());
            sentenca.setInt(3, servico.getSerTime());
            sentenca.setInt(4, servico.getSerValor());
            sentenca.setBoolean(5, servico.isSerRemove());

            sentenca.execute();
            sentenca.close();
            con.close();

        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public void alterar(Servico servico){
        String sql = "UPDATE SERVICO SET SER_NOME = ?, SER_TIME = ? , SER_VALOR = ?, SER_REMOVE = ? WHERE SER_COD = ?";
        
        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);
            
            sentenca.setString(1, servico.getSerNome());
            sentenca.setInt(2, servico.getSerTime());
            sentenca.setInt(3, servico.getSerValor());
            sentenca.setBoolean(4, servico.isSerRemove());
            sentenca.setInt(5, servico.getSerCod());
            
            sentenca.execute();
            sentenca.close();
            con.close();
        }
        catch(SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
    
    
                    /// Retorna Algo
    public List<String> consultarServ() {
        String sql = "SELECT SER_NAME FROM SERVICO;";

        List<String> resultados = new ArrayList<>();
        
        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);

            ResultSet query = sentenca.executeQuery();
            while (query.next()) {
                String resultadoNome = query.getString(1);
                resultados.add(resultadoNome);
            }

            sentenca.close();
            con.close();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return resultados;

    }
    
    public void arquivar(Integer id){
        String sql = "UPDATE SERVICO SET SER_REMOVE = 1 WHERE SER_COD = ?";
        
        try {
            Connection con = ConexaoBanco.getConexao();
            
            PreparedStatement sentenca = con.prepareStatement(sql);
            
            
            sentenca.setInt(1, id);
            
            sentenca.execute();
            sentenca.close();
            con.close();
        }
        catch(SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
        
 }
    
            
    
    
