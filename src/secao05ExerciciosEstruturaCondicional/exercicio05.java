package secao05ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        // Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
        //seguir, calcule e mostre o valor da conta a pagar.
        int codigoItem, quantidadeItem;
        double precoItem, totalCompra;
        Scanner sc = new Scanner(System.in);

            System.out.println("Insira o código do item e a quantidade:");
            codigoItem = sc.nextInt();
            quantidadeItem = sc.nextInt();

        sc.close();

        if (codigoItem == 1) {
            precoItem = 4.0;
            totalCompra = precoItem * quantidadeItem;
        } else if (codigoItem == 2) {
            precoItem = 4.5;
            totalCompra = precoItem * quantidadeItem;
        } else if (codigoItem == 3) {
            precoItem = 5.0;
            totalCompra = precoItem * quantidadeItem;
        } else if (codigoItem == 4) {
            precoItem = 2.0;
            totalCompra = precoItem * quantidadeItem;
        } else {
            precoItem = 1.5;
            totalCompra = precoItem * quantidadeItem;
        }
        System.out.printf("Total: U$ %.2f", totalCompra);

    }
}
