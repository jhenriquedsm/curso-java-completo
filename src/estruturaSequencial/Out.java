package estruturaSequencial;

import java.util.Locale;

public class Out {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println(y);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        System.out.println("Resultado da soma = " + (x + y));
        System.out.printf("Resultado da soma = %.2f \n\n", (x + y));

        String nome = "José";
        int idade = 19;
        double renda = 1532.99;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais\n", nome, idade, renda);
    }
}