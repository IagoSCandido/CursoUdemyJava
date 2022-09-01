package secao14herancaepolimorfismo.heranca.exercicios.exercicio01;

import secao14herancaepolimorfismo.heranca.exercicios.exercicio01.entities.ImportedProduct;
import secao14herancaepolimorfismo.heranca.exercicios.exercicio01.entities.Product;
import secao14herancaepolimorfismo.heranca.exercicios.exercicio01.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Aplication {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char productType = sc.next().toLowerCase().charAt(0);
            //Validation option
            while (productType != 'c' && productType != 'u' && productType != 'i') {
                System.out.println("Invalid option, please select '(c/u/i)'");
                productType = sc.next().toLowerCase().charAt(0);
            }
            System.out.print("Name:");
            sc.nextLine(); // Cleaning buffer from pending line break;
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            // checking what was selected.
            if (productType == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manuFactureDate = sdf.parse(sc.next());
                products.add(new UsedProduct(name, price, manuFactureDate));
            } else if (productType == 'i') {
                System.out.print("Customs fe: ");
                double customFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customFee));
            } else products.add(new Product(name, price));
        }
        sc.close();
        for (Product product : products) {
            System.out.print(product.priceTag());
        }
    }
}
