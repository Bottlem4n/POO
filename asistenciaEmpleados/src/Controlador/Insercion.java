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
public class Insercion {
    
    public String insertAsistencia(){
        String sql = "INSERT INTO pregasi (CCVEEMP,DFECREG,CNUMBIO,CSTATUS) VALUES (?,?,?,?)";
        return sql;
    }
    
}
