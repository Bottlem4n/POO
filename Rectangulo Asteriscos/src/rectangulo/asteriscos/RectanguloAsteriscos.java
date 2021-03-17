package rectangulo.asteriscos;

import java.util.Scanner;

/**
 *
 * @author Jair Botello
 */
public class RectanguloAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rectangulo= new Scanner(System.in);
        System.out.println("Ingresa la Altura: ");
        int altura = rectangulo.nextInt();
        System.out.println("Ingresa la Base: ");
        int base = rectangulo.nextInt();
        rectangulo.close();
        
        System.out.println();
        for(int fila = 1; fila <= altura; fila++){
            for(int columna =1; columna <= base; columna++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
