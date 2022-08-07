package introducaoorientacaoobjetos.exemplos.exemplo02.aplication;

import introducaoorientacaoobjetos.exemplos.exemplo02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);


        System.out.printf("Enter the number of products to be added in stock: %n");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.printf("Updated data: %s%n%n", product);

        System.out.printf("Entender the number of products to be removed from stock: %n");
        quantity = sc.nextInt();
        product.removeProducts(quantity);


        System.out.printf("Updated data: %s%n", product);







    }
}
