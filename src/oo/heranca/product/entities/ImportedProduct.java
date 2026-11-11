package oo.heranca.product.entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public final String priceTag() {
            return String.format("%s $ %.2f (Custom fee: $ %.2f)%n", name, totalPrice(), customsFee);
    }

    public Double totalPrice() {
        return price + customsFee;
    }
}
