package secao13exerciciosenumeracoesecomposicoes.exercicio01.entities;

import secao13exerciciosenumeracoesecomposicoes.exercicio01.entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf =
            new SimpleDateFormat("dd/MM/yyyy");
    private static SimpleDateFormat sdfWithTime =
            new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private OrderItem item;
    private Client client;
    private Product product;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
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
                .append("Client: ").append(client).append("\n")
                //Client date formatting
//                .append(" ").append("(").append(sdf.format(getClient().getBirthDate())).append(")")
//                .append(" - ").append(getClient().getEmail()).append("\n")
                //Order items formatting
                .append("Order items:").append("\n");
        for (OrderItem i : items) {
            sb.append(i).append("\n");
        }
        sb.append("Total price: $").append(total());
        return sb.toString();
    }
}
