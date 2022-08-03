package ExerciciosEstrtuturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
public class exercicio07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();
            double resultado  = (double) numerador / (double) denominador;

            if (denominador == 0) System.out.println("divisao impossivel");
            else System.out.println(resultado);

        }


        sc.close();
    }
}
