public class Keyboard extends Instrument {
    private String hammerAction;
    private String type;
    private int numberOfKeys;

    public Keyboard(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> family, Boolean electric, String hammerAction, String type, int numberOfKeys){
        super(modelDescription, buyingPrice, sellingPrice, family, electric);
        this.hammerAction = hammerAction;
        this.type = type;
        this.numberOfKeys = numberOfKeys;
        this.addProductInfo("Hammer Action", this.hammerAction);
        this.addProductInfo("Type", this.type);
        this.addProductInfo("Number Of Strings", Integer.toString(this.numberOfKeys));
    }

    public String getHammerAction() {
        return this.hammerAction;
    }

    public String getType() {
        return this.type;
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }
}