//Construa um programa em Java para ler (via teclado) o raio de um círculo,
//calcular a área deste círculo e mostrar o resultado. (DICA: Cálculo da área = (PI * (raio * raio)).
//Usar dados do tipo float para ter precisão nos resultados (%.2f). Usar pi = 3.141592).

import java.util.Scanner;
public class lista1_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float raio, area_do_circulo, pi = (float) 3.141592;

        System.out.println("Informe o raio do círculo:");
        raio = scanner.nextFloat();

        area_do_circulo = pi * (raio * raio);

        System.out.printf("A área do círculo: %.2f\n", area_do_circulo);

    }
}
