package OperadoresLogicos;
import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) {
        int i =1;
        double soma=0;
        int n1;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println("digite o valor da " + i + "º" + " nota: ");
            n1 = leitor.nextInt();
            i++;
            soma += n1;
            if(i>4){
                System.out.println("a media é:" + soma/4);
            }
        }while(i<=4);
    }
}
