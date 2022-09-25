
//3) Faça um programa que receba dois números inteiros
// e gere os números inteiros que estão no intervalo compreendido por eles.
//Solução: Levy Alves
package EstruturaDeRepetição;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Atv3 {
    public static void main (String[]args){
        try{
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite dois extremos positivos: ");
        int e1 = leitor.nextInt();
        int e2 = leitor.nextInt();
        if(e2<0 || e1<0){
            System.out.println("digite apenas números positivos!");
            System.exit(0);
        }
        if (e2 > e1) {
            intervaloCrescente(e2, e1);
        } else if (e1 > e2) {
            intervaloDecrescente(e1, e2);
        } else {
            System.out.println("o intervalo é zero!");
        }
    }catch(InputMismatchException e){
        System.out.println("Digite apenas números válidos! ");
    }
    }// a = e2, b= e1
static void intervaloCrescente (int a,int b){
    int[] num = new int[a - (b+1)];
    for (int i = b + 1 ; i <a; i++) {
        num[i-(b+1)] += i;
    }System.out.println(Arrays.toString(num));
}
//a=c  b=d
static void intervaloDecrescente(int d,int c){
    int[] num = new int[d - (c+1)];
    for (int i = c + 1 ; i <d; i++) {
        num[i-(c+1)] +=i;
    }System.out.println(Arrays.toString(num));
 }
}