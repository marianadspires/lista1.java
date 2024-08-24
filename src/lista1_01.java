//Construa programa em Java que leia (via teclado) dois números do tipo inteiro,
//calcule o produto entre eles e mostre o resultado.
import java.util.Scanner;
public class lista1_01 {
    public static void main(String[] args) {
        // scanner é para ler o numero que o usuario irá digitar.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma de " + num1 + " e " + num2 + " é: " + soma);
    }
}

