
//2) Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo
// Solução proposta por Levy e Carlos.
package condicionaisExercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv2 {
    public static void main(String[] args) {
        try {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            double n = leitor.nextDouble();
            System.out.println(n > 0 && n != 0 ? "positivo" : n == 0 ? "elemento neutro" : "negativo");
        }catch(InputMismatchException e){
            System.out.println("Digite um número válido seu arrombado!");
        }
    }
}
