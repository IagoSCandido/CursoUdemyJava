package exerciciolists.exercicio01;

import exerciciolists.exercicio01.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employee = new ArrayList<>();

        // getting data
        System.out.println("How many employees will be registered? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i);
            System.out.println("ID: ");
            Integer id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine(); // cleaning buffer
            String name = sc.nextLine();
            System.out.println("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            employee.add(emp);
        }
        //
        System.out.println("Enter the employee id that will have salary increase :");
        int idSalary = sc.nextInt();

        // Check if emplyee id exists.
        Employee emp = employee.stream().filter(employees -> employees.getId() == idSalary).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist.");
            System.out.println();
        } else {
            System.out.println("Enter percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }
        sc.close();
        // Printing employees data updated
        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employees :
                employee) {
            System.out.println(employees);
        }

    }
}
