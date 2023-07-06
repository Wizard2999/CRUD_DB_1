/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class ConexionDB {
     private String base = "moninet";
    private String user = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/"+base;
    private Connection con = null;
    
       public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
           // JOptionPane.showMessageDialog(null, "Conectado a la base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error en el driver.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            System.out.println(ex);
        }
        return con;
    }
    
}
