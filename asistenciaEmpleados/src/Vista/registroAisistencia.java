/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jairb
 */
public class registroAisistencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        Scanner teclado = new Scanner(System.in);
        Controlador.ConexionBD control = new Controlador.ConexionBD();
        Connection conexion  = control.conexion();
        
        Controlador.Consulta consultaEmpleado = new Controlador.Consulta();
        
        Statement st;
        try {
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(consultaEmpleado.consultaEmpleado());
            while (rs.next()){
                System.out.println("Empleado: " +rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(registroAisistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("Seleccione un Empleado: ");
        String claveEmpleado = teclado.nextLine();
        
        System.out.println("Teclee Fecha y Hora (AAAA-MM-DD HH:MM): ");
        String fechaHora = teclado.nextLine();
        
        System.out.println("Teclee ID del Dispositivo Biometrico (0-99): ");
        String idDispositivoBio = teclado.nextLine();
        
        System.out.println("Teclee Estado del Empleado (A = Activo | I = Inactivo): ");
        String estadoEmpleado = teclado.nextLine();
                
        Controlador.Insercion insertarJustificante = new Controlador.Insercion();
        
        try {
            PreparedStatement pps = conexion.prepareStatement(insertarJustificante.insertAsistencia());
            pps.setString(1, claveEmpleado);
            pps.setString(2, fechaHora);
            pps.setString(3, idDispositivoBio);
            pps.setString(4, estadoEmpleado);
            pps.executeUpdate();
            System.out.println("Justificante registrado con éxito"); 
        } catch (SQLException ex) {
            Logger.getLogger(registroAisistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        control.cierraConexion();
    }
    
}
