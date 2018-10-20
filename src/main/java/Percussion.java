public class Percussion extends Instrument {
    private Boolean completeSet;
    private String type;
    private int numberOfPieces;

    public Percussion(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> family, Boolean electric, Boolean completeSet, String type, int numberOfPieces){
        super(modelDescription, buyingPrice, sellingPrice, family, electric);
        this.completeSet = completeSet;
        this.type = type;
        this.numberOfPieces = numberOfPieces;
        this.addProductInfo("Complete", this.completeSet.toString());
        this.addProductInfo("Type", this.type);
        this.addProductInfo("Number Of Pieces", Integer.toString(this.numberOfPieces));
    }

    public Boolean getCompleteSet() {
        return this.completeSet;
    }

    public String getType() {
        return this.type;
    }

    public int getNumberOfPieces() {
        return this.numberOfPieces;
    }
}