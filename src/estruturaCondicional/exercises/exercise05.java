package estruturaCondicional.exercises;

import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar
*/
public class exercise05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codItem, quantItem;
        double valorTotal;
        String nomeItem;

        System.out.print("Insira o código do item: ");
        codItem = sc.nextInt();
        System.out.print("Insira a quantidade do item: ");
        quantItem = sc.nextInt();

        switch (codItem){
            case 1:
                nomeItem = "Cachorro Quente";
                valorTotal = quantItem * 4;
                System.out.printf("Item: %s\nTotal: R$ %.2f", nomeItem, valorTotal);
                break;
            case 2:
                nomeItem = "X-Salada";
                valorTotal = quantItem * 4.50;
                System.out.printf("Item: %s\nTotal: R$ %.2f", nomeItem, valorTotal);
                break;
            case 3:
                nomeItem = "X-Bacon";
                valorTotal = quantItem * 5;
                System.out.printf("Item: %s\nTotal: R$ %.2f", nomeItem, valorTotal);
                break;
            case 4:
                nomeItem = "Torrada Simples";
                valorTotal = quantItem * 2;
                System.out.printf("Item: %s\nTotal: R$ %.2f", nomeItem, valorTotal);
                break;
            case 5:
                nomeItem = "Refrigerante";
                valorTotal = quantItem * 1.50;
                System.out.printf("Item: %s\nTotal: R$ %.2f", nomeItem, valorTotal);
                break;
            default:
                System.out.println("PRODUTO INEXISTENTE!");
        }
        sc.close();
    }
}
