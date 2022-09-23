//1) Faça um Programa que peça dois números e imprima o maior deles.
//Solução proposta por: Levy e Carlos filho
package condicionaisExercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv1 {
    public static void main(String[] args) {
        try {
            double n1, n2;
            System.out.println("digite o primeiro valor: ");
            Scanner leitor = new Scanner(System.in);
            n1 = leitor.nextDouble();
            System.out.println("digite o segundo valor: ");
            n2 = leitor.nextDouble();
            if (n2 > n1) {
                System.out.printf("%s é o maior valor!", n2);
            } else if (n1 > n2) {
                System.out.printf("%s é o maior valor!", n1);
            } else if (n1 == n2) {
                System.out.printf("Os numeros digitados não diferem. Não existe valor maior ou menor!", n1, n2);
            } else {
                System.out.println("digite numeros válidos");
            }
        }catch(InputMismatchException e){
            System.out.println("Digite números válidos!");
        }
    }
}
