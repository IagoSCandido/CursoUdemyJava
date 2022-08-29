package secao13exerciciosenumeracoesecomposicoes.exercicio01;

import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.Client;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.Order;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.OrderItem;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.Product;
import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Aplication {
    public static void main(String[] args) throws ParseException {
        test();
    }

    public static void test() throws ParseException {
        SimpleDateFormat sdf =
                new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdfWithTime =
                new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Locale.setDefault(Locale.US);

        // Client
        System.out.println("Enteder client data: ");

        Client client = new Client("Alex Green", "alex@gmail.com", sdf.parse("15/03/1985"));

        // Product and Order
        System.out.println("Enter order data: ");

        Product p1 = new Product("TV", 1000.00);
        OrderItem item1 = new OrderItem(1, p1.getPrice());

        Product p2 = new Product("Mouse", 40.00);
        OrderItem item2 = new OrderItem(2, p2.getPrice());

        Order order1 = new Order(sdfWithTime.parse("20/04/2018 11:25:09"), OrderStatus.valueOf("PROCESSING"), item1, client, p1);

        order1.addItem(item1);
        order1.addItem(item2);


        Order order2 = new Order(sdfWithTime.parse("20/04/2018 11:25:09"), OrderStatus.valueOf("PROCESSING"), item2, client, p2);
        order2.addItem(item1);
        order2.addItem(item2);


        System.out.println(order1);

    }
}
