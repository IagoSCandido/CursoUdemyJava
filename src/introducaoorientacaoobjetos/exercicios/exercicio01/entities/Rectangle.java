package introducaoorientacaoobjetos.exercicios.exercicio01.entities;

public class Rectangle {
    public double width;
    public double height;

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return width * 2 + height * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2.0) + Math.pow(height, 2.0));
    }

    public String toString() {
        return String.format("Area: %.2f%n" +
                "Perimetro: %.2f%n" +
                "Diagonal: %.2f%n", area(), perimeter(), diagonal());
    }

}
