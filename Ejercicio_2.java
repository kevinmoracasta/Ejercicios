import java.util.Scanner; 

 

/** 

 * reparacion_de_carros 

 */ 

public class Ejercicio_2 { 

    public static void main(String[] args) { 

        Scanner leerScanner = new Scanner(System.in); 

        System.out.print("Digite su nombre"); 

    String nombre=leerScanner.nextLine(); 

        System.out.print("digite modelo del carro"); 

    String carro=leerScanner.nextLine(); 

        System.out.print("digite el tipo de problema \n llantas \n motor\n pintura \n choques: \n"); 

    String Problema=leerScanner.nextLine(); 

         System.out.print("digite el valor correspondiente de su problema de:\n llantas 1.500 \n motor 2.000 \n pintura 2.500 \n choques 3.00: \n"); 

    String valor=leerScanner.nextLine();   

     System.out.print("señor "+nombre+"  el problema de su  "+carro+ " es "+Problema+" y la reparacion tiene un valor de "+valor); 

    

        leerScanner.close();

    } 

} 