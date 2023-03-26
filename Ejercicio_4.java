import java.util.Scanner;
/**
 * Ejercicio_4
 */
public class Ejercicio_4 {

    public static void main(String[] args) {

       Scanner lec =new Scanner(System.in);


        int total=0;

        System.out.print("Digite su nombre\n");
        String comprador=lec.nextLine();

        System.out.print("Nombre del primer producto\n");
        String producto_1=lec.nextLine();

        System.out.print("Precio del primer producto\n");
        int precio_1=lec.nextInt();

        System.out.print("Nombre del segundo producto\n");
        String producto_2=lec.next();

        System.out.print("Precio del segundo producto\n");
        int precio_2=lec.nextInt();

        
        System.out.print("Nombre del tercer producto\n");
        String producto_3=lec.next();

        System.out.print("Precio del tercer producto\n");
        int precio_3=lec.nextInt();


        System.out.print("Nombre del cuarto producto\n");
        String producto_4=lec.next();

        System.out.print("Precio del cuarto producto\n");
        int precio_4=lec.nextInt();


        System.out.print("Nombre del quinto producto\n");
        String producto_5=lec.next();
        
        System.out.print("Precio del quinto producto\n");
        int precio_5=lec.nextInt();

        total=precio_1+precio_2+precio_3+precio_4+precio_5;

        System.out.println("Señor "+comprador+" el precio total por su compra de:\n"+producto_1+"\n"+producto_2+"\n"+producto_3+"\n"+producto_4+"\n"+producto_5+"\nEs de  un total de "+total+"$");

        lec.close();
    }
}
