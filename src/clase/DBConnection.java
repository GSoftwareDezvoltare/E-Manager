/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

import com.mysql.jdbc.Connection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 *
 * @author TechSolutions
 */

public final class DBConnection{

    public Connection connect;
    public static DBConnection db;
    
    
    private DBConnection() throws FileNotFoundException, ClassNotFoundException{
       File fisier = new File("local.xml");
        
        if(fisier.isHidden()){
        try{
            Properties props = new Properties();
            InputStream file_configuration = new FileInputStream("local.xml");
            props.loadFromXML(file_configuration);
            String url = props.getProperty("adresaSQL");
            String dbName = props.getProperty("numeBD");
            String driver = props.getProperty("driverBD");
            String userName = props.getProperty("username");
            String password = "fg2358ij90M#";
            
            try{
                Class.forName(driver).newInstance();
                this.connect = (Connection)DriverManager.getConnection(url+dbName,userName,password);
                
            }
            catch(SQLException e){
                e.printStackTrace();
            } catch (InstantiationException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
                catch(IOException ex){
                    Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, "Conectiunea cu bd nu s-a realizat!", ex);
                }
        
        }
        else{
                
                    Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, "Conectiunea cu bd nu s-a realizat!");
                
                }
       
    }
     public static synchronized DBConnection getDbCon() {
        if ( db == null ) {
            try {
                db = new DBConnection();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return db;
        
        
 
    }

   
}