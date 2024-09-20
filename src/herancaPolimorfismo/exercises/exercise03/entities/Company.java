package herancaPolimorfismo.exercises.exercise03.entities;

public class Company extends TaxPayer{
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
    public Double tax() {
        if (numberOfEmployees > 10){
            return super.getAnualIncome() * 0.14;
        } else {
            return super.getAnualIncome() * 0.16;
        }
    }
}