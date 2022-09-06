package secao14herancaepolimorfismo.abstracao.exercicio01;

import secao14herancaepolimorfismo.abstracao.exercicio01.entities.Company;
import secao14herancaepolimorfismo.abstracao.exercicio01.entities.Individual;
import secao14herancaepolimorfismo.abstracao.exercicio01.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numberOfTaxPayers = sc.nextInt();

        for (int i = 1; i <= numberOfTaxPayers; i++) {
            System.out.print("Tax payer #" + i +  " data: ");
            System.out.print("Individual or company (i/c): ");
            char tPayerType = sc.next().toLowerCase().charAt(0);
            System.out.print("Name:" );
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();
            if (tPayerType == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                taxPayers.add(new Company(name, annualIncome, numberOfEmployees));
            }
        }

        double totalTax = 0.0;
        for(TaxPayer taxPayer: taxPayers) {
            totalTax += taxPayer.tax();
            System.out.println("TAXES PAID:");
            System.out.printf("%s, $%.2f%n", taxPayer.getName(), taxPayer.tax());
        }

        System.out.printf("TOTAL TAXES: $%.2f", totalTax);
    }

}
