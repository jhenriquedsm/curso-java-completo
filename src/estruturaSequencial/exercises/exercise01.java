package estruturaSequencial.exercises;

import java.util.Scanner;

/*
Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos.
*/
public class exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y, soma;
        System.out.print("Insira um número inteiro: ");
        x = sc.nextInt();
        System.out.print("Insira outro número inteiro: ");
        y = sc.nextInt();
        soma = x + y;
        System.out.println("SOMA = " + soma);
    }
}
