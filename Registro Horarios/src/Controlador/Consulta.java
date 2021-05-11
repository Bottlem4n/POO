/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author jairb
 */
public class Consulta {
   
    public String consultaHorario(){
        String sql = "SELECT CONCAT(NIDHORA,' | ',CDESCHR) "
                + "FROM CHORARS";
        return sql;
    }
    
}
