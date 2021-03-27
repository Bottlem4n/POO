/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author jairb
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valorInicial=0, resultado=0, control=0;
        boolean estado = false;
        
        do{
            System.out.println("Ingresa un valor entre 0 y 20: ");
            valorInicial = teclado.nextInt();
            if (valorInicial >= 0 && valorInicial <= 20){
                if(valorInicial == 0){
                    resultado=1;
                    System.out.println("El Factorial de " + valorInicial + " es: " + resultado);
                }
                
                else{
                    resultado=1;
                    control=valorInicial;
                    for(int i=1;i<=valorInicial;i++){
                        resultado = resultado * control;
                        control--;
                    }
                    System.out.println("El Factorial de " + valorInicial + " es: " + resultado);
                }
                
                estado = true;
            }
            
            else{
                System.out.println("Valor fuera de rango");
            }
        }while(estado == false);
    }
    
}
