package secao13exerciciosenumeracoesecomposicoes.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter department's name:");
        System.out.println("Enter worker data:");
        System.out.println("Name");
        String name;
        System.out.println("level:");
        String level;
        System.out.println("Base salary");
        double baseSalay;
        System.out.println("How many contracts to this worker?");
        int contractsQuantity = 3;
        for (int i = 0; i < contractsQuantity; i++) {
            System.out.println("Enter contract #" + i + "data:");

        }
    }
}
