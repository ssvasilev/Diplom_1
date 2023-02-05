import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;


public class BunTest {

    @Test
    public void getNameReturnName() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3",988);
        Assert.assertEquals("Флюоресцентная булка R2-D3", bun.getName());

    }

    @Test
    public void getPriceReturnPrice() {
        Bun bun = new Bun("Флюоресцентная булка R2-D3",988);
        Assert.assertEquals(988, bun.getPrice(), 0.0);

    }
}
