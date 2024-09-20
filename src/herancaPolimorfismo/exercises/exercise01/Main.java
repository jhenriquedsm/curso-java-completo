package herancaPolimorfismo.exercises.exercise01;

import herancaPolimorfismo.exercises.exercise01.entities.Employee;
import herancaPolimorfismo.exercises.exercise01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            Integer hours = sc.nextInt();
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            if (outsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee employee : employees){
            System.out.println(employee.getName() + " - $ " + employee.payment());
        }

        sc.close();
    }
}