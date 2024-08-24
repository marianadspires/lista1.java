//Construa um programa em Java para ler (via teclado) quatro números do tipo
//inteiro, calcule e mostre o resultado da média aritmética entre eles. Usar “float” para o tipo
//de dado da variável que irá armazenar o resultado da média aritmética e imprimir o resultado
//com duas casas decimais depois da vírgula (%.2f).
import java.util.Scanner;
public class lista01_03 {
    public static void main(String[] args) {
        // scanner é para ler o numero que o usuario irá digitar.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Informe o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.print("Informe o quarto número: ");
        int num4 = scanner.nextInt();

        float media = (num1 + num2 + num3 + num4) / 4.0f;

        System.out.printf("A média aritmética dos quatro números é: %.2f%n", media);

    }

}
