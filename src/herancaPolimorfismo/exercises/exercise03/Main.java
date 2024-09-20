package herancaPolimorfismo.exercises.exercise03;

import herancaPolimorfismo.exercises.exercise03.entities.Company;
import herancaPolimorfismo.exercises.exercise03.entities.Individual;
import herancaPolimorfismo.exercises.exercise03.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            if (ch == 'i'){
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer employees = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, employees));
            }
        }

        System.out.println("\nTAXES PAID:");
        Double totalTax = 0.0;
        for (TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
            totalTax += taxPayer.tax();
        }
        System.out.println("\nTOTAL TAXES: $ " + String.format("%.2f", totalTax));

        sc.close();
    }
}