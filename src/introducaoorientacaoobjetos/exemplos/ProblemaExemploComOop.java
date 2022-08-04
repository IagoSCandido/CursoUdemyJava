package introducaoorientacaoobjetos.exemplos;

import introducaoorientacaoobjetos.exemplos.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemploComOop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira os valores do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        double areaX = x.area();

        System.out.println("Insira os valores do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        double areaY = y.area();

        System.out.printf("Triangle X area: %.2f%n" +
                "Triangle Y area: %.2f%n", areaX, areaY);

        if (areaX > areaY) System.out.println("Larger area X");
        else System.out.println("Larger area Y");

    }
}
