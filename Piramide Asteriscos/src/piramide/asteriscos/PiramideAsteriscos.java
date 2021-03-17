package piramide.asteriscos;

import java.util.Scanner;

/**
 *
 * @author Jair Botello
 */
public class PiramideAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner piramide= new Scanner(System.in);
        System.out.println("Ingresa la Altura: ");
        int altura = piramide.nextInt();
        piramide.close();
        
        System.out.println();
        for(int alto = 1; alto <= altura; alto++){
            for(int espacio= 1; espacio <= altura-alto; espacio++){
                System.out.print(" ");
            }
            
            for(int asteriscos = 1; asteriscos <=(alto*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
