package secao05ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        //Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não
        Scanner sc = new Scanner(System.in);
            System.out.println("insira o numero: ");
            int numero = sc.nextInt();
        sc.close();
        if (numero < 0) System.out.println("O numero é negativo");
        else System.out.println("O numero é positivo");

    }
}
