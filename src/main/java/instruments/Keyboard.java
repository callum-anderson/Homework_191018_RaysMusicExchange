package instruments;

import instruments.Instrument;
import mainshop.Family;

public class Keyboard extends Instrument {
    private String hammerAction;
    private int numberOfKeys;

    public Keyboard(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> family, Boolean electric, String hammerAction, String type, int numberOfKeys){
        super(modelDescription, buyingPrice, sellingPrice, family, electric, type);
        this.hammerAction = hammerAction;
        this.numberOfKeys = numberOfKeys;
        this.addProductInfo("Hammer Action", this.hammerAction);
        this.addProductInfo("Number Of Keys", Integer.toString(this.numberOfKeys));
    }

    public String getHammerAction() {
        return this.hammerAction;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }
}