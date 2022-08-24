package secao05ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        //Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
        //Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
        //ordem crescente ou decrescente.

        int a, b;

        Scanner sc = new Scanner(System.in);

            System.out.println("insira os numeros: ");
            a = sc.nextInt();
            b = sc.nextInt();

        sc.close();

        if (a / b == 0 || b / a  == 0) System.out.println("SÃO MULTIPLOS");
        else System.out.println("NÃO MULTIPLOS");
    }
}
