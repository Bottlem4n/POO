package ejercicio.arreglos.pkg2;

import java.util.Scanner;

/**
 *
 * @author Jair Botello
 */
public class EjercicioArreglos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int LIM = 10; 
        int arreglo[] = new int[LIM];
        int totalPositivos=0, totalNegativos=0, totalCeros=0;
        double mediaPositivos=0, mediaNegativos=0, sumaPositivos=0, sumaNegativos=0;
        Scanner teclado = new Scanner(System.in);
        
        for(int i=0; i < LIM; i++){
            System.out.println("Ingrese el valor de la posicion " +(i + 1) + " :" );
            arreglo[i] = teclado.nextInt();
            if(arreglo[i] > 0){
                totalPositivos++;
                sumaPositivos += arreglo[i];
            }
            
            else if (arreglo[i] == 0){
                totalCeros++;
            }
            
            else if (arreglo[i]<0){
                totalNegativos++;
                sumaNegativos += arreglo[i];
            }
        }
        System.out.println("Sumatoria Positivos: " + sumaPositivos);
        System.out.println("Total de Positivos: " + totalPositivos);
        
        System.out.println("Sumatoria Negativos: " + sumaNegativos);
        System.out.println("Total de Negativos: " + totalNegativos);
        System.out.println("Total de Ceros: " + totalCeros);
        
        mediaPositivos = (sumaPositivos/totalPositivos);
        mediaNegativos = (sumaNegativos/totalNegativos);
        
        System.out.println("La Media de los Positivos: " + mediaPositivos );
        System.out.println("La Media de los Negativos: " + mediaNegativos );
        
    }
}