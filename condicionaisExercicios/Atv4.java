//4) Faça um Programa que verifique se uma letra digitada é "F" ou "M".
// Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
// 2º Solução proposta por:Levy Alves e Carlos Filho
package condicionaisExercicios;
import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) {
        String Sexo;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu sexo? Digite M para Masculino e F para feminino:");
        Sexo = leitor.nextLine();
        switch (Sexo.toLowerCase()){
            case "m":
                System.out.println("Sexo:Masculino");
                break;
            case "f":
                System.out.println("Sexo:Feminino");
                break;
            default:
                System.out.println("Sexo inválido!!");
        }
    }
}
