package introducaoorientacaoobjetos.exercicios.exercicio02.entities;
// Fazer um programa para ler os dados de um funcionario(nome, salario bruto e imposto). Em seguida, mostrar os dados do funcionario (nome, salario liquido).
// Em seguida, aumentar o salario do funcionario com base em uma porcentagem dada (somente o slaario bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionario.
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        percentage /= 100;
        grossSalary += (grossSalary * percentage) - tax;


    }

    public String toString() {
        return String.format("Name: %s%n" +
                "Gross Salary: %.2f%n" +
                "Tax: %.2f%n", name, grossSalary, tax);
    }
}
