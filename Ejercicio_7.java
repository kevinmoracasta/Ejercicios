import java.util.Scanner;

/**
 * Ejercicio_6
 */
public class Ejercicio_7 {

    public static void main(String[] args) {
        Scanner lec=new Scanner(System.in);

        System.out.print("Ingrese dia de nacimiento:\n");
        int dia=lec.nextInt();
        System.out.print("Ingrese mes de nacimiento:\n");
        int mes=lec.nextInt();
        System.out.print("Ingrese año de nacimiento:\n");
        int año=lec.nextInt();
        if (mes==1) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es CAPRICORNIO se caracteriza por tener una personalidad fuerte y atractiva, pero hay dos tipos : los que son tímidos, sensibles y pacientes y los que son exuberantes, vivos y frívolos.");
        }
        else if (mes==2) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es ACUARIO se caracteriza por ser tranquilos, amables y pacientes. Los Piscis son sensibles a los sentimientos de los demás y responden con simpatía al tacto y al sufrimiento.");
        }
        else if (mes==3) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es PISCIS se caracteriza por ser personas llenas de energía y entusiasmo por la vida. Aventureros por naturaleza, les encantan los retos, la libertad y las nuevas ideas");
        }
        else if (mes==4) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es ARIES se caracteriza portener gran fuerza de voluntad, es práctico y decidido en la toma de decisiones.");
        }
        else if (mes==5) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es TAURO se caracteriza por ser contrario a los Aries, los Géminis empiezan con entusiasmo nuevas aventuras, pero tienden a aburrirse rápido por la falta de constancia.");
        }
        else if (mes==6) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es GEMINIS se caracteriza por ser personas complicadas de clasificar, si se atiende a su carácter. Los hay tímidos y aburridos , pero también brillantes y famosos .");
        }
        else if (mes==7) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es CANCER se caracteriza por ser el signo más dominante del Zodiaco. Es creativo y extrovertido. Tienen ambición, fuerza, valentía y seguridad en sus capacidades.");
        }
        else if (mes==8) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es LEO se caracteriza como persoonas observadoras, pacientes y les cuesta hacer amigos por su carácter frío que muestran a veces.");
        }
        else if (mes==9) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es VIRGO se caracteriza por ser el signo del Zodiaco más civilizado . Tienen encanto, elegancia, buen gusto y son amables y pacíficos, por lo que no es raro que ante conflictos sean imparciales y muestren su rechazo a ellos.");
        }
        else if (mes==10) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es LIBRA se caracteriza como una persona tranquila que parece alejada de la realidad, aunque nunca dejan de observar todo a su alrededor con el ojo crítico.");
        }
        else if (mes==11) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es ESCORPIO se caracteriza por ser signo más positivo de todo el Zodiaco . Cuando las cosas se ponen complicadas un Sagitario siempre sacará la mejor versión y se olvidará de la negatividad.");
        }
        else if (mes==12) {
            System.out.print("Naciste el "+dia+"/"+mes+"/"+año+" asi que tu signo es SAGITARIO se caracteriza por tener Estabilidad, seguridad y tranquilidad es lo que mejor define a un Capricornio .");
        }
        else{
            System.out.print("FECHA DE NACIMIENTO INCORRECTA INTENTE DE NUEVO.");
        }
        lec.close();
    }
}