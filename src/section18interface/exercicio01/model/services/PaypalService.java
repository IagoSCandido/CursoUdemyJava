package section18interface.exercicio01.model.services;

public class PaypalService implements OnlinePaymentsService {
    private static final Double PAYMENT_FEE = 0.02;
    private static final Double MONTHLY_INTEREST = 0.01;

    public Double paymentFee(Double amount) {
        return amount *PAYMENT_FEE;
    }
    public Double interest(Double amount, Integer months) {
        return amount * months * MONTHLY_INTEREST;
    }

}
