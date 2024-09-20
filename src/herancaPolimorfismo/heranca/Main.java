package herancaPolimorfismo.heranca;

public class Main {
    public static void main(String[] args) {

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0,200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 1000.0, 0.1);

        // DOWNCASTING
        BusinessAccount bacc1 = (BusinessAccount) acc2;
        bacc1.loan(100.0);

        // BusinessAccount bacc2 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount bacc2 = (BusinessAccount) acc3;
            bacc2.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount sacc = (SavingsAccount) acc3;
            sacc.updateBalance();
            System.out.println("Update!");
        }

        acc.withdraw(200);
        System.out.println(acc.getBalance());

        Account sacc = new SavingsAccount(1005, "Zé", 1000.0, 0.1);
        sacc.withdraw(200);
        System.out.println(sacc.getBalance());

        acc2.withdraw(200);
        System.out.println(acc2.getBalance());
    }
}