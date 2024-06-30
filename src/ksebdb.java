
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author swlab
 */
public class ksebdb {
    Connection conn=null;
    public ksebdb(){
        String username="root";
        String password="";
        String url="jdbc:mysql://localhost/elebill_system";
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.err.println(e);
        }
        try{
            conn = DriverManager.getConnection(url,username,password);
        }
        catch (SQLException e){
            System.err.println("connet error" + e);
        }
    }
    Connection Getconnection () {
        return conn;
}
}
