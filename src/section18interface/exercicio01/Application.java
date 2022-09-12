package section18interface.exercicio01;

import section18interface.exercicio01.model.entities.Contract;
import section18interface.exercicio01.model.entities.Installment;
import section18interface.exercicio01.model.services.ContractService;
import section18interface.exercicio01.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Application {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        test(1234,sdf.parse("25/08/2022"), 600.0, 3);
    }
    public static void test(int number, Date date, double totalValue, int months) {
        Contract contract = new Contract(number, date, totalValue);
        ContractService contractService = new ContractService(new PaypalService());
        contractService.processContract(contract, months);
        System.out.println("Installments:");
        for (Installment installments : contract.getInstallments()) {
            System.out.println(installments);
        }


    }
}
