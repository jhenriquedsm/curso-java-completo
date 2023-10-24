package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class In {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String x;
        System.out.print("Insira uma string: ");
        x = sc.next();
        System.out.println("Você digitou: " + x);

        System.out.print("\nInsira um número inteiro: ");
        int y = sc.nextInt();
        System.out.println("Você digitou o número: " + y);

        System.out.print("\nInsira um número decimal: ");
        double z = sc.nextDouble();
        System.out.println("Você digitou o número: " + z);

        System.out.print("\nInsira um char: ");
        char a = sc.next().charAt(0);
        System.out.printf("Você digitou o char: %c \n", a);

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
