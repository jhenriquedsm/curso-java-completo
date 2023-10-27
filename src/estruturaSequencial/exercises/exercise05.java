package estruturaSequencial.exercises;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
*/
public class exercise05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codPeca1, quantPeca1, codPeca2, quantPeca2;
        double valorPeca1, valorPeca2, total;

        System.out.print("Insira o código da peça 1: ");
        codPeca1 = sc.nextInt();
        System.out.print("Insira a quantidade de peças 1: ");
        quantPeca1 = sc.nextInt();
        System.out.print("Insira o valor unitário de peça 1: ");
        valorPeca1 = sc.nextDouble();
        System.out.print("Insira o código da peça 2: ");
        codPeca2 = sc.nextInt();
        System.out.print("Insira a quantidade de peças 2: ");
        quantPeca2 = sc.nextInt();
        System.out.print("Insira o valor unitário de peça 2: ");
        valorPeca2 = sc.nextDouble();

        total = (quantPeca1 * valorPeca1) + (quantPeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
    }
}
