import java.util.Scanner;

/**
 * Ejercicio_12
 */
public class Ejercicio_12 {

    public static void main(String[] args) {
        
        


        Scanner lec=new Scanner(System.in);

        System.out.println("Digite su nombre: \n");
        int nombre=lec.nextInt();

        System.out.println("Digite su usuario: \n");
        int usu=lec.nextInt();

        System.out.println("Digite su contraseña: \n");
        int contra=lec.nextInt();

        

        if (usu==12345 && contra==12345) {
            
            System.out.println("Ya tienes la primera dosis digita tu usuario y contraseña para programar tu cita para la segunda dosis: \n");
            
            System.out.println("Digite su usuario: \n");
            int usu_1=lec.nextInt();

            System.out.println("Digite su contraseña: \n");
            int contra_1=lec.nextInt();


            System.out.println("listo "+nombre+" tu usuario y contraseña es "+ usu_1 + contra_1+ " la segunda dosis te la va a aplicar el doctor raul y la cita esta programada de hoy en ocho ");

        } 
        
        else if (usu==54321 && contra==54321) {
            
            System.out.println("No tienes niniguna dosis de las vacunas registradas: \n");
            
            System.out.println("Digite su usuario: \n");
            int usu_1=lec.nextInt();

            System.out.println("Digite su contraseña: \n");
            int contra_1=lec.nextInt();


            System.out.println("listo "+nombre+" tu usuario y contraseña es "+ usu_1 + contra_1+ " la primera dosis te la va a aplicar el doctor castillo y la cita esta programada de hoy en ocho ");

        } 
        
        else if (usu==98765 && contra==98765) {
            
            System.out.println("Ya tienes la primera y la segunda dosis digita tu usuario y contraseña para programar tu cita para la tercera dosis: \n");
            
            System.out.println("Digite su usuario: \n");
            int usu_1=lec.nextInt();

            System.out.println("Digite su contraseña: \n");
            int contra_1=lec.nextInt();


            System.out.println("listo "+nombre+" tu usuario y contraseña es "+ usu_1 + contra_1+ " la tercera dosis te la va a aplicar el doctor raul y la cita esta programada de hoy en ocho ");

        } 

        else if (usu==56789 && contra==56789) {
            
            System.out.println("Ya tienes todas las vacunas aplicadas");
        } 

        else {
            System.out.println("usuario o contraseña incorrecta");

        }

        lec.close();
    }
}