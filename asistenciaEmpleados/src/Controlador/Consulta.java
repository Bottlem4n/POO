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
   
    public String consultaEmpleado(){
        String sql = "SELECT CONCAT(CCVEEMP,' | ',CNOMBRE) "
                + "FROM DDATEMP "
                + "ORDER BY CCVEEMP";
        return sql;
    }
    
}
