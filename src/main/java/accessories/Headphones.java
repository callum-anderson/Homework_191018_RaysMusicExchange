package accessories;

import accessories.Accessory;

public class Headphones extends Accessory {
    private String colour;
    private Boolean hasCarryCase;

    public Headphones(String modelDescription, double buyingPrice, double sellingPrice, String type, String colour, Boolean hasCarryCase) {
        super(modelDescription, buyingPrice, sellingPrice, type);
        this.colour = colour;
        this.hasCarryCase = hasCarryCase;
        this.addProductInfo("Colour", this.colour);
        this.addProductInfo("Includes CarryCase", this.hasCarryCase.toString());
    }

    public String getColour() {
        return colour;
    }

    public Boolean getHasCarryCase() {
        return hasCarryCase;
    }


}