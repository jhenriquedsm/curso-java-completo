package estruturaCondicional.exercises;

import java.util.Scanner;

/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente
*/
public class exercise03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.print("Insira um número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Insira outro número inteiro: ");
        num2 = sc.nextInt();

        if (num1 > num2){
            if(num1 % num2 == 0){
                System.out.println("São Múltiplos");
            } else {
                System.out.println("Não são Múltiplos");
            }
        } else {
            if(num2 % num1 == 0){
                System.out.println("São Múltiplos");
            } else {
                System.out.println("Não são Múltiplos");
            }
        }
        sc.close();
    }
}
