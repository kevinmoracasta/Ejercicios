import java.util.Scanner;

public class Ejercicio_25 {
    public static void main(String[] args) {
        int f,c;
        Scanner lec=new Scanner(System.in);

        System.out.println("digite cantidad de columnas");
        c=lec.nextInt();

        System.out.println("digite cantidad de filas");
        f=lec.nextInt();

String [][] vocal = new String[f][c];

        

        for(int i=0;i<f;i++){
            for(int t=0;t<c;t++){

                System.out.println("digite la vocal a");
                vocal [i][t]=lec.next();
                
            }
        

        }

        for(int i=0;i<f;i++){
            for(int t=0;t<f;t++){


                
                System.out.print(vocal[i][t]+"\t");

            }
        System.out.println();
        }
lec.close();
        }
}
