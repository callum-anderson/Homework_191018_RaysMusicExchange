import instruments.Percussion;
import mainshop.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PercussionTest {
    Percussion drums;
    @Before
    public void before(){
        drums = new Percussion("BDK-1 Full Size Starter Kit", 170.00, 229.00, Family.PERCUSSION, false, true, "Full Drum Kit", 5);
    }

    @Test
    public void hasModelDescription(){
        assertEquals("BDK-1 Full Size Starter Kit", drums.getModelDescription());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(170.00, drums.getBuyingPrice(), 0.01);
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(229.00, drums.getSellingPrice(), 0.01);
    }

    @Test
    public void hasMarkup(){
        assertEquals(59.00, drums.getMarkup(), 0.01);
    }

    @Test
    public void hasFamily(){
        assertEquals(Family.PERCUSSION, drums.getFamily());
    }

    @Test
    public void isElectric(){
        assertEquals(false, drums.getElectric());
    }

    @Test
    public void hasCompleteSet(){
        assertEquals(true, drums.getCompleteSet());
    }

    @Test
    public void hasType() {
        assertEquals("Full Drum Kit", drums.getType());
    }

    @Test
    public void hasNumberOfPieces() {
        assertEquals(5, drums.getNumberOfPieces());
    }
}