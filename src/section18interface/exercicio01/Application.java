package section18interface.exercicio01;

import section18interface.exercicio01.model.entities.Contract;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    }
    public static void test(int number, Date date, double totalValue, int numberOfInstallments) {
        Contract contract = new Contract(number, date, totalValue);


    }
}
