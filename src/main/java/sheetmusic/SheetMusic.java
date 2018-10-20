package sheetmusic;

import mainshop.Family;
import mainshop.StockItem;

public class SheetMusic extends StockItem {
    private Enum<Family> instrument;
    public Boolean digitalCopy;

    public SheetMusic(String modelDescription, double buyingPrice, double sellingPrice, Enum<Family> instrument, Boolean digitalCopy){
        super(modelDescription, buyingPrice, sellingPrice);
        this.instrument = instrument;
        this.digitalCopy = digitalCopy;
        this.addProductInfo("Instrument", this.instrument.toString());
        this.addProductInfo("Is Digital", this.digitalCopy.toString());
    }

    public Enum<Family> getInstrument() {
        return instrument;
    }

    public Boolean getDigitalCopy() {
        return digitalCopy;
    }
}
