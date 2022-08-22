package exerciciosarrays.exercicio07;
//Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
//mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
//os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
public class Aplication {
    public static void main(String[] args) {
        int n = 4;
        double[] arr = new double[] {10.0, 15.5, 13.2, 9.8};
        double media = 0.0;
        for (int i = 0; i < arr.length ; i++) {
            media += arr[i] / n;
        }
        System.out.printf("Media:%.3f%n", media);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < media) System.out.printf("Abaixo da media: %.2f%n", arr[i]);

        }

    }
}
