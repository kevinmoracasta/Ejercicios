import java.util.Scanner;

/**
 * Ejercicio_8
 */
public class Ejercicio_8 {

    public static void main(String[] args) {
        Scanner lec= new Scanner(System.in);

        

        System.out.println("Digite nombre de uno de usus hijos:\n");
        String nombre_1=lec.nextLine();
        
        System.out.println("Digite la edad de su hij@ "+nombre_1+":\n");
        int añoDeNacimiento_1=lec.nextInt();


        System.out.println("Digite nombre de otro de sus hijos a exepcion de "+nombre_1+":\n");
        String nombre_2=lec.next();

        System.out.println("Digite la edad de su hij@ "+nombre_2+":\n");
        int añoDeNacimiento_2=lec.nextInt();

        
        System.out.println("Digite el nombre de otro de sus hijos a exepcion de "+nombre_1+" o "+nombre_2+":\n");
        String nombre_3=lec.next();

        System.out.println("Digite la edad de su hij@ "+nombre_3+":\n");
        int añoDeNacimiento_3=lec.nextInt();




        if (añoDeNacimiento_1>añoDeNacimiento_2&&añoDeNacimiento_1>añoDeNacimiento_3) {

            if (añoDeNacimiento_2>añoDeNacimiento_3) {
                System.out.println(nombre_1+" es su hij@ mayor con "+añoDeNacimiento_1+" años. \n"+nombre_2+" hij@ del medio con "+añoDeNacimiento_2+" años. \n"+nombre_3+" hij@ mas joven con "+añoDeNacimiento_3+" años.");
         
            } else 

            {
                System.out.println(nombre_1+" es su hij@ mayor con "+añoDeNacimiento_1+" años. \n"+nombre_3+" hija@ del medio con "+añoDeNacimiento_3+" años. \n"+nombre_2+" hij@ mas joven con "+añoDeNacimiento_2+" años.");

            }
        
        }
        else if (añoDeNacimiento_2>añoDeNacimiento_1&&añoDeNacimiento_2>añoDeNacimiento_3) {

            if (añoDeNacimiento_1>añoDeNacimiento_3) {
                System.out.println(nombre_2+" es su hij@ mayor con "+añoDeNacimiento_2+" años. \n"+nombre_1+" hija@ del medio con "+añoDeNacimiento_1+" años. \n"+nombre_3+" hij@ mas joven con "+añoDeNacimiento_3+" años.");

    
            }else

            {
                System.out.println(nombre_2+" es su hij@ mayor con "+añoDeNacimiento_2+" años. \n"+nombre_3+" hija@ del medio con "+añoDeNacimiento_3+" años. \n "+nombre_1+" hij@ mas joven con "+añoDeNacimiento_1+" años.");

            }
            
            }
        else if (añoDeNacimiento_3>añoDeNacimiento_1&&añoDeNacimiento_3>añoDeNacimiento_2) {
            if (añoDeNacimiento_1>añoDeNacimiento_2) {
                System.out.println(nombre_3+" es su hij@ mayor con "+añoDeNacimiento_3+" años. \n"+nombre_1+" hija@ del medio con "+añoDeNacimiento_1+" años. \n"+nombre_2+" hij@ mas joven con "+añoDeNacimiento_2+" años.");


            }else

            {
                System.out.println(nombre_3+" es su hij@ mayor con "+añoDeNacimiento_3+" años. \n"+nombre_2+" hija@ del medio con "+añoDeNacimiento_2+" años. \n"+nombre_1+" hij@ mas joven con "+añoDeNacimiento_1+" años.");

            }
            lec.close();
            }
    }
}