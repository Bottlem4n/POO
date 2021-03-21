package ejercicio.arreglo.pkg3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jair Botello
 */
public class EjercicioArreglo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int totalPersonas = 0; 
        ArrayList<Integer> arreglo = new ArrayList<Integer>();
        
        int estatura=0;
        double mediaAltura=0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el total de personas a evaluar: " );
        totalPersonas = teclado.nextInt();
        
        for(int i=0; i < totalPersonas; i++){
            do{
                System.out.println("Ingrese la estatura de la persona " + (i+1) + " en cm:" );
                estatura = teclado.nextInt();
            }while(estatura<0);
            arreglo.set(i, estatura);
        }
            
        System.out.println(totalPersonas);
        
    }
    
}
