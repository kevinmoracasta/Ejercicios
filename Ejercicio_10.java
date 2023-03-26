import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        int numer_de_bolas,precio;
        Scanner lec=new Scanner(System.in);

        System.out.println("Digite la cantidad de bolas de helado que quiere");
        numer_de_bolas=lec.nextInt();

        System.out.println("Listo tu quieres "+numer_de_bolas);

        if (numer_de_bolas==1) {
            precio=1000;
        System.out.println("Su elado con "+numer_de_bolas+ " tiene un precio de "+precio+"$");
            
        } else if (numer_de_bolas==2) {
            precio=2000;
            System.out.println("Su elado con "+numer_de_bolas+ " tiene un precio de "+precio+"$");

            
        }else if (numer_de_bolas==3) {
            precio=3000;
            System.out.println("Su elado con "+numer_de_bolas+ " tiene un precio de "+precio+"$");

            
        }else{
            System.out.println("lo sentimos no te podemos servir un helado con "+numer_de_bolas+" bolas de helado" );

        }



        
        lec.close();
    }
}
