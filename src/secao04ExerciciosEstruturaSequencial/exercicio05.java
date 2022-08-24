package secao04ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main (String [] args) {
        //Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);
        int codigoPeca1, codigoPeca2, quantidadePeca1, quantidadePeca2;
        double valorPeca1, valorPeca2, totalCompra;
            Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código do produto, quantidade e valor: ");
        codigoPeca1 = sc.nextInt();
        quantidadePeca1 = sc.nextInt();
        valorPeca1 = sc.nextDouble();

        System.out.println("Insira o código do segundo produto, quantidade e valor");
        codigoPeca2 = sc.nextInt();
        quantidadePeca2 = sc.nextInt();
        valorPeca2 = sc.nextDouble();
            sc.close();
        totalCompra = (quantidadePeca1 * valorPeca1) + (quantidadePeca2 * valorPeca2);

        System.out.printf("VALOR A PAGAR: U$ %4.2f", totalCompra);



    }
}
