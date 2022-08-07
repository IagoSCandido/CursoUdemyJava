package introducaoorientacaoobjetos.exemplos.exemplo01.aplication;

import java.util.Locale;
import java.util.Scanner;

// Fazer um programa para ler as medidas dos lados de dois triangulos X e Y(medidas validas).
// Em seguida, mostrar o valor das  areas dos dois triangulos e dizer qual dos dois triangulos possui maior area.
// A formula para calcular a area de um triangulo a partir das medidas de seus laods a,b e c; é formula Heron.
public class ProblemaExemploSemOop {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double a, a2, b, b2, c, c2, p, p2, area1, area2;
        a = 3.00;
        b = 4.00;
        c = 5.00;
        p = (a + b + c)/ 2;
        area1 = Math.sqrt(p * (p - a) * (p - b) * (p - c) );
        a2 = 7.50;
        b2 = 4.50;
        c2 = 4.02;
        p2 = (a2 + b2 + c2)/ 2;
        area2 = Math.sqrt(p2 * (p2 -a) * (p2 - b2) * (p2 - c2) );

        System.out.printf("Larger area: %.2f",Math.max(area1, area2));
//        if (area1 > area2) System.out.println(area1);
//        else System.out.println(area2);
    }
}
