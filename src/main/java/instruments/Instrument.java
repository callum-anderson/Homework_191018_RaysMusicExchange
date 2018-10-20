package instruments;

import mainshop.Family;
import mainshop.StockItem;

public abstract class Instrument extends StockItem implements IPlay {
    Enum<Family> family;
    Boolean electric;
    String type;
    public Instrument(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> family, Boolean electric, String type){
        super(modelDescription, buyingPrice, sellingPrice);
        this.family = family;
        this.electric = electric;
        this.type = type;
        this.addProductInfo("mainshop.Family", this.family.toString());
        this.addProductInfo("Electric/Powered", this.electric.toString());
        this.addProductInfo("Type", this.type);
    }

    public Enum<Family> getFamily() {
        return this.family;
    }

    public Boolean getElectric() {
        return this.electric;
    }

    public String getType() {
        return this.type;
    }
}
