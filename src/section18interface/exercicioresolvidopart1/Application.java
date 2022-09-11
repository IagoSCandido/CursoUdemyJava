package section18interface.exercicioresolvidopart1;

import section18interface.exercicioresolvidopart1.model.entities.CarRental;
import section18interface.exercicioresolvidopart1.model.entities.Vehicle;
import section18interface.exercicioresolvidopart1.model.services.BrazilTaxService;
import section18interface.exercicioresolvidopart1.model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:ss");

        testScenario("1", sdf.parse("25/06/2018 10:30"), sdf.parse("25/06/2018 14:40"), 10.0, 130.0, "Civic");
        testScenario("2", sdf.parse("25/06/2018 10:30"), sdf.parse("27/06/2018 11:40"), 10.0, 130.0, "Civic");

    }

    public static void testScenario(String scenario, Date dateStart, Date dateFinish, double pricePerHour, double pricePerDay, String carModel) {

        CarRental carRental = new CarRental(dateStart, dateFinish, new Vehicle(carModel));
        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(carRental);
        System.out.printf("%s INVOICE%n" +
                "Basic payment: %.2f%n" +
                "Tax: %.2f%n" +
                "Total payment: %.2f%n%n"
                ,scenario, carRental.getInvoice().getBasicPayment(), carRental.getInvoice().getTax(), carRental.getInvoice().getTotalPayment());

    }
}
