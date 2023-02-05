import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {

    public IngredientType type;

    @Test
    public void ingredientTypeHaveSAUCE(){
            Assert.assertEquals("SAUCE", IngredientType.valueOf("SAUCE").toString());
    }

    @Test
    public void ingredientTypeHaveFILLING(){
        Assert.assertEquals("FILLING", IngredientType.valueOf("FILLING").toString());
    }
}
