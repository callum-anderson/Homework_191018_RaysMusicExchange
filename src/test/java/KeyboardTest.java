import instruments.Keyboard;
import mainshop.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {
    Keyboard piano;
    @Before
    public void before(){
        piano = new Keyboard("Yahama TransAcoustic GC1TA", 20000.00, 23500.00, Family.KEYBOARD, false, "Weighted", "Transacoustic", 88);
    }

    @Test
    public void hasModelDescription(){
        assertEquals("Yahama TransAcoustic GC1TA", piano.getModelDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(20000.00, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(23500.00, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(3500.00, piano.getMarkup(), 0.01);
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.KEYBOARD, piano.getFamily());
    }

    @Test
    public void isElectric(){
        assertEquals(false, piano.getElectric());
    }

    @Test
    public void hasHammerAction(){
        assertEquals("Weighted", piano.getHammerAction());
    }

    @Test
    public void hasType() {
        assertEquals("Transacoustic", piano.getType());
    }

    @Test
    public void hasNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }
}