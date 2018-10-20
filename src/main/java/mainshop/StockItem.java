package mainshop;

import java.util.HashMap;

public abstract class StockItem implements ISell {
    private double buyingPrice;
    private double sellingPrice;
    private String modelDescription;
    private HashMap<String, String> productInfo;

    public StockItem(String modelDescription, double buyingPrice, double sellingPrice){
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.modelDescription = modelDescription;
        this.productInfo = new HashMap<>();
        this.productInfo.put("Buying Price", Double.toString(this.buyingPrice));
        this.productInfo.put("Selling Price", Double.toString(this.sellingPrice));
        this.productInfo.put("Markup", Double.toString(this.getMarkup()));
        this.productInfo.put("Model/Description", this.modelDescription);
    }

    public double getMarkup(){
        return this.sellingPrice - this.buyingPrice;
    }

    public double getBuyingPrice() {
        return buyingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public String getModelDescription() {
        return modelDescription;
    }

    public void addProductInfo(String key, String value) {
        this.productInfo.put(key, value);
    }

    public HashMap<String, String> getProductInfo() {
        return productInfo;
    }
}
