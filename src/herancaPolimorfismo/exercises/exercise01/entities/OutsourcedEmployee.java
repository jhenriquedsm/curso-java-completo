package herancaPolimorfismo.exercises.exercise01.entities;

public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;

    public OutsourcedEmployee(){}

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    @Override
    public Double payment(){
        return (valuePerHour * hours) + (additionalCharge * 1.1);
    }
}