package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class Exercicio2 {
    //Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
    //casas decimais.
    //Fórmula da área: area = π . raio2
    //Considere o valor de π = 3.14159
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double area, raio;
            raio = sc.nextDouble();
            area = Math.PI * (Math.pow(raio, 2.0));
        System.out.printf("%.4f", area);
        sc.close();
    }
}
