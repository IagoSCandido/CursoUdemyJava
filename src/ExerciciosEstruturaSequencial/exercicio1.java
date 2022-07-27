package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class exercicio1 {
    // Exercício 01 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
    //mensagem explicativa
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, soma;
        System.out.println("Insira o primeiro valor a ser somado: ");
        numero1 = sc.nextInt();
        System.out.println("Insira o segundo valor a ser somado: ");
        numero2 = sc.nextInt();
        soma = numero1 + numero2;
        System.out.printf("Dados os valores %d e %d o resultado da soma é: %d", numero1, numero2, soma);
        sc.close();

    }
}