package exerciciosarrays.exercicio11;

import exerciciosarrays.exercicio11.entities.User;

import java.util.Locale;
import java.util.Scanner;

// Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.
public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas psessoas serao digitadas?");
        int n = sc.nextInt();

        User[] user = new User[n];
        char userGender;
        double userHeight;
        for (int i = 0; i < user.length; i++) {
            System.out.println("Altura da " + (i + 1) + "a Pessoa:");
            userHeight = sc.nextDouble();
            System.out.println("Genero da " + (i + 1) + "a Pessoa:");
            userGender = Character.toUpperCase(sc.next().charAt(0));

            user[i] = new User(userHeight, userGender);
        }
        double smaller = 3.0;
        double taller = 0.0;
        double womanHeightAverage = 0.0;
        int manQuantity = 0;
        int womanQuantity = 0;
        for (int i = 0; i < user.length; i++) {
            if (smaller > user[i].getHeight()) smaller = user[i].getHeight();
            if (taller < user[i].getHeight()) taller = user[i].getHeight();
            if (user[i].getGender() == 'F') {
                womanQuantity++;
                womanHeightAverage += user[i].getHeight();
            }
            if (user[i].getGender() == 'M') {
                manQuantity++;
            }
        }

        womanHeightAverage /= womanQuantity;

        System.out.println("Menor altura: " + smaller);
        System.out.println("Maior altura: " + taller);
        System.out.printf("Media das alturas das mulhere: %.2f%n", womanHeightAverage);
        System.out.println("Numero de homens: " + manQuantity);

        sc.close();
    }
}
