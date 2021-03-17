package flecha.asteriscos;

import java.util.Scanner;
/**
 *
 * @author Jair Botello
 */
public class FlechaAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner flecha= new Scanner(System.in);
        System.out.println();
        int altura = 2;
        do{
            System.out.println("Ingresa un inpar para la Altura: ");
            altura = flecha.nextInt();
        }while( altura % 2 ==0);
        flecha.close();
        for(int superior = 1; superior <= ((altura/2)+1); superior++){
            if(superior <= (altura/3)){
                for(int espacio=1; espacio <= altura*2; espacio++)
                    System.out.print(" ");
                for(int asterisco=(altura/2)-superior+2; asterisco <= (altura/2)+superior; asterisco++)
                System.out.print("*");
                System.out.println();
            }
            
            else{
                for(int asterisco=1; asterisco <= (altura*2)+superior+2; asterisco++)
                System.out.print("*");
                System.out.println();
            }
            
        }
        
        /*for(int fila = 1; fila <= (altura/3); fila++){
            for(int columna =1; columna <= (altura*2); columna++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        
        for(int inferior = 1; inferior <= ((altura/2)); inferior++){
            if(inferior <= 1){
                for(int asterisco=1; asterisco <= (altura*2)+inferior+5; asterisco++)
                    System.out.print("*");
                System.out.println();
            }
            else{
                
                for(int espacio=1; espacio <= (altura*2); espacio++)
                    System.out.print(" ");
                for(int asterisco=(inferior+1); asterisco <= (altura-inferior); asterisco++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
    
}
