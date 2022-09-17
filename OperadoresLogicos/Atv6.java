package OperadoresLogicos;
import java.util.Scanner;
public class Atv6 {
    public static void main(String[] args) {
        double vH,hD,dS,salario_;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Quanto você ganha por hora?");
        vH = leitor.nextDouble();
        System.out.println("quantas horas você trabalha por dia?");
        hD = leitor.nextDouble();
        System.out.println("quantos dias na semana você trabalha?");
        dS = leitor.nextDouble();
        salario_ = vH*hD*dS*4;
        System.out.printf("seu salário é: %s",salario_);
    }
}
