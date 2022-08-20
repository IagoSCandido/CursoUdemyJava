package exerciciosarrays.exercicio04;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Aplication {
    public static void main(String[] args) {
        int n = 20;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] += i + 1;
            System.out.println("Digite um numero: " + i);
        }

        int quantityOfEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                quantityOfEven += 1;
                System.out.printf("%d ", arr[i]);
            }
        }
        System.out.printf("%nQuantidade de pares: " + quantityOfEven);
    }
}
