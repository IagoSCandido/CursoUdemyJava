package secao13exerciciosenumeracoesecomposicoes.exercicio01.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subtotal() {
        return price * quantity;
    }

    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append(getProduct().getName())
                .append(", Quantuty: ").append(getQuantity())
                .append(", Subtotal: $").append(subtotal());
        return sb.toString();
    }
}
