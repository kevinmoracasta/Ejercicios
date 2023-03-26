import java.util.Scanner;

/**
 * Ejercicio_23
 */
public class Ejercicio_23 {
public static void main(String[] args) {

    /*String [] fruta=new String[6];

    String [] frutas={"fresa","manzana","mora","mango","uva","sandia"};
    */

    String [] fruta=new String[6];
    Scanner lec=new Scanner(System.in);
    
     System.out.println(fruta.length);

    for (int i=0;i<fruta.length;i++){

    System.out.println(" Digite la fruta que desea "+i);
    
    fruta [i]=lec.next(); 

    }
    

    for (int i=0;i<fruta.length;i++){
        System.out.println("la fruta digitada en la posicion"+fruta [i]);
    }
    
lec.close();
}
    
}