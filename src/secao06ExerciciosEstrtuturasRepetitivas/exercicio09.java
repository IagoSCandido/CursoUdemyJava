package secao06ExerciciosEstrtuturasRepetitivas;

import java.util.Scanner;

//Ler um número inteiro N e calcular todos os seus divisores
public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 6;

        for (int i = 1; i <= 6; i++) {
            if (n % i == 0) System.out.println(i);
        }
        sc.close();
    }
}
