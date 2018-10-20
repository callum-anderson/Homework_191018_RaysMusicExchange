import accessories.Headphones;
import accessories.KeyboardStand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardStandTest {
    KeyboardStand keyboardstand;
    @Before
    public void before(){
        keyboardstand = new KeyboardStand("X-Frame 2-tier Keyboard Stand", 18.00, 39.99, "Keyboard Stand", "Black", false, true);
    }

    @Test
    public void hasModelDescription(){
        assertEquals("X-Frame 2-tier Keyboard Stand", keyboardstand.getModelDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(18.00, keyboardstand.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(39.99, keyboardstand.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(21.99, keyboardstand.getMarkup(), 0.01);
    }

    @Test
    public void hasColour(){
        assertEquals("Black", keyboardstand.getColour());
    }

    @Test
    public void hasType() {
        assertEquals("Keyboard Stand", keyboardstand.getType());
    }

    @Test
    public void hasCarryCase() {
        assertEquals(false, keyboardstand.getHasCarryCase());
    }

    @Test
    public void isCollapsible() {
        assertEquals(true, keyboardstand.getCollapsible());
    }
}