package secao13exerciciosenumeracoesecomposicoes.exercicio01;

import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.Client;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.Order;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.OrderItem;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.Product;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfWithTime =
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Reading client data;
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());
        System.out.println();

        Client client = new Client(clientName, clientEmail, clientBirthDate);

        // Reading OrderStatus;
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        System.out.println();

        // Reading Product, Orderitem, Order;
        Order order = new Order(new Date(), status, client);
        System.out.print("How many items to this order? ");
        int itemOrderQuantity = sc.nextInt();
        for (int i = 1; i <= itemOrderQuantity; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Product quantity: ");
            int productQuantity = sc.nextInt();
            // Classes instanciation
            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            order.addItem(orderItem);
        }
        sc.close();
        System.out.println(order);
    }


    public static void test() throws ParseException {
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfWithTime =
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);

        // Client
        System.out.println("Enteder client data: ");

        Client client = new Client("Alex Green",
                "alex@gmail.com",
                sdf.parse("15/03/1985"));

        // Product and Order
        System.out.println("Enter order data: ");

        Product p1 = new Product("TV", 1000.00);
        OrderItem item1 = new OrderItem(1, p1.getPrice(), p1);

        Product p2 = new Product("Mouse", 40.00);
        OrderItem item2 = new OrderItem(2, p2.getPrice(), p2);

        Order order1 = new Order(sdfWithTime.parse("20/04/2018 11:25:09"),
                OrderStatus.valueOf("PROCESSING"), client);

        order1.addItem(item1);
        order1.addItem(item2);


        Order order2 = new Order(sdfWithTime.parse("20/04/2018 11:25:09"),
                OrderStatus.valueOf("PROCESSING"), client);
        order2.addItem(item1);
        order2.addItem(item2);


        System.out.println(order1);

    }
}
