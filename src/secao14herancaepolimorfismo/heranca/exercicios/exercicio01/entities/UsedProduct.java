package secao14herancaepolimorfismo.heranca.exercicios.exercicio01.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    private Date manutafctureDate;
    private Product product;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, Date manutafctureDate) {
        super(name, price);
        this.manutafctureDate = manutafctureDate;
    }

    public Date getManutafctureDate() {
        return manutafctureDate;
    }

    public void setManutafctureDate(Date manutafctureDate) {
        this.manutafctureDate = manutafctureDate;
    }

    @Override
    public String priceTag() {
        return String.format("%s (used) %.2f (Manufacture date: %s )"
                , product.getName(), product.getPrice(), sdf.format(manutafctureDate));
    }

    @Override
    public String toString() {
        return priceTag();
    }
}
