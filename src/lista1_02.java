//Construa um programa em Java que leia (via teclado) três números do tipo
//inteiro, calcule e mostre o resultado da soma deles.
import java.util.Scanner;
public class lista1_02 {
    public static void main(String[] args) {
        // scanner é para ler o numero que o usuario irá digitar.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Informe o terceiro número: ");
        int num3 = scanner.nextInt();

        int soma = num1 + num2 + num3;

        System.out.println("A soma de " + num1 + " e " + num2 + " e " + num3 +" é: " + soma);

    }
}