import java.util.Scanner;

/**
 * Ejercicio_13
 */
public class Ejercicio_13 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        System.out.println("Digite su nombre completo: \n");
        String nombre=lec.nextLine();

        System.out.println("Digite su numero de ficha: \n");
        String ficha=lec.nextLine();

        System.out.println("Digite cuanto saco en su primera nota: \n");
        int not_1=lec.nextInt();

        System.out.println("Digite cuanto saco en su segunda nota: \n");
        int not_2=lec.nextInt();

        System.out.println("Digite cuanto saco en su tercera nota: \n");
        int not_3=lec.nextInt();

        System.out.println("Digite cuanto saco en su cuarta nota: \n");
        int not_4=lec.nextInt();

        System.out.println("Digite cuanto saco en su quinta nota: \n");
        int not_5=lec.nextInt();

        var nota_pos=not_1+not_2+not_3+not_4+not_5;

        var nota_final=nota_pos/5;

        if (nota_final >=0 && nota_final <=20) {

            System.out.println("Listo "+nombre+" de la ficha "+ficha+" sacaste "+nota_final+" asi que sacaste 1 estrella.");
        
            
        }
        else if (nota_final >=21 && nota_final <=40) {

            System.out.println("Listo "+nombre+" de la ficha "+ficha+" sacaste "+nota_final+" asi que sacaste 2 estrella.");
        
            
        }
        else if (nota_final >=41 && nota_final <=60) {

            System.out.println("Listo "+nombre+" de la ficha "+ficha+" sacaste "+nota_final+" asi que sacaste 3 estrella.");
        
            
        }

        else if (nota_final >=61 && nota_final <=80) {

            System.out.println("Listo "+nombre+" de la ficha "+ficha+" sacaste "+nota_final+" asi que sacaste 4 estrella.");
        
            
        }

        else if (nota_final >=81 && nota_final <=100) {

            System.out.println("Listo "+nombre+" de la ficha "+ficha+" sacaste "+nota_final+" asi que sacaste 5 estrella.");
        
            
        }else{
            System.out.println("Digitaste mal una nota corrigela e intentalo denuevo.");
        }

        lec.close();

    }

}