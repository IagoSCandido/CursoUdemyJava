package section18interface.exercicioresolvidopart1.model.services;

import section18interface.exercicioresolvidopart1.model.entities.CarRental;
import section18interface.exercicioresolvidopart1.model.entities.Invoice;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;
    private BrazilTaxService brazilTaxService;

    private final Double MS_IN_HOUR = 1000.0 * 60 * 60;

    public RentalService(Double pricePerDay, Double pricePerHour, BrazilTaxService brazilTaxService) {
        super();
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.brazilTaxService = brazilTaxService;
    }

    public void processInvoice(CarRental carRental) {
        double hours = carRental.rentalDuration() / MS_IN_HOUR;
        double basicPayment;

        if (hours <= 12.0) basicPayment = Math.ceil(hours) * pricePerHour;
        else basicPayment = Math.ceil(hours / 24) * pricePerDay;

        double tax = brazilTaxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
        }
    }


