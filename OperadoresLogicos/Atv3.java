package OperadoresLogicos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        try{
            double v1,v2,Sum;
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite o 1º valor inteiro: ");
            v1 = leitor.nextDouble();
            System.out.println("Digite o 2º valor inteiro: ");
            v2 = leitor.nextDouble();
            Sum = v1 + v2;
            System.out.printf("A soma é: %s", Sum);
        }
        catch(InputMismatchException e){
            System.out.println("digite numeros inteiros validos!");
        }
    }
}
