
//7) Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro
// entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.
// A saída deve ser conforme o exemplo abaixo:
 //       Tabuada de 5:
  //      5 X 1 = 5
   //     5 X 2 = 10
    //    ...
     //   5 X 10 = 50
//Solução: Levy Alves e Carlos Filho

package EstruturaDeRepetição;
import java.util.Scanner;
public class GeradordeTabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número positivo: ");
        int k = leitor.nextInt();
        System.out.println("a tabuada de " + k + " é : ");
        for (int i = 0; i<=10; i++ ) {
            System.out.println(k + " x " + i + " = " + (k * i));
        }
    }
}
