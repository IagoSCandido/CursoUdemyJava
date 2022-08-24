package secao08introducaoorientacaoobjetos.exercicios.exercicio04.entities;

// Faça um programa para ler a cotacao do dolar, e depois um valor em dolares a ser comprado por uma pessoa em reais
//Informar quantos reais a pessoa vai pagar pelos dolares, considerando ainda que a pessoa tera de pagar 6% de IOF
//sobre o valor do dolar.
public class CurrencyConverter {

    //Dolar from 09/08/2022
    public static final double DOLAR = 5.11;

    //IOF 6%
    public static double iof() {
        return DOLAR + (DOLAR * 6 / 100);
    }

    public static double converter(double reais) {
        return reais * iof();
    }
}
