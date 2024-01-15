package estruturaCondicional;

import java.util.Scanner;

public class desconto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preco;
        System.out.print("Insira o valor do preço: ");
        preco = sc.nextDouble();
        double desconto = (preco > 20) ? preco * 0.1 : preco * 0.05;

        System.out.println("O desconto é: " + desconto);
        sc.close();
    }
}
