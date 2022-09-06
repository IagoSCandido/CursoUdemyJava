package secao14herancaepolimorfismo.abstracao.exercicio01.entities;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public double tax() {
        double tax;
        if (getAnnualIncome() <  20000.00) tax = getAnnualIncome() * 0.15 - (healthExpenditures / 2);
        else tax = getAnnualIncome() * 0.25 - (healthExpenditures / 2);
        return tax;
    }

}
