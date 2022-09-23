//8) Faça um programa para a leitura de duas notas parciais de um aluno.
// O programa deve calcular a média alcançada por aluno e apresentar:
//   a) A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//   b) A mensagem "Reprovado", se a média for menor do que sete;
//   c) A mensagem "Aprovado com Distinção", se a média for igual a dez.

// Solução proposta por:Levy Alves e Carlos Filho
package condicionaisExercicios;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv8 {
    public static void main(String[] args) {
        try{
            int i = 1;
            double soma = 0;
            double n1;
            double media;
            Scanner leitor = new Scanner(System.in);
            do{
                System.out.println("digite o valor da " + i + "º" + " nota: ");
                n1 = leitor.nextDouble();
                if(n1 < 0){
                    System.out.println("Digite valores maiores que zero!");
                    break;
                }else if(n1>10){
                    System.out.println("Digita notas de 0 a 10!");
                    break;
                }else{
                    i++;
                    soma += n1;
                    media = soma / 4;
                    if (i == 5) {
                        System.out.println("Sua média é:" + media);
                        if (media == 10) {
                            System.out.printf("Aprovado com Distinção! Parabéns, sua média é %s !", media);
                        } else if (media >= 7 && media < 10) {
                            System.out.println("Parabéns, Voçê foi Aprovado!");

                        }else if (media < 7 && media >= 0) {
                            System.out.println("Você foi Reprovado. Estude mais!");
                        }else{
                            System.out.println("Digite uma nota válida!");
                        }
                    } else {
                    }
                }
            }
            while (i <= 4);
        }catch (InputMismatchException e){
                System.out.println("por favor, digite notas válidas!");
        }
    }
}
