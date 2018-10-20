import accessories.Headphones;
import mainshop.Family;
import sheetmusic.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetmusic;
    @Before
    public void before(){
        sheetmusic = new SheetMusic("Nirvana - Nevermind Guitar Tab", 7.00, 14.95, Family.GUITAR, false);
    }

    @Test
    public void hasModelDescription(){
        assertEquals("Nirvana - Nevermind Guitar Tab", sheetmusic.getModelDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(7.00, sheetmusic.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(14.95, sheetmusic.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(7.95, sheetmusic.getMarkup(), 0.01);
    }

    @Test
    public void hasInstrumentType() {
        assertEquals(Family.GUITAR, sheetmusic.getInstrument());
    }

    @Test
    public void isDigitalCopy() {
        assertEquals(false, sheetmusic.getDigitalCopy());
    }
}