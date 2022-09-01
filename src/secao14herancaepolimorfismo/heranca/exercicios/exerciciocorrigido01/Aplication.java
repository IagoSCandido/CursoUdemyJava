package secao14herancaepolimorfismo.heranca.exercicios.exerciciocorrigido01;

import secao14herancaepolimorfismo.heranca.exercicios.exerciciocorrigido01.entities.Employee;
import secao14herancaepolimorfismo.heranca.exercicios.exerciciocorrigido01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> emp = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        // Reading employee data
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data: ");
            System.out.print("Outsourced (y/n): ");
            char ch = sc.next().toLowerCase().charAt(0);
            //Validating answer.
            while (ch != 'y' && ch != 'n') {
                System.out.println
                        ("Incorrect! Answer must be 'y' or 'n'");
                ch = sc.next().charAt(0);
            }
            System.out.print("Name: ");
            sc.nextLine(); //Cleaning buffer from pending linebreaker.
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            // Validating if emp is out sourced.
            if (ch == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                emp.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            emp.add(new Employee(name, hours, valuePerHour));
        }
        sc.close();
        System.out.println(emp);
    }
}
