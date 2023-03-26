import java.util.Scanner;

/**
 * Ejercicio_24
 */
public class Ejercicio_24 {

    public static void main(String[] args) {

        Scanner lec=new Scanner(System.in);

    int prome=0,promedio=0,n=0,edad;

    System.out.println(" Digite la cantidad de edades: ");
    n=lec.nextInt();

        int [] edades=new  int[n];

    for (int i=0;i<n;i++){

        System.out.println(" Digite la edad ");
        edad=lec.nextInt();
        edades[i]=edad;
        
        
    }
    for (int t=0;t<n;t++)
    {
        prome=prome+edades [t] ;
    }
    promedio=prome/n;
    System.out.println("El promedio es de "+promedio);



    lec.close();
}
}
 