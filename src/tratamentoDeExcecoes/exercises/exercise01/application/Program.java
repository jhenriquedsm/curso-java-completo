package tratamentoDeExcecoes.exercises.exercise01.application;

import tratamentoDeExcecoes.exercises.exercise01.model.entities.Account;
import tratamentoDeExcecoes.exercises.exercise01.model.exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int numberAccount = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            Double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            Double withdrawLimit = sc.nextDouble();

            Account account = new Account(numberAccount, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            Double amount = sc.nextDouble();
            account.withDraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));

        } catch (AccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }
        sc.close();
    }
}