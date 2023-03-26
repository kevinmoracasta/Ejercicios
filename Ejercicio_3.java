import java.util.Scanner;

/**
 * Ejercicio_3
 */
public class Ejercicio_3 {

    public static void main(String[] args) {
    Scanner lec=new Scanner(System.in);

    boolean numero_3;
    int tres;
        
        System.out.println("Digite un numero de su preferencia:\n");
        int numero=lec.nextInt();

    tres=numero%3;
    
    numero_3=(tres == 0);

    System.out.println(numero_3?"\nEl numero "+numero+" si es un numero multiplo de tres.\n" : "\nEl numero "+numero+" no es un numero multiplo de tres.\n");

        lec.close();

    }
}