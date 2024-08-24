//Construa um programa em Java que leia (via teclado) as horas, minutos e
//segundos em determinado momento do dia, e que calcule e mostre qual o total de segundos
//decorridos neste dia. (DICA: totalSegundos = (horas * 60 * 60) + (minutos * 60) + segundos).
import java.util.Scanner;
public class lista01_08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int horas, minutos, segundos, t_segundos;

        System.out.println("Informe as horas, minutos e segundos de um dia:");

        horas = scanner.nextInt();
        minutos = scanner.nextInt();
        segundos = scanner.nextInt();

        t_segundos = (horas * 60 *60) + (minutos * 60) + segundos;

        System.out.printf("O total em segundos de um dia e: " + t_segundos);


    }
}