/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasimple;

import java.util.Scanner;

/**
 *
 * @author jairb
 */
public class CalculadoraSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean estado = false;
        int valor1=0, valor2=0, opcion=0, num1=0, num2=0, resultado=0, contadorSuma=0, contadorMultiplicacion=0, contadorDivision=0;
        
        do{
            System.out.println("Menu: ");
            System.out.println("1 ) Sumar dos numeros ");
            System.out.println("2 ) Multiplicar dos numeros");
            System.out.println("3 ) Dividir dos numeros");
            System.out.println("4 ) Salir");
            
            opcion = teclado.nextInt();
            
            switch(opcion){
                case 1:
                    contadorSuma++;
                    System.out.println("Primer numero: ");
                    num1 = teclado.nextInt();
                    System.out.println("Segundo numero: ");
                    num2 = teclado.nextInt();
                    resultado = num1+num2;
                    System.out.println("Resultado: "+resultado);
                    
                    break;
                
                case 2:
                    contadorMultiplicacion++;
                    System.out.println("Primer numero: ");
                    num1 = teclado.nextInt();
                    System.out.println("Segundo numero: ");
                    num2 = teclado.nextInt();
                    resultado = num1*num2;
                    System.out.println("Resultado: "+resultado);
                    
                    break;
                    
                case 3:
                    contadorDivision++;
                    System.out.println("Primer numero: ");
                    num1 = teclado.nextInt();
                    System.out.println("Segundo numero: ");
                    num2 = teclado.nextInt();
                    
                    if(num2==0){
                        System.out.println("Division indeterminada");
                    }
                    else{
                        resultado = num1/num2;
                        System.out.println("Resultado: "+resultado);
                    }
                    break;
                    
                case 4:
                    estado = true;
                    break;
                
                default:
                    System.out.println("Opcion no valida");
            }
            
        }while(estado == false);
        
        System.out.println("Veces que se sumo: "+contadorSuma);
        System.out.println("Veces que se multiplico: "+contadorMultiplicacion);
        System.out.println("Veces que se dividio: "+contadorDivision);
    }
    
}
