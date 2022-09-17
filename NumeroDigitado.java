import java.util.Scanner;

public class NumeroDigitado {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double valor = input1.nextDouble();
        System.out.printf("você digitou: %s",valor);
    }
}