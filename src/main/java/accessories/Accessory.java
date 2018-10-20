package accessories;

import mainshop.StockItem;

public abstract class Accessory extends StockItem {
    private String type;

    public Accessory(String modelDescription, double buyingPrice, double sellingPrice, String type){
        super(modelDescription, buyingPrice, sellingPrice);
        this.type = type;
        this.addProductInfo("Type", this.type);
    }

    public String getType() {
        return type;
    }
}
