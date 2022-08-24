package secao10exerciciosarrays.exercicio08;
//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
public class Aplication {
    public static void main(String[] args) {
        int n =  6;
        double nDouble = n;
        int[] arr = new int[] {8, 2, 11, 14, 13, 20};
        int[] arrB = new int[] {7, 9, 11};
        int[] arrTest = arr;

        int count = 0;
        double sum = 0.0;
        for (int i = 0; i < arrTest.length; i++) {
            if (arrTest[i] % 2 == 0) {
                count = i;
                sum += arr[i];
            }
        }
        double evenMedia = sum / nDouble;
        if (count > 0) System.out.printf("Media dos pares: %.2f%n", evenMedia);
        else System.out.println("NENHUM NUMERO PAR");
    }
}
