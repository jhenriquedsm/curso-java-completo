package memoryArrayListas.exercises.exercise15.application;

import memoryArrayListas.exercises.exercise15.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario)
de N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários, conforme
exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa ser mudado
livremente. Um salário só pode ser aumentado com base em uma operação de aumento por porcentagem dada.
*/

public class salaryIncrease {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registred? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println();
            System.out.printf("Employee #%d:", i+1);
            System.out.print("\nId: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase: ");
        int idWanted = sc.nextInt();
        Integer pos = position(employeeList, idWanted);
        if (pos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            employeeList.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : employeeList){
            System.out.println(employee);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
