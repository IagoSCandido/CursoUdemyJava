package secao14herancaepolimorfismo.heranca.exercicios.exerciciocorrigido01.entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer hour;
    private Double valuePerHour;
    private OutsourcedEmployee outsourcedEmployee;
    public Employee() {
    }

    public Employee(String name, Integer hour, Double valuePerHour) {
        this.name = name;
        this.hour = hour;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public OutsourcedEmployee getOutsourcedEmployee() {
        return outsourcedEmployee;
    }

    public void setOutsourcedEmployee(OutsourcedEmployee outsourcedEmployee) {
        this.outsourcedEmployee = outsourcedEmployee;
    }

    public Double payment() {
        return hour * valuePerHour;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PAYMENTS: ").append("\n")
                .append(name).append(" - $").append(payment());
        return sb.toString();
    }
}
