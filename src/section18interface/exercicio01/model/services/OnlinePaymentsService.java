package section18interface.exercicio01.model.services;

public interface OnlinePaymentsService {
    Double paymentFee(Double amount);

    Double interest(Double amount, Integer months);
}

