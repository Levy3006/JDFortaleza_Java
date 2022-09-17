package OperadoresLogicos;
import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        System.out.println("Digite um Número inteiro: ");
        Scanner leitor = new Scanner(System.in);
        int n1 = leitor.nextInt();
        int sucessor_ = n1 + 1;
        int antecessor_ = sucessor_ - 2;
        System.out.printf("o Sucessor de %s é %s e o Antecessor de %s é %s",n1,sucessor_,n1,antecessor_);
    }
}
