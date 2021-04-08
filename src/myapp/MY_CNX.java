/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class MY_CNX {
    private static String servername="localhost";
    private static String username="root";
    private static String databasename="users_bd";
    private static Integer portnumber=3306;
    private static String password="";
    public static Connection getConection()
    {
        Connection cnx=null;
        MysqlDataSource datasource=new MysqlDataSource();
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(databasename);
        datasource.setPortNumber(portnumber);
        
        try
        {
             cnx=(Connection) datasource.getConnection();
        }catch(SQLException ex)
        {
            Logger.getLogger("get connection : "+MY_CNX.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cnx;
    }

    public static Object getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
