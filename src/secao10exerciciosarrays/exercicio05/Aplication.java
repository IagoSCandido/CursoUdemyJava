package secao10exerciciosarrays.exercicio05;

//Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
//o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
//considerando a primeira posição como 0 (zero).
public class Aplication {
    public static void main(String[] args) {

        int n = 20;
        System.out.println("Quantos numeros a digitar? " + n);
        int[] arr = new int[n];

        for (int i = 0; i < n ; i++) {

            arr[i] += i;
        }
        int maxElementOfArray = arr[0];
        int indexOfMaxElementOfArray = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > maxElementOfArray) {
                maxElementOfArray = arr[i];
                indexOfMaxElementOfArray = i;
            }
        }
        System.out.printf("Max element of given array is: %d%n" +
                "Index position of max element is: %d", maxElementOfArray, indexOfMaxElementOfArray);
    }
}
