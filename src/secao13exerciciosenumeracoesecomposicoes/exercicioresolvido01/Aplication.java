package secao13exerciciosenumeracoesecomposicoes.exercicioresolvido01;

import secao13exerciciosenumeracoesecomposicoes.exercicioresolvido01.entities.Department;
import secao13exerciciosenumeracoesecomposicoes.exercicioresolvido01.entities.HourContract;
import secao13exerciciosenumeracoesecomposicoes.exercicioresolvido01.entities.Worker;
import secao13exerciciosenumeracoesecomposicoes.exercicioresolvido01.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String department = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Level:");
        String level = sc.nextLine();
        System.out.println("Base salary:");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(name));

        System.out.println("how many contracts to this worker?");
        int contracts = sc.nextInt();
        for (int i = 1; i <= contracts ; i++) {
            System.out.println("Enter contract #" + i + " data: ");
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter month and year to calculate income (MM/YYYY)");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " +
                String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
