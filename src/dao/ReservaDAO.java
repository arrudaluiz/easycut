package dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Reserva;


public class ReservaDAO {
    //DUVIDA: COMO REFERENCIAR AS CHAVES ESTRANGEIRAS
    public void inserir(Reserva reserva){
        String sql = "INSERT INTO RESERVA (RES_ID, RES_HORARIO, RES_OBS, RES_CLOSED, HORARIOS_HOR_ID, SERVICO_SER_COD, USUARIO_FUN_COD, USUARIO_CLI_COD ) VALUES (0, ?, ?, ?, ?, ?, ?, ?)";
        
        try{
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);
            
            sentenca.setString(2, reserva.getResHorario());
            sentenca.setString(3, reserva.getResObs());
            sentenca.setString(4, reserva.getResClosed());
            sentenca.setString(5, reserva.getHorariosHorId());
            sentenca.setInt(6, reserva.getServicoSerCod());
            sentenca.setInt(7, reserva.getUsuarioFunCod());
            sentenca.setInt(8, reserva.getUsuarioCliCod());
            
                        
            sentenca.execute();
            sentenca.close();
            con.close();
        }
        catch(SQLException ex){
            throw new RuntimeException(ex);
        }
           
    }
    
    public void alterar(Reserva reserva)
    {
        String sql = "UPDATE RESERVA SET RES_HORARIO = ?, RES_OBS = ?, RES_CLOSED = ?, HORARIOS_HOR_ID = ? WHERE RES_ID = ?" ;
        
        try {
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);
            
           sentenca.setString(1, reserva.getResHorario());
            sentenca.setString(2, reserva.getResObs());
            sentenca.setString(3, reserva.getResClosed());
            sentenca.setString(4, reserva.getResClosed());
            sentenca.setString(5, reserva.getHorariosHorId());
            sentenca.setInt(6, reserva.getServicoSerCod());
            sentenca.setInt(7, reserva.getUsuarioFunCod());
            sentenca.setInt(8, reserva.getUsuarioCliCod());
            
            sentenca.execute();
            sentenca.close();
            con.close();
        }
        catch(SQLException ex)
        {
            throw new RuntimeException(ex);
        }
    }
    
    public void excluir(Reserva reserva)
    {
        String sql = "DELETE FROM RESERVA WHERE RES_ID = ?";
        try{
                
            Connection con = ConexaoBanco.getConexao();
            PreparedStatement sentenca = con.prepareStatement(sql);
            
            sentenca.setInt(1, reserva.getResId());
                        
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
