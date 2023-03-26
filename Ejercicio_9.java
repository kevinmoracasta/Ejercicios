import java.util.Scanner;


/**
 * Ejercicio_9
 */
public class Ejercicio_9 {

    public static void main(String[] args) {
        
        Scanner lec= new Scanner(System.in);

        System.out.println(" Digite su nombre: \n");
        String nombre=lec.nextLine();

        System.out.println(" Digite su edad: \n");
        int edad=lec.nextInt();

        if ( edad >=8 && edad <=17) {
            System.out.print(nombre+" tienes "+edad+" asi que  tienes tarjeta de identidad");
        }
        else if (edad <=7 && edad >=1) {
            System.out.print(nombre+" tienes "+edad+" asi que  tienes registro civil");
            
        }
        else if (edad >17) {
            System.out.print(nombre+" tienes "+edad+" asi que  tienes cedula");

        }
        else if (edad <= 0) {
            System.out.print("La edad que digitaste es erronea ");
        
            
        }
        

        

        
        lec.close();
    }
}