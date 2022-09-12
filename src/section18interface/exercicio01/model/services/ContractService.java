package section18interface.exercicio01.model.services;

import section18interface.exercicio01.model.entities.Contract;
import section18interface.exercicio01.model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {
    private OnlinePaymentsService onlinePaymentsService;

    public ContractService(OnlinePaymentsService onlinePaymentsService) {
        this.onlinePaymentsService = onlinePaymentsService;
    }

    public void processContract(Contract contract, Integer months) {
        double baseQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            double quotaWithInterest = baseQuota + onlinePaymentsService.interest(baseQuota, i);
            double quotaWithPaymentFee = quotaWithInterest + onlinePaymentsService.paymentFee(quotaWithInterest);
            Date dueDate = addMonths(contract.getDate(), i);
            contract.getInstallments().add(new Installment(dueDate, quotaWithPaymentFee));
        }
    }
    private Date addMonths(Date date, int months) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, months);
        return calendar.getTime();
    }
}
