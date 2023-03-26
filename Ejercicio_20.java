import java.util.Scanner;
public class Ejercicio_20{
    public static void main(String[] args) {

        double saldo=0, saldo_2=saldo, costo=2950;   

        int pasajes=0, saldo_3=0;

        Scanner lec = new Scanner(System.in);

        System.out.println("Digita cuanto deseas recargar");
        saldo=lec.nextInt();

        System.out.println("Tu saldo es de: " + saldo);

        System.out.println("Digita cuantos pasajes deseas pagar");

        pasajes = lec.nextInt();
        for(int i=1;i<=pasajes;i++)
        {  
            
                if(saldo>costo)
            {
                saldo=saldo-costo;
                saldo_3=1;
                System.out.println("Registra pasaje " + i);
            }
                else if(saldo<=(costo*2))
            {
                System.out.println("Lo sentimos saldo insufuciente " + i + " pasajes\n tenías " + saldo_2 + " tu saldo restante es: " + (saldo-costo));
                i=pasajes+pasajes;
                saldo_3=2;
            }
            }
        if(saldo_3==1)
        {
            System.out.println("Tu saldo restante es de: " + saldo);
        }
            lec.close();

    }
}


