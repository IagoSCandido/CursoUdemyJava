package ExerciciosEstrtuturasRepetitivas;

import java.util.Scanner;

//Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//X, se for o caso
public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x <= 1 || x >= 100 )  {
            x = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i <= x; i++ ) {
            if (i % 2 != 0 ) System.out.println(i);
        }

    }
}
