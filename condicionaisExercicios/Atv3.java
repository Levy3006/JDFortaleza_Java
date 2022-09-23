
// Faça um Programa que leia três números e mostre o maior deles.
//solução: Levy e Carlos filho

package condicionaisExercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        try {
            int n1, n2, n3;
            System.out.println("Digite os numeros");
            n1 = leitor.nextInt();
            n2 = leitor.nextInt();
            n3 = leitor.nextInt();
            if(n1>n2 && n1>n3 ) {
                System.out.println("o numero maior é" + n1);
            }
            else if(n2 > n1 && n2 > n3) {
                System.out.println("O numero maior é " + n2);
            }else if(n3 > n1 && n3 > n2) {
                System.out.println("O numero maior é "+ n3);
            }else if (n1==n2 && n2==n3) {
                System.out.println("os números não diferem! digite valores diferentes!");
            }else {
                System.out.println("valor invalido");
            }
        } catch (InputMismatchException e) {
            System.out.println("invalido");
        }
    }
}