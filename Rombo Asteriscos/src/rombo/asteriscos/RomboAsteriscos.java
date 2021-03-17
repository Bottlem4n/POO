package rombo.asteriscos;

import java.util.Scanner;
/**
 *
 * @author Jair Botello
 */
public class RomboAsteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner rombo= new Scanner(System.in);
        
        
        System.out.println();
        int altura = 2;
        do{
            System.out.println("Ingresa un inpar para la Altura: ");
            altura = rombo.nextInt();
        }while( altura % 2 ==0);
        rombo.close();
        for(int superior = 1; superior <= ((altura/2)+1); superior++){
            for(int espacio=1; espacio <= altura/2-superior+1; espacio++)
                System.out.print(" ");
            for(int asterisco=(altura/2)-superior+2; asterisco <= (altura/2)+superior; asterisco++)
                System.out.print("*");
            System.out.println();
        }
        
        for(int inferior = 1; inferior <= (altura/2); inferior++){
            for(int espacio=1; espacio <= inferior; espacio++)
                System.out.print(" ");
            for(int asterisco=(inferior+1); asterisco <= (altura-inferior); asterisco++)
                System.out.print("*");
            System.out.println();
        }
    }      
}
