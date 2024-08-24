//Construa um programa em Java que leia um número do tipo “inteiro” (via
//teclado) e o guarde em uma variável X. Calcule e mostre: (1) o conteúdo de X, (2) o quadrado
//de X, (3) o resto da divisão inteira de X por 3, (4) a metade de X, e (5) o resultado do produto
//de X pela metade de X.
import java.util.Scanner;
public class lista01_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Informe um numero para x:");
        x = scanner.nextInt();

        System.out.printf("O total de x e: %d\n", x );
        System.out.printf("O quadrado de x e: %d\n", (x * x));
        System.out.printf("O resto da divisao de x por 3: %d\n", (x % 3));
        System.out.printf("A metade de x e: %.1f\n", (float) x/2);
        System.out.printf("O produto de x e: %2f\n", (float) x * ((float) x/2));


    }
}