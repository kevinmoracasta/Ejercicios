import java.util.Scanner;

/**
 * Ejercicio_6
 */
public class Ejercicio_6 {

    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);

        System.out.print("ingrese color:\n1_rojo\n2_blanco\n3_gris\n4_morado\n5_aranja\n6_rosa\n7_amarillo\n8_negro\n9_nazul\n10_verde\n");
        int color=lec.nextInt();
        if (color==1) {
            System.out.print("el color es primario"+color);
        }
        else if (color==7) {
            System.out.print("el color es primario"+color);
        }
        else if (color==9) {
            System.out.print("el color es primario"+color);
        }
        else if (color==2) {
            System.out.print("el color es primario"+color);
        }
        else if (color==8) {
            System.out.print("el color es primario"+color);
        }
        else{
            System.out.print("el color no es primario");
        }
        lec.close();
    }
}

    