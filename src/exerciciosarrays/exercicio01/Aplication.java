package exerciciosarrays.exercicio01;

import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
public class Aplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] arr = new int[n];


        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) System.out.println(arr[i]);

        }

        sc.close();
    }
}
