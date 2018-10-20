package instruments;

import mainshop.Family;

public class Guitar extends Instrument {
    private String colour;
    private int numberOfStrings;

    public Guitar(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> family, Boolean electric, String colour, String type, int numberOfStrings){
        super(modelDescription, buyingPrice, sellingPrice, family, electric, type);
        this.colour = colour;
        this.numberOfStrings = numberOfStrings;
        this.addProductInfo("Colour", this.colour);
        this.addProductInfo("Number Of Strings", Integer.toString(this.numberOfStrings));
    }

    public String getColour() {
        return this.colour;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    public String play(){
        return "Guitar playing...";
    }
}
