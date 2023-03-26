import java.util.Scanner;
public class Ejercicio_22{
    /**
     * @param args
     */
    public static void main(String[] args) {

        double saldo=0, saldo_2=saldo, costo=2950;   

        int pasajes=0, saldo_3=0 ,i=0,contador=0;


        Scanner lec = new Scanner(System.in);

        System.out.println("Digita cuanto deseas recargar");
        saldo=lec.nextInt();

        System.out.println("Tu saldo es de: " + saldo);

        System.out.println("Digita cuantos pasajes deseas pagar");

        pasajes = lec.nextInt();

        System.out.println("vas a pagar"+pasajes);

    
        do
 
            
            if(saldo>costo)
            {
                saldo=saldo-costo;
                System.out.println("vas a pagar " + i+"pasajes");
                saldo_3=1;
                contador++;
                System.out.println("¿Deseas comprar otro pasaje? 1.Si 2.No");
                i = lec.nextInt();
            }
            else if(saldo<=(costo*2))
            {
                System.out.println("Lo sentimos saldo insufuciente " + contador + " pasajes\n tenías " + saldo_2 + " tu saldo restante es: " + (saldo-costo));
                i=2;
                saldo_3=2;
            }
            while(i==1);
        if(saldo_3==1){
        
            System.out.println("Tu saldo restante es de: " + saldo);

        
            lec.close();
 
        }
 }

    }
    