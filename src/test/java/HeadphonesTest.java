import accessories.Headphones;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeadphonesTest {
    Headphones headphones;
    @Before
    public void before(){
        headphones = new Headphones("Sennheiser HP25", 16.00, 35.00, "Closed Cup", "Black", true);
    }

    @Test
    public void hasModelDescription(){
        assertEquals("Sennheiser HP25", headphones.getModelDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(16.00, headphones.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(35.00, headphones.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(19.00, headphones.getMarkup(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Black", headphones.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Closed Cup", headphones.getType());
    }

    @Test
    public void hasCarryCase() {
        assertEquals(true, headphones.getHasCarryCase());
    }

}
