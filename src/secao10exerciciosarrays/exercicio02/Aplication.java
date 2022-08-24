package secao10exerciciosarrays.exercicio02;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
//- Imprimir todos os elementos do vetor
//- Mostrar na tela a soma e a média dos elementos do vetor
public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = 4;
        double[] arr = new double[n];
        double soma = 0.0;
        double media = 0.0;
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            arr[i] = sc.nextDouble();
            soma += arr[i];
            media += arr[i] / n;
        }
        System.out.printf("Valores = %s%n" +
                "Soma = %.2f%n" +
                "Media = %.2f%n", Arrays.toString(arr), soma, media);

        sc.close();
    }
}
