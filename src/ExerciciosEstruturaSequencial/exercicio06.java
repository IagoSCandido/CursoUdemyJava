package ExerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {
     public static void main(String[] args) {
        //Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
         //mostre:
         //a) a área do triângulo retângulo que tem A por base e C por altura.
         //b) a área do círculo de raio C. (pi = 3.14159)
         //c) a área do trapézio que tem A e B por bases e C por altura.
         //d) a área do quadrado que tem lado B.
         //e) a área do retângulo que tem lados A e B.
         Locale.setDefault(Locale.US);
         double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
         Scanner sc = new Scanner(System.in);
         System.out.println("Insira os valores A, B e C a serem calculados:");
         a = sc.nextDouble();
         b = sc.nextDouble();
         c = sc.nextDouble();
         triangulo = a * c / 2;
         circulo =  Math.PI * (Math.pow(c, 2.0));
         trapezio = (a + b) * c / 2.0;
         quadrado = Math.pow(b, 2.0);
         retangulo = a * b;
         System.out.printf("TRIANGULO: %6.3f %n" +
                 "CIRCULO: %6.3f %n" +
                 "TRAPEZIO: %6.3f %n" +
                 "QUADRADO: %6.3f %n" +
                 "RETANGULO: %6.3f %n ", triangulo, circulo, trapezio, quadrado, retangulo);



    }
}
