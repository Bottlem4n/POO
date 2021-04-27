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
    
    public String insertJustificante(){
        String sql = "INSERT INTO cjusasi (NIDTPJU,CDESJUS,CSTATUS) VALUES (?,?,?)";
        return sql;
    }
    
}
