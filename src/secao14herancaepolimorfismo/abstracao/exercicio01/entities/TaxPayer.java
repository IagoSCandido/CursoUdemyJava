package secao14herancaepolimorfismo.abstracao.exercicio01.entities;

public abstract class TaxPayer {
    protected String name;
    protected Double annualIncome;

    public TaxPayer() {
    }

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.annualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }
    public abstract double tax ();
}

