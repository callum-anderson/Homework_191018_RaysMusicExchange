package accessories;

import accessories.Accessory;

public class KeyboardStand extends Accessory {
    private String colour;
    private Boolean hasCarryCase;
    private Boolean collapsible;

    public KeyboardStand(String modelDescription, double buyingPrice, double sellingPrice, String type, String colour, Boolean hasCarryCase, Boolean collapsible) {
        super(modelDescription, buyingPrice, sellingPrice, type);
        this.colour = colour;
        this.hasCarryCase = hasCarryCase;
        this.collapsible = collapsible;
        this.addProductInfo("Colour", this.colour);
        this.addProductInfo("Includes CarryCase", this.hasCarryCase.toString());
        this.addProductInfo("Collapsible", this.collapsible.toString());
    }

    public String getColour() {
        return colour;
    }

    public Boolean getHasCarryCase() {
        return hasCarryCase;
    }

    public Boolean getCollapsible() {
        return collapsible;
    }
}