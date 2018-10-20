import instruments.Guitar;
import mainshop.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar bassguitar;
    @Before
    public void before(){
        bassguitar = new Guitar("Fender Mustang Bass PF", 400.00, 479.90, Family.GUITAR, true, "Olympic White", "Bass", 4);
    }

    @Test
    public void hasModelDescription(){
        assertEquals("Fender Mustang Bass PF", bassguitar.getModelDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(400.00, bassguitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(479.90, bassguitar.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(79.90, bassguitar.getMarkup(), 0.01);
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.GUITAR, bassguitar.getFamily());
    }

    @Test
    public void isElectric(){
        assertEquals(true, bassguitar.getElectric());
    }

    @Test
    public void hasColour(){
        assertEquals("Olympic White", bassguitar.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Bass", bassguitar.getType());
    }

    @Test
    public void hasNumberOfStrings() {
        assertEquals(4, bassguitar.getNumberOfStrings());
    }

    @Test
    public void canPlay() {
        assertEquals("Guitar playing...", bassguitar.play());
    }
}
