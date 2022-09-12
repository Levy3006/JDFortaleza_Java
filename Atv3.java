package atv3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv3 {

    public static void main(String[] args){
        try{
            System.out.println("Digite o 1º valor inteiro: ");
            Scanner valor1 = new Scanner(System.in);
            double v1 = valor1.nextDouble();
            System.out.println("Digite o 2º valor inteiro: ");
            Scanner valor2 = new Scanner(System.in);
            double v2 = valor2.nextDouble();
            double  Sum = v1 + v2;
            System.out.printf("A soma é: %s", Sum);
        }
    catch(InputMismatchException e){
            System.out.println("digite numeros inteiros validos!");
    }
    }
}
