import java.util.Scanner;

/**
 * Ejercicio_13
 */
public class Ejercicio_15 {

    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        double nota_final=0,nota=0;
        int not=0,ficha,contador=0,i=0;
        String nombre;

        System.out.println("Digite su nombre completo: \n");
        nombre=lec.nextLine();

        System.out.println("Digite su numero de ficha: \n");
        ficha=lec.nextInt();

        System.out.println("Digite cuantas notas saco: \n");
        not=lec.nextInt();

        while (i>contador) {
            System.out.println("Escribe la nota " + not);
            nota = lec.nextInt();
            nota_final=nota_final+nota;
            System.out.println("Deseas escribir otra nota? 1. Si 2.No");
            contador = lec.nextInt();
            if(contador==1)
            {
                i=2;
                not++;
            }
            else if(contador==2)
            {
                i=contador-1;
            }
            else
            {
                System.out.println("error");
            }
        }
        
        nota_final=nota_final/not;

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