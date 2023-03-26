import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        int n1,n2,n3,opcion,pot=0;
        double suma=0,resta=0,multi=0,div=0;
        Scanner captura=new Scanner(System.in);
        System.out.println("Escoja una operación\n1.Suma\n2.Resta\n3.Multiplicación\n4.División\n5.Potencia");
        opcion=captura.nextInt();
        System.out.println("Digite el primer número");
        n1=captura.nextInt();
        System.out.println("Digite el segundo número");
        n2=captura.nextInt();
        System.out.println("Digite el tercer número");
        n3=captura.nextInt();
        switch(opcion){
        case 1:
            suma=n1+n2+n3;
            System.out.println("Usted eligió sumar y su resultado es "+suma);
        break;
        case 2:
            resta=n1-n2-n3;
            System.out.println("Usted eligió restar y su resultado es "+resta);
        break;
        case 3:
            multi=n1*n2*n3;
            System.out.println("Usted eligió multiplicar y su resultado es "+multi);
        break;
        case 4:
            div=n1/n2/n3;
            System.out.println("Usted eligió dividir y su resultado es "+div);
        break;
        case 5:
            pot=(n1)*(n1);
            System.out.println("Usted eligió potencia y su resultado es "+pot);
        break;
        default:
            System.out.println("Usted eligió una opción equivocada ");
        break;
       }
       captura.close();
    }
}
