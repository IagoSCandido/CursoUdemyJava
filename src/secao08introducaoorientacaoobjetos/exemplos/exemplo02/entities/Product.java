package secao08introducaoorientacaoobjetos.exemplos.exemplo02.entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

     public double totalValueInStock() {
        return price * quantity;
     }
     public void addProducts(int addProducts) {
         this.quantity += addProducts;
     }
     public void removeProducts(int removeProducts) {
         this.quantity -= removeProducts;
     }

    @Override
    public String toString() {
        return String.format("%s, $ %.2f, %d units, Total: %.2f", name, price, quantity, totalValueInStock());
    }
}
