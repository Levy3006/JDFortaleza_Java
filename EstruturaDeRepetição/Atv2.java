
//2) Faça um programa que imprima na tela os números de 1 a 30
// e do lado apresente a soma dos números existentes.
//solução: Levy Alves

package EstruturaDeRepetição;
public class Atv2 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i =1; i<31;i++){
            System.out.println(i);
            sum +=i;
        }System.out.println("A soma dos números de 1 a 30 é: "+sum);
    }
}
