package section18interface.exercicioresolvidopart2.model.services.impl;

import section18interface.exercicioresolvidopart2.model.entities.CarRental;
import section18interface.exercicioresolvidopart2.model.entities.Invoice;
import section18interface.exercicioresolvidopart2.model.services.TaxService;

public class RentalService {
    private Double pricePerDay;
    private Double pricePerHour;
    private TaxService taxService;

    private final Double MS_IN_HOUR = 1000.0 * 60 * 60;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService) {
        super();
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {
        double hours = carRental.rentalDuration() / MS_IN_HOUR;
        double basicPayment;

        if (hours <= 12.0) basicPayment = Math.ceil(hours) * pricePerHour;
        else basicPayment = Math.ceil(hours / 24) * pricePerDay;

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
        }
    }


