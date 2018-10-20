public abstract class Instrument extends StockItem {
    Enum<Family> family;
    Boolean electric;
    public Instrument(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> family, Boolean electric){
        super(modelDescription, buyingPrice, sellingPrice);
        this.family = family;
        this.electric = electric;
        this.addProductInfo("Family", this.family.toString());
        this.addProductInfo("Electric/Powered", this.electric.toString());
    }

    public Enum<Family> getFamily() {
        return family;
    }

    public Boolean getElectric() {
        return electric;
    }
}
