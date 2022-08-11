package orientacaoobjetos.exercicio01.entities;

public class BankAccount {
    private final int accountNumber;
    private String accountOwner;
    private double initialDeposit;

    public BankAccount(int accountNumber, String accountOwner) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;

    }
    public BankAccount(int accountNumber, String accountOwner, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        this.initialDeposit = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public double deposit(double amount) {
        return this.initialDeposit += amount;

    }

    public double withdrawal(double amount) {
        double tax = 5.0;
        double balance = this.initialDeposit -= amount;
        return balance - tax;
    }

    public String toString() {
        return String.format("%n" +
                        "Number: %d%n" +
                        "Owner: %s%n" +
                        "Balance: %.2f"
                , getAccountNumber(), getAccountOwner(), getInitialDeposit());
    }
}
