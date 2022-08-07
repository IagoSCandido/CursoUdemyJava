package introducaoorientacaoobjetos.exercicios.exercicio02;
// Fazer um programa para ler os dados de um funcionario(nome, salario bruto e imposto). Em seguida, mostrar os dados do funcionario (nome, salario liquido).
// Em seguida, aumentar o salario do funcionario com base em uma porcentagem dada (somente o slaario bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionario.

import introducaoorientacaoobjetos.exercicios.exercicio02.entities.Employee;

import java.util.Locale;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Employee employee = new Employee();

        employee.name = "Joao Silva";
        employee.grossSalary = 6000.00;
        employee.tax = 1000.00;

        System.out.println(employee);
        System.out.printf("Emproyee: %s, $ %.2f%n", employee.name, employee.grossSalary);



        double percentage = 10;
        employee.increaseSalary(percentage);
        System.out.printf("Which percentage to increase salary? %.2f%n", percentage);


        System.out.printf("Updated data: %s, $ %.2f", employee.name, employee.grossSalary);


    }
}
