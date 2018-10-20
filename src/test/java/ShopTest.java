import accessories.Headphones;
import instruments.Guitar;
import instruments.Keyboard;
import instruments.Percussion;
import mainshop.Family;
import mainshop.Shop;
import org.junit.Before;
import org.junit.Test;
import sheetmusic.SheetMusic;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Headphones headphones;
    Keyboard piano;
    Guitar bassguitar;
    Shop shop;
    SheetMusic sheetmusic;
    @Before
    public void before(){
        headphones = new Headphones("Sennheiser HP25", 16.00, 35.00, "Closed Cup", "Black", true);
        sheetmusic = new SheetMusic("Nirvana - Nevermind Guitar Tab", 7.00, 14.95, Family.GUITAR, false);
        piano = new Keyboard("Yahama TransAcoustic GC1TA", 20000.00, 23500.00, Family.KEYBOARD, false, "Weighted", "Transacoustic", 88);
        bassguitar = new Guitar("Fender Mustang Bass PF", 400.00, 479.90, Family.GUITAR, true, "Olympic White", "Bass", 4);
        shop = new Shop();
        shop.addStockItem(headphones);
        shop.addStockItem(sheetmusic);
        shop.addStockItem(piano);
        shop.addStockItem(bassguitar);
    }

    @Test
    public void hasStock(){
        assertEquals(4, shop.stockCount());
    }

    @Test
    public void canRemoveStock(){
        shop.removeStockItem(headphones);
        assertEquals(3, shop.stockCount());
    }

    @Test
    public void canAddStock(){
        Percussion drums = new Percussion("BDK-1 Full Size Starter Kit", 170.00, 229.00, Family.PERCUSSION, false, true, "Full Drum Kit", 5);
        shop.addStockItem(drums);
        assertEquals(5, shop.stockCount());
    }
}
