//4) Faça um Programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
// Segunda Solução proposta por Levy Alves e Carlos Filho e Rafael de Jesus;
package condicionaisExercicios;
import java.util.Scanner;
public class Atv4Solução2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu Sexo? ");
        String Sexo = leitor.nextLine();
        if(Sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo: Masculino!");
        }else if(Sexo.equalsIgnoreCase("f")){
            System.out.println("Sexo: Feminino");
        }else{
            System.out.println("Digite um Sexo Válido!");
        }
    }
}
