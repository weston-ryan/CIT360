/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author westo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.ClassNotFoundException;

public class Hibernate2 {
    
    public static void main(String[] args) throws ClassNotFoundException{
    
    final     String URL="jdbc:mysql:/localhost/phpmyadmin/db_structure.php?server=1&db=user";
    String query="insert into AssetDB.Asset values(1, 'Opti Plex 3060', '3330','ICCU')";
    try {
    Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = DriverManager.getConnection(URL)) {
            System.out.println("Connection established");
            Statement st=con.createStatement();
            st.execute(query);
            System.out.println("Asset Tag is Added");
            st.close();
        }
    }   catch (SQLException ex) {
            Logger.getLogger(Hibernate2.class.getName()).log(Level.SEVERE, null, ex);
        }
    //Catch (SQLException | ClassNotFoundException e)
    { e.printStackTrace();
    }}
}
