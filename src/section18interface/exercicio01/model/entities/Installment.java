package section18interface.exercicio01.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    private Date dueDate;
    private Double amount;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Installment(Date dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String toString () {
        return String.format("%s - %.2f", sdf.format(dueDate), amount);
    }
}


