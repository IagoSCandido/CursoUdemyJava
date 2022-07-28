package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main (String[] args) {//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
        Locale.setDefault(Locale.US);
        int numeroDoFuncionario, horaTrabalhada;
        double salarioDoFuncionario, salarioHora;

        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira o numero do funcionario: %n");
        numeroDoFuncionario = sc.nextInt();
        System.out.printf("selecionado funcionario de numero: %d %n",numeroDoFuncionario );

        System.out.printf("Informe as horas trabalhadas %n");
        horaTrabalhada = sc.nextInt();

        System.out.printf("informe o salario do funcionario por hora: %n");
        salarioHora = sc.nextDouble();

        salarioDoFuncionario = horaTrabalhada * salarioHora;

        System.out.printf("O Funcionario: %d %n" +
                "trabalhou por %d horas e ira receber: U$ %.2f", numeroDoFuncionario, horaTrabalhada, salarioDoFuncionario);

    }
}


