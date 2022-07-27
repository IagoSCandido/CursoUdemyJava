
import java.util.Locale;

// exercicio de fixacao 24. saida de dados java udemy.
 public class ex01a24 {
    public static void main(String[] args) {

        Locale.getDefault();

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.printf("%s Which price is $ %f%n", product1, price1);
        System.out.printf("%s Which price is $ %f%n%n", product2, price2);

        System.out.printf("Record: %d years old, code: %d and gender: %s%n%n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %8.8f%n" +
                "Rounded (Three decimal places: %8.3f%n", measure, measure);
        System.out.printf(Locale.US,"US decimal point: %8.3f%n", measure);
    }
}

