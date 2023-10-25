package estruturaSequencial.exercices;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
*/
public class exercise04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numFuncionario, horasTrabalhadas;
        double valorHora, salario;

        System.out.print("Insira o número do funcionário: ");
        numFuncionario = sc.nextInt();
        System.out.print("Insira o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();
        System.out.print("Insira o valor por hora: ");
        valorHora = sc.nextDouble();

        salario = valorHora * horasTrabalhadas;

        System.out.println("NUMBER: " + numFuncionario);
        System.out.printf("SALARY: U$ %.2f", salario);
    }
}
