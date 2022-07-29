package ExerciciosEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        //
        Locale.setDefault(Locale.US);

        double renda, impostoDeRenda;
        Scanner sc = new Scanner(System.in);

            System.out.println("insira sua renda: ");
            renda = sc.nextDouble();

        sc.close();

        if (renda <= 2000.00) impostoDeRenda = 0.0;
        else if (renda <= 3000.00) impostoDeRenda = (renda - 2000.0) * 0.08;
        else if (renda <= 4500.00) impostoDeRenda = (renda - 3000.0)  * 0.18 + 1000.0 * 0.08;
        else  impostoDeRenda = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;

        if (renda == 0.0) System.out.println("Isento");
        else System.out.printf("R$: %.2f", impostoDeRenda);


    }
}

