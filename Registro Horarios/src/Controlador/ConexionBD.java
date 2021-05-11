/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jairb
 */
public class ConexionBD {
    Connection conexion;
    
    public Connection conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbregasi?characterEncoding=latin1","root","root");
            System.out.println("Conexión Existosa");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }return conexion;
    }
    
    Statement createStatement(){
        throw new UnsupportedOperationException("No se pudo realizara la  Conexión");
    }
    
    public void cierraConexion(){
        try{
            conexion.close();
            System.out.println("Conexión cerrada");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
