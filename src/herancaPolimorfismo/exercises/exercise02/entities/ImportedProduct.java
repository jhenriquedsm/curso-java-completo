package herancaPolimorfismo.exercises.exercise02.entities;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public Double totalPrice(){
        return super.getPrice() + customsFee;
    }

    @Override
    public String priceTag(){
        return super.getName() + " $ " + String.format("%.2f", totalPrice()) + " (Customs Fee: $ " + String.format("%.2f", customsFee) + ")";
    }
}