//Construa um programa em Java que leia (via teclado) um comprimento em
//polegadas, calcule e mostre o comprimento correspondente em milímetros, considerando
//que 1 polegada equivale a 25,4 milímetros. (DICA: Usar dados do tipo float para ter precisão
//nos resultados (%.1f)).
import java.util.Scanner;
public class lista01_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float c_milimetros, c_polegadas, t_polegadas = (float) 25.4;

        System.out.println("Informe o comprimento em polegadas:");
        c_polegadas = scanner.nextFloat();

        c_milimetros = c_polegadas * t_polegadas;

        System.out.printf("O comprimento em milimetros e: %.1f\n", c_milimetros);

    }

}
