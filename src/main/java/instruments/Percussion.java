package instruments;

import mainshop.Family;

public class Percussion extends Instrument {
    private Boolean completeSet;
    private int numberOfPieces;

    public Percussion(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> family, Boolean electric, Boolean completeSet, String type, int numberOfPieces){
        super(modelDescription, buyingPrice, sellingPrice, family, electric, type);
        this.completeSet = completeSet;
        this.numberOfPieces = numberOfPieces;
        this.addProductInfo("Complete", this.completeSet.toString());
        this.addProductInfo("Number Of Pieces", Integer.toString(this.numberOfPieces));
    }

    public Boolean getCompleteSet() {
        return this.completeSet;
    }

    public int getNumberOfPieces() {
        return this.numberOfPieces;
    }

    public String play(){
        return "Percussion/drums playing...";
    }
}