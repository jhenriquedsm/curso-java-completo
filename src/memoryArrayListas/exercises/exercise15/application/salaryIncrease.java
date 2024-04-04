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
            while (hasId(employeeList, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }
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

        Employee emp = employeeList.stream().filter(x -> x.getId() == idWanted).findFirst().orElse(null);

        // Integer pos = position(employeeList, idWanted);
        if (emp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            emp.increaseSalary(percent);
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

    public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}