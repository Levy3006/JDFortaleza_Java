package condicionaisExercicios;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
public class LocalDateExe {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Qual o seu Nome? :");
            String nome = leitor.nextLine();

            LocalTime hoje = LocalTime.now();
            int h = hoje.getHour();
            int m = hoje.getMinute();

            Locale brasil = new Locale("pt","BR");

            LocalDate dataHoje = LocalDate.now();
            String diaSemana = String.valueOf(dataHoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
            String diaMes = String.valueOf(dataHoje.getMonthValue());
            String mes = String.valueOf(dataHoje.getMonth().getDisplayName(TextStyle.FULL, brasil));
            String ano = String.valueOf(dataHoje.getYear());



            if(h>=0 && h<=12){
                System.out.printf("Bom Dia %s!",nome);
            }else if(h>12 && h<=18){
                System.out.printf("Boa Tarde %s!",nome);
            }else if(h>18 && h<=23){
                System.out.printf("Boa Noite %s!",nome);
            }
            System.out.printf("%n");
            System.out.printf("hoje é %s, dia %s de %s de %s!",diaSemana,diaMes,mes,ano);
            System.out.printf("%n");

            if (h>=0 && h<=9 && m>=0 && m<=9) {
                System.out.println("Agora é: " + "0" + h + ":" + "0" + m);
            }else if ( h>=0 && h<=9 && m>9) {
                System.out.println("Agora é: " + "0" + h + ":" + m);
            }else if (h>9 && m>=0 && m<=9) {
                System.out.println("Agora é: " + h + ":" + "0" + m);
            }else if (h>9 && m>9) {
                System.out.println("Agora é: " + h + ":" + m);
            }else{
                System.out.println("horário inválido");
            }
        }
    }

