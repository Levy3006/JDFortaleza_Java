
//6) Faça um Programa que leia três números e mostre o maior deles.
// solução proposta por Levy.
package condicionaisExercicios;
import java.util.Scanner;
public class Atv6e7 {
    public static void main(String[] args) {
        int[] n = new int[3];
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        while (i <= 2) {
            System.out.printf("Digite o %sº número: ", (i + 1));
            n[i] += leitor.nextInt();
            i++;
        }
        if (n[0] > n[1] && n[0] > n[2] && n[1] > n[2]) {
            System.out.println(n[0] + " é o maior número. "+ n[2] + " é o menor número");
        }else if (n[0] > n[1] && n[0] > n[2] && n[2] > n[1]) {
            System.out.println(n[0] + " é o maior número. "+ n[1] + " é o menor número");
        }else if (n[1] > n[2] && n[1] > n[0] && n[2] > n[0]) {
            System.out.println(n[1] + " é o maior número. "+ n[0] + " é o menor número");
        }else if (n[1] > n[2] && n[1] > n[0] && n[0] > n[2]) {
            System.out.println(n[1] + " é o maior número. "+ n[2] + " é o menor número");
        }else if (n[2] > n[1] && n[2] > n[0] && n[1] > n[0]) {
            System.out.println(n[2] + " é o maior número. "+ n[0] + " é o menor número");
        }else if (n[2] > n[1] && n[2] > n[0] && n[0] > n[1]) {
            System.out.println(n[2] + " é o maior número. "+ n[1] + " é o menor número");
        }else{
            System.out.println("digite numeros válidos!");
        }
    }
}