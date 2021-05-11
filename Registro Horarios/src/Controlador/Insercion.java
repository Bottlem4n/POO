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

    public String insertarHorario(){
        String sql = "INSERT INTO CHORARS (NIDHORA,CDESCHR,CSTATUS,CUSUINS,DFECINS) VALUES (?,?,?,?,?)";
        return sql;
    }
    
    public String insertarDescripcionHorario(){
        String sql = "INSERT INTO DDETHOR (NIDHORA,NDIASEM,CHORENT,CHORSAL,CSTATUS) VALUES (?,?,?,?,?)";
        return sql;
    }  
}
