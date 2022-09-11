package section18interface.exercicio01.model.services;

import section18interface.exercicio01.model.entities.Contract;
import section18interface.exercicio01.model.entities.Installment;

import java.util.List;

public class ContractService {
    private OnlinePaymentsService onlinePaymentsService;

    public void processContract(Contract contract, Integer months) {
        for (Installment installments : contract.getInstallments()) {
            installments.setAmount(onlinePaymentsService.interest(onlinePaymentsService.paymentFee(contract.getTotalValue() / months),months));

        }
    }
}
