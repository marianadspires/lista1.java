//Construa um programa em Java para ler (via teclado) uma temperatura em
//graus Fahrenheit, calcular e mostrar o valor correspondente em graus Celsius sabendo que
//TempCelsius = 5 x (TempFahrenheit – 32) / 9. (DICA: Usar dados do tipo float para ter precisão
//nos resultados (%.1f)).
import java.util.Scanner;
public class lista_1_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        float g_celsius, g_Fahrenheit;

        System.out.println("Informe a temperatura em Fahrenheit:");
        g_Fahrenheit = scanner.nextFloat();

        g_celsius = (5 * (g_Fahrenheit - 32)) / 9;

        System.out.printf("A temperatura em Graus Celsius e: %.1f\n", g_celsius);


    }

}
