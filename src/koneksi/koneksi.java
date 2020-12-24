/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.*;

public class koneksi {
    private static Connection MySQLconfig;
    
    public static Connection configDB()throws java.sql.SQLException, ClassNotFoundException{
         String query;


        try{
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "yoviepramudya";
            String pass = "1234";
            
            //String driverName = "oracle.jdbc.driver.OracleDriver";
            //Class.forName(driverName);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            MySQLconfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke Database berhasil");
        }catch(java.sql.SQLException e){
            System.out.println("Koneksi ke Database gagal " + e.getMessage());
        }
    return MySQLconfig;
    }

    public static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}