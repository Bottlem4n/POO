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
public class RegistroHorario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Scanner teclado = new Scanner(System.in);
        Controlador.ConexionBD control = new Controlador.ConexionBD();
        Connection conexion  = control.conexion();
        
        //Controlador.Consulta consultaHorario = new Controlador.Consulta();
        
        String nuevoRegistro = " ";
        
        System.out.println("----------Catalogo Horarios----------");
        
        do{
            String statusHorario = "";
            System.out.println("Teclee ID del Horario: ");
            String idHorario = teclado.nextLine();

            System.out.println("-------------------------------------");

            System.out.println("Introduzca la Descripción del Horario: ");
            String descripcionHorario = teclado.nextLine();

            System.out.println("-------------------------------------");
            teclado.nextLine();
            System.out.println("Introduzca Status del Horario (A=Activo | I=Inactivo): ");
            statusHorario = teclado.nextLine().toUpperCase();

            System.out.println("-------------------------------------");

            System.out.println("Teclee Clave de Usuario: ");
            String claveUsuario = teclado.nextLine();

            System.out.println("-------------------------------------");

            System.out.println("Introduzca fecha del registro (AA/MM/DD): ");
            String fechaRegistro = teclado.nextLine();
            
            System.out.println("-------------------------------------");
            
            Controlador.Insercion insertarHorario = new Controlador.Insercion();
            
            try {
                PreparedStatement pps = conexion.prepareStatement(insertarHorario.insertarHorario());
                pps.setString(1, idHorario);
                pps.setString(2, descripcionHorario);
                pps.setString(3, statusHorario);
                pps.setString(4, claveUsuario);
                pps.setString(5, fechaRegistro);
                pps.executeUpdate();
                System.out.println("Horario registrado con éxito"); 
            } catch (SQLException ex) {
                Logger.getLogger(RegistroHorario.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            System.out.println("-------------------------------------");

            System.out.println("Desea hacer otro registro (S/N): ");
            nuevoRegistro = teclado.nextLine().toUpperCase();
            
        }while("S".equals(nuevoRegistro));
        
        System.out.println("----------Descripción Horarios----------");
        
        do{
            Controlador.Consulta consultaHorario = new Controlador.Consulta();
        
            Statement st;
            try {
                st = conexion.createStatement();
                ResultSet rs = st.executeQuery(consultaHorario.consultaHorario());
                while (rs.next()){
                    System.out.println("ID Horario: "+rs.getString(1));
                }
            } catch (SQLException ex) {
                Logger.getLogger(RegistroHorario.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("Teclee ID del Horario: ");
            String idHorario = teclado.nextLine();

            System.out.println("-------------------------------------");

            System.out.println("Teclee Día de la Semana (L=1, M=2, W=3, J=4,V=5): ");
            String diaSemana = teclado.nextLine();
            int dsem = Integer.parseInt(diaSemana)+1;

            System.out.println("-------------------------------------");

            System.out.println("Teclee Hora de Entrada en formato de 24hrs (HH:MM): ");
            String horaEntrada = teclado.nextLine();

            System.out.println("-------------------------------------");

            System.out.println("Teclee Hora de Salida en formato de 24hrs (HH:MM): ");
            String horaSalida = teclado.nextLine();

            System.out.println("-------------------------------------");
            //teclado.nextLine();
            System.out.println("Introduzca Status del Horario (A=Activo | I=Inactivo): ");
            String statusHorario = teclado.nextLine().toUpperCase();

            System.out.println("-------------------------------------");
            
            Controlador.Insercion insertarDescripcion = new Controlador.Insercion();
            
            try {
                PreparedStatement pps = conexion.prepareStatement(insertarDescripcion.insertarDescripcionHorario());
                pps.setString(1, idHorario);
                pps.setInt(2, dsem);
                pps.setString(3, horaEntrada);
                pps.setString(4, horaSalida);
                pps.setString(5, statusHorario);
                pps.executeUpdate();
                System.out.println("Descripción registrada con éxito"); 
            } catch (SQLException ex) {
                Logger.getLogger(RegistroHorario.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println("Desea hacer otro registro (S/N): ");
            nuevoRegistro = teclado.nextLine().toUpperCase();
            
            
            
            
        }while("S".equals(nuevoRegistro));
    }
    
}
