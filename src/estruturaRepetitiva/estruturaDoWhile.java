package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class estruturaDoWhile {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char opcao;
        do {
            System.out.print("Digite a temperatura em celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = 9.0 * celsius / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.2f%n", fahrenheit);
            System.out.print("Deseja repetir (s/n)? ");
            opcao = sc.next().charAt(0);
        } while (opcao != 'n');

        sc.close();
    }
}
