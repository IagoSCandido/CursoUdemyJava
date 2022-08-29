package secao13exerciciosenumeracoesecomposicoes.exercicio01.entities;

import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Order {
    private static final SimpleDateFormat sdf =
            new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat sdfWithTime =
            new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private OrderItem item;
    private Client client;
    private Product product;
    private final List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, OrderItem item, Client client, Product product) {
        this.moment = moment;
        this.status = status;
        this.item = item;
        this.client = client;
        this.product = product;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public OrderItem getItem() {
        return item;
    }

    public void setItem(OrderItem item) {
        this.item = item;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double total = 0.0;
        for (OrderItem i : items) total += i.subtotal();
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("ORDER SUMMARY").append("\n")
                //Order formatting
                .append("Order moment: ").append(sdfWithTime.format(moment)).append("\n")
                .append("Order status: ").append(status).append("\n")
                //CLient formatting
                .append("Client: ").append(client.getName())
                //Client date formatting
                .append(" ").append("(").append(sdf.format(client.getBirthDate())).append(")")
                .append(" - ").append(client.getEmail()).append("\n")
                //Order items formatting
                .append("Order items:").append("\n");
        for (OrderItem i : items) {
            sb.append(product.getName()).append(" ")
                    .append("$").append(product.getPrice())
                    .append(",").append("Subtotal: $")
                    .append(item.subtotal()).append("\n");
        }
        sb.append("Total price: $").append(total());
        return sb.toString();
    }
}
