package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBanco {

    public static Connection getConexao() {
        try {
        return DriverManager.getConnection("jdbc:mysql://localhost/easycut", "root", "11049812");
        } catch (SQLException ex) {
            Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
