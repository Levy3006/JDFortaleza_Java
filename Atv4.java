package atv4;
import java.util.Scanner;
public class Atv4 {
    public static void main(String[] args) {
        int i =1;
        double soma=0;
        do{
            System.out.println("digite o valor da " + i + "º" + " nota: ");
            Scanner valori = new Scanner(System.in);
            int n1 = valori.nextInt();
            i++;
            soma+=n1;
            if(i>4){
                System.out.println("a media é:" + soma/4);
            }

        }while(i<=4);

    }
}
