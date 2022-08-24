package secao10exerciciosarrays.exercicio03;

import secao10exerciciosarrays.exercicio03.entities.User;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver
public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = 5;
        String name;
        int age;
        double height;
        User[] arr = new User[n];

        double alturaMedia = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %dª Pessoa %n", i + 1);
            System.out.println("Nome?");
            name = sc.next();
            System.out.println("Idade?");
            age = sc.nextInt();
            System.out.println("Altura?");
            height = sc.nextDouble();

            arr[i] = new User(name, age, height);

            alturaMedia += height / n;
        }

        double usersWithLessThan16YearsOld = 0.0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i].getAge() < 16) {
                int count = 0;
                count += 1;

                usersWithLessThan16YearsOld += (count * 100.0) / n;

                System.out.println(arr[i].getName());
            }
        }
        String perc = "%";
        System.out.printf("Altura média: %.2f%n" +
                "Pessoas com menos de 16 anos: %.1f%s %n", alturaMedia, usersWithLessThan16YearsOld, perc);

        sc.close();
    }
}
