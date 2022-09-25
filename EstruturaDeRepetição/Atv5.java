
//5) Faça um programa que leia 5 números e informe a soma e a média dos números.
//Solução: Levy Alves

package EstruturaDeRepetição;
import java.util.Scanner;
public class Atv5 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Dígite 5 números:");

        for (int i = 1; i <= 5; i++) {
            sum += leitor.nextInt();
        }
        System.out.printf(" a Soma é: %s. ",sum);
        System.out.printf(" a Média é: %s",sum/5);
    }
}
