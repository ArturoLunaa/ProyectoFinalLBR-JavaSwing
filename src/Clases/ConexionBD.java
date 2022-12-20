/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class ConexionBD {
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

    public static final String USER = "root";
    public static final String CLAVE = "";
    
    public void ConectarBD() {
        try {
            final String Controlador = "com.mysql.cj.jdbc.Driver";
            Class.forName(Controlador);
            final String url_bd = "jdbc:mysql://localhost:3306/lbr";
            conexion = DriverManager.getConnection(url_bd, USER, CLAVE);
            sentencia = conexion.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
     public void DesconectarBD() {
        try {
            if(conexion != null){
                if(sentencia != null){
                    sentencia.close();
                }
                conexion.close();
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }
    
     public Connection getConnection(){
         return conexion;
     }   
}
