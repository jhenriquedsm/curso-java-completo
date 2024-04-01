package memoryArrayListas.exercises.exercise13;

import java.util.Locale;
import java.util.Scanner;

/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
*/

public class people_data {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double heigths[] = new double[n];
        char genres[] = new char[n];
        int numMale = 0;
        int numFemale = 0;

        // iteração para pegar os dados
        for (int i = 0; i < n; i ++){
            System.out.print("Altura da " + (i + 1) + "ª pessoa: ");
            double height = sc.nextDouble();
            heigths[i] = height;
            System.out.print("Genero da " + (i + 1) + "ª pessoa: ");
            char gen = sc.next().charAt(0);
            genres[i] = gen;
        }
        double minHeight = heigths[0];
        double maxHeight = heigths[0];

        // iteração para salvar a maior e menor altura
        for (int i = 0; i < heigths.length; i++){
            if (heigths[i] > maxHeight){
                maxHeight = heigths[i];
            }
            if (heigths[i] < minHeight){
                minHeight = heigths[i];
            }
        }

        // iteração para salvar a média das alturas das mulhres e número de homens
        double sum = 0;
        for (int i = 0; i < genres.length; i++){
            if (genres[i] == 'F' || genres[i] == 'f'){
                sum += heigths[i];
                numFemale++;
            }
            if (genres[i] == 'M' || genres[i] == 'm') {
                numMale++;
            }
        }
        double avgFemale = sum / numFemale;

        System.out.printf("Menor altura = %.2f%n", minHeight);
        System.out.printf("Maior altura = %.2f%n", maxHeight);
        System.out.printf("Média das alturas das mulheres = %.2f%n", avgFemale);
        System.out.printf("Número de homens = %d", numMale);

        sc.close();
    }
}
