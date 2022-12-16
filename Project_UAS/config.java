package Project_UAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class config {

    private static Connection MySQLConfig;
    
    static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/multiuserlogin";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver((new com.mysql.jdbc.Driver()));
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal" + e.getMessage());
    }return MySQLConfig;
    }
}
