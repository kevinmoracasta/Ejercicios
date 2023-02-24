import java.util.Scanner;

/**
 * Ejercicio_5
 */
public class Ejercicio_5 {

public static void main(String[] args) {
    
Scanner lec  = new Scanner(System.in); 

System.out.println("nombre de persona que uso el computador\n") ;

String nombre= lec.nextLine();

System.out.println("ficha");

int ficha= lec.nextInt();


System.out.println("Día\n"); 

int dia= lec.nextInt(); 

System.out.println("mes\n"); 

int mes= lec.nextInt();

System.out.println("año\n"); 

int año= lec.nextInt();

System.out.println("id pantalla\n"); 

int pantalla= lec.nextInt(); 

System.out.println("id mouse\n") ;

int mouse= lec.nextInt(); 

System.out.println("id CPU\n");

int CPU= lec.nextInt();

 
System.out.println("id teclado\n");

int teclado= lec.nextInt();


System.out.println("numero identificación de dispositivo\n");

int id= lec.nextInt(); 


System.out.println("Digite si tuvo o no problemas con el dispositivo");

String reporte= lec.next(); 

System.out.println("listo "+nombre+" su fucha es "+ficha+" el reporte fue hecho el dia "+dia+"/"+mes+"/"+año+" usaste el dispositivo con el id de: \n pantalla "+pantalla+"\n mouse "+mouse+"\n CPU "+CPU+"\n teclado "+teclado+"\n y con el numero de computador "+id+" y "+reporte+" tubiste problemas con el dispositivo");

lec.close();
} 

}