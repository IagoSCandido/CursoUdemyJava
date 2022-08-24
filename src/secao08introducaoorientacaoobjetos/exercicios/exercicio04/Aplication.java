package secao08introducaoorientacaoobjetos.exercicios.exercicio04;

import secao08introducaoorientacaoobjetos.exercicios.exercicio04.entities.CurrencyConverter;

import java.util.Locale;

public class Aplication {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.printf("What is the dollar price? %.2f%n", CurrencyConverter.DOLAR);

        double beBought = 200.00;
        System.out.printf("How many dollars will be bought? %.2f%n", beBought);

        System.out.printf("Amount to be paid in reais: %.2f", CurrencyConverter.converter(beBought));

    }
}
