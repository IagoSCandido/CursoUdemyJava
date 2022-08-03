package ExerciciosEstrtuturasRepetitivas;

import java.util.Scanner;

//Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.
public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fatorial = 1;
        if (n <= 1) System.out.println(1);
        else {
            for (int i = 1; i <= n; i++) {
               fatorial *= i;
            }
            System.out.println(fatorial);
        }
        sc.close();

    }
}
