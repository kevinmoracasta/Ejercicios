import java.util.Scanner; 

/** 

 * peso_animal 

 */ 

public class Ejercicio_1 { 

 

 public static void main(String[] args) { 

 
    Scanner sc = new Scanner(System.in); 

    System.out.print("Digite el nombre de la especie de la mascota. \n"); 

    String nombre = sc.nextLine(); 

    System.out.println("El nombre de la especie de la mascota es: \n " + nombre); 


    System.out.print("\n digite la edad en meses del: \n" + nombre ); 

    Integer edad = sc.nextInt(); 


    var peso = edad*50;   

    System.out.println("El peso de" +nombre+ "es: "+peso+"kilogramos" ); 
       
    sc.close();
 } 
} 