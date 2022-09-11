package secao15exceptiontreatment.exercicio01;

import secao15exceptiontreatment.exercicio01.model.entities.Account;
import secao15exceptiontreatment.exercicio01.model.exceptions.DomainExceptions;

import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        System.out.println("Account data:");
        int number = 8021;
        System.out.println("Number: " + number);
        String holder = "Bob Brown";
        System.out.println("Holder: " + holder);
        testScenario("1", number, holder, 500.00, 300.00, 100.00);
        testScenario("2", number, holder, 500.00, 300.00, 400.00);
        testScenario("3", number, holder, 500.00, 300.00, 800.00);
        testScenario("4", number, holder, 200.00, 300.00, 250.00);

    }

    public static void testScenario
            (String scenario, int number, String holder, double balance, double withdrawLimit, double withdrawValue){
        try {
            Account acc = new Account(number, holder, balance, withdrawLimit);
            acc.withdraw(withdrawValue);
            System.out.println(scenario + " " + acc);
        }
        catch (DomainExceptions e) {
            System.out.println(scenario + " " + e.getMessage());
        }
    }
}
