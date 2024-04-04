package memoryArrayListas.exercises.exercise17;

/*
Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por
N colunas contendo números inteiros, podendo haver repetições. Em seguida, ler um número inteiro
X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita
e a abaixo de X, quando houver.
*/

import java.util.Locale;
import java.util.Scanner;

public class elementsMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Number to search: ");
        int x = sc.nextInt();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == x){
                    System.out.println("Position " + i + ", " + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if (j < matrix[i].length - 1){
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if (i < matrix.length - 1){
                        System.out.println("Down: " + matrix[i+1][j]);
                    }
                }
            }
        }
        sc.close();
    }
}
