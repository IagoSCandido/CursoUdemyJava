package ExerciciosEstruturaSequencial;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args) {
        //Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        int A, B, C, D, diferenca;
        Scanner sc = new Scanner(System.in);
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();
            diferenca = A * B - C * D;
        System.out.println(diferenca);
    }
}
