//Construa um programa em Java para ler (via teclado) 3 valores os quais
//correspondem ao número de convidados para um churrasco, sendo homens, mulheres e
//crianças. Sabendo que, em média, um homem come 650 gramas de carne, uma mulher come
//420 gramas de carne, e uma criança come 290 gramas de carne, calcule a quantidade de carne
//necessária para o churrasco em quilogramas e mostre o resultado.
import java.util.Scanner;
public class ista01_09 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int q_de_homens, q_de_mulheres, q_de_criancas, total_de_carne;
        int media_de_homens = 650, media_de_mulheres = 420, media_de_criancas = 290;

        System.out.println("Informe o numero de convidados homens:");
        q_de_homens = scanner.nextInt();
        System.out.println("Informe o numero de convidados mulheres:");
        q_de_mulheres = scanner.nextInt();
        System.out.println("Informe o numero de convidados criancas:");
        q_de_criancas = scanner.nextInt();

        total_de_carne = (q_de_homens * media_de_homens) + (q_de_mulheres * media_de_mulheres) + (q_de_criancas * media_de_criancas);

        System.out.printf("O total de carne sugerida em gramas e: " + total_de_carne);
    }
}
