package atv4;
import java.util.Scanner;
public class atv4 {
    public static void main(String[] args) {
        
            Scanner leitor = new Scanner(System.in);

            System.out.println("Quanto você ganha por hora?");
            
            double vH = leitor.nextDouble();

            System.out.println("quantas horas você trabalha por dia?");
           
            double hD = leitor.nextDouble();

            System.out.println("quantos dias na semana você trabalha?");
            
            double dS = leitor.nextDouble();

            double salario_ = vH*hD*dS*4;
                    System.out.printf("seu salário é: %s",salario_);
    }
}
