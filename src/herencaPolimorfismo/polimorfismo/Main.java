package herencaPolimorfismo.polimorfismo;

import herencaPolimorfismo.heranca.Account;
import herencaPolimorfismo.heranca.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account x = new Account(1020, "Henrique", 1000.0);
        Account y = new SavingsAccount(1023, "Amanda", 1000.0, 0.01);

        x.withdraw(50.0);
        y.withdraw(50.0);

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}