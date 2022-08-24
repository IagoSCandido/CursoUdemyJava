package secao06ExerciciosEstrtuturasRepetitivas;

import java.util.Scanner;

// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        int x, y;
        x = sc.nextInt();
        y = sc.nextInt();
            do {
                if (x > 0 && y > 0) System.out.println("Primeiro");
                else if (x < 0 && y > 0 ) System.out.println("Segundo");
                else if (x < 0 && y < 0) System.out.println("Terceiro");
                else if (x > 0 && y < 0) System.out.println("Quarto");
                else return;
                x = sc.nextInt();
                y = sc.nextInt();
            } while (x != 0 || y != 0);

        sc.close();
    }
}
