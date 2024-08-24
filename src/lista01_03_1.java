//A mesma especificação do exercício anterior (Lista1_03) só que
//agora usando números do tipo float (com duas casas decimas depois da vírgula (%.2f)).
import java.util.Scanner;
public class lista01_03_1 {
    public static void main(String[] args) {
        // scanner é para ler o numero que o usuario irá digitar.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número:");
        float num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        float num2 = scanner.nextInt();

        System.out.print("Informe o terceiro número: ");
        float num3 = scanner.nextInt();

        System.out.print("Informe o quarto número: ");
        float num4 = scanner.nextInt();

        float media = (num1 + num2 + num3 + num4) / 4.0f;

        System.out.printf("A média aritmética dos quatro números é: %.2f%n", media);

    }



}
