package OperadoresLogicos;
import java.util.Scanner;
public class Atv7 {
    public static void main(String[] args) {
        String nome;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        nome=leitor.nextLine();
        System.out.printf("Boa Noite %s!",nome);
    }
}
