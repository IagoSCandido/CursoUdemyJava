package introducaoorientacaoobjetos.exercicios.exercicio01;

import introducaoorientacaoobjetos.exercicios.exercicio01.entities.Rectangle;

import java.util.Locale;

// Fazer um programa para ler os valores da largura e altura de um retalngulo. Em seguida, mostrar na tela o valor de sua area, perimetro e diagonal.
// Usar uma classe Rectangle.
public class Aplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 3.00;
        rectangle.height = 4.00;

        System.out.println(rectangle);
    }
}
