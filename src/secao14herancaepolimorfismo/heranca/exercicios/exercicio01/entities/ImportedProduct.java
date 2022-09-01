package secao14herancaepolimorfismo.heranca.exercicios.exercicio01.entities;

public class ImportedProduct extends Product {
    private Double customsFee;
    private Product product;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public Double totalPrice() {
        return product.getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return super.priceTag() + String.format("(Custmons fee: $%.2f)", customsFee);
    }

    @Override
    public String toString() {
        return priceTag();
    }
}
