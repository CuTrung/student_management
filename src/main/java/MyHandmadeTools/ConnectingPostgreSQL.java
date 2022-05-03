/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyHandmadeTools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ConnectingPostgreSQL {

//    private final String url = "jdbc:postgresql://localhost/dvdrental";
//    private final String user = "postgres";
//    private final String password = "Trung411"; 
    
    //FORMAT: jdbc:postgresql://<database_hostname>:<port>/<database_name>
    private final String url;
    private String DB_hostname;
    private String DB_name;
    private final String user;
    private final String password;
    
    //Connecting by use url, user, pass
    public ConnectingPostgreSQL(String DB_hostname, String DB_name, String user, String password) {
        this.url = "jdbc:postgresql://" + DB_hostname + "/" + DB_name;       
        this.user = user;
        this.password = password;
    }
    
    public Connection connect() throws SQLException {      
        return DriverManager.getConnection(url, user, password);
    }
    
    
    
//    public static void main(String[] args) throws SQLException {
//        ConnectingPostgreSQL conn = new ConnectingPostgreSQL("localhost", "dvdrental", "postgres", "Trung411");
//        conn.connect();
//    }
    
    

}
