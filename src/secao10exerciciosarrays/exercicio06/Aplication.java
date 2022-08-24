package secao10exerciciosarrays.exercicio06;

import java.util.Arrays;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
public class Aplication {
    public static void main(String[] args) {
        int n = 6;
        int[] arrA = new int[] {8, 2, 11, 14, 13, 20};
        int[] arrB = new int[] {5, 10, 3, 1, 10, 7};
        int[] arrC = new int[n];

        for (int i = 0; i < n ; i++) {
            arrC[i] = arrA[i] + arrB[i];

        }
        System.out.println(Arrays.toString(arrC));

    }
}
