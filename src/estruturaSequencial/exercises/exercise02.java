package estruturaSequencial.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */
public class exercise02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double raio, area;
        final double PI = 3.14159;

        System.out.print("Insira o valor do raio do círculo: ");
        raio = sc.nextDouble();
        area = PI * (raio * raio);

        System.out.println("A = " + area);
    }
}
