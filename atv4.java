package atv4;
import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) {

            System.out.println("Quanto você ganha por hora?");
            Scanner valorHora = new Scanner(System.in);
            double vH = valorHora.nextDouble();

            System.out.println("quantas horas você trabalha por dia?");
            Scanner horaDia = new Scanner(System.in);
            double hD = horaDia.nextDouble();

            System.out.println("quantos dias da semana você trabalha?");
            Scanner diaSemana = new Scanner(System.in);
            double dS = diaSemana.nextDouble();

            double salario_ = vH*hD*dS*4;
                    System.out.printf("seu salário é: %s",salario_);
    }
}
