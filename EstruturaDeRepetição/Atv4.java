
//4) Faça um programa que leia 5 números e informe o maior número.
//Solução elaborada por Carlos Filho e atualizada por levy alves.
package EstruturaDeRepetição;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            int n1 = 0;
            int maior = 0;
            int menor = -9999;
            System.out.println("digite os 5 numeros");
            for (int i = 1; i <= 5; i++) {
                n1 = leitor.nextInt();
                if (maior <= n1) {
                    maior = n1;
                } else if (n1 < maior && n1 > menor){
                    maior = n1;
                }
            }
            System.out.println("o numero maior foi: " + maior);
        }catch(InputMismatchException e){
            System.out.println("Digite apens números válidos!");
        }
    }
}
