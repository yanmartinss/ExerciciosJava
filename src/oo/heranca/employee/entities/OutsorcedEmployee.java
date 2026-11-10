package oo.heranca.employee.entities;

public class OutsorcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsorcedEmployee () {
        super();
    }

    public OutsorcedEmployee(String name, Double valuePerHour, Integer hours, Double additionalCharge) {
        super(name, valuePerHour, hours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final double payment() {
        return (hours * valuePerHour) + (additionalCharge * 1.1);
    }
}
