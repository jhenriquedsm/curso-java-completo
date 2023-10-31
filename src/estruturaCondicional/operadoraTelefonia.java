package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class operadoraTelefonia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira a quantidade de minutos: ");
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
        }
        System.out.printf("Valor a pagar: R$ %.2f", conta);
        sc.close();
    }
}