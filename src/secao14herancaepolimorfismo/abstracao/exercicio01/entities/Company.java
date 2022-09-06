package secao14herancaepolimorfismo.abstracao.exercicio01.entities;

public class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public double tax() {
        double tax;
        if(numberOfEmployees <= 10) tax = getAnnualIncome() * 0.16;
        else tax = getAnnualIncome() * 0.14;
        return tax;
    }

}