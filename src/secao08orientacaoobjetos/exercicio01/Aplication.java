package secao08orientacaoobjetos.exercicio01;

import secao08orientacaoobjetos.exercicio01.entities.BankAccount;

public class Aplication {

    public static void main(String[] args) {
        String accountOwner = "Fulano";
        int accountNumber = 123456;
        boolean isThereAnInitialDeposit = true;
        double initialDeposit;

        if (!isThereAnInitialDeposit) initialDeposit = 0.0;
        else initialDeposit = 500.00;


        BankAccount bankAccount = new BankAccount(accountNumber, accountOwner, initialDeposit);
        System.out.printf("Account created: %s%n", bankAccount);

        double deposit = 100.00;
        bankAccount.deposit(deposit);
        System.out.printf("Account updated: %s%n", bankAccount);

        double withdrawal = 200.00;
        bankAccount.withdrawal(withdrawal);
        System.out.printf("Account updated: %s%n", bankAccount);

        String changeAccountOwnersName = "Fulana";
        bankAccount.setAccountOwner(changeAccountOwnersName);
        System.out.printf("Account updated: %s%n", bankAccount);

    }
}
