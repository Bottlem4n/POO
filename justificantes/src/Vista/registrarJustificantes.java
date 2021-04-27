/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairb
 */
public class registrarJustificantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        Controlador.ConexionBD control = new Controlador.ConexionBD();
        Connection conexion  = control.conexion();
        
        System.out.println("Teclee ID del Justificante (0-99): ");
        String claveJustificante = teclado.nextLine();
        
        System.out.println("Teclee Descripcion del Justificante (Maximo 100 caracteres): ");
        String descripcionJustificante = teclado.nextLine();
        
        System.out.println("Teclee ID del Justificante (A = Activo | I = Inactivo): ");
        String EstadoJustificante = teclado.nextLine();
                
        Controlador.Insercion insertarJustificante = new Controlador.Insercion();
        
        try {
            PreparedStatement pps = conexion.prepareStatement(insertarJustificante.insertJustificante());
            pps.setString(1, claveJustificante);
            pps.setString(2, descripcionJustificante);
            pps.setString(3, EstadoJustificante);
            pps.executeUpdate();
            System.out.println("Justificante registrado con éxito"); 
        } catch (SQLException ex) {
            Logger.getLogger(registrarJustificantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        control.cierraConexion();
    }
    
}
