import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import static praktikum.IngredientType.*;


public class IngredientTest {



    @Test
    public void getNameReturnName() {
        Ingredient ingredient = new Ingredient(SAUCE,"Соус Spicy-X",90);
        Assert.assertEquals("Соус Spicy-X", ingredient.getName());
    }

    @Test
    public void getPriceReturnPrice() {
        Ingredient ingredient = new Ingredient(SAUCE,"Соус Spicy-X",90);
        Assert.assertEquals(90, ingredient.getPrice(),0.1);
    }

    @Test
    public void getTypeSAUCEReturnTypeSAUCE() {
        Ingredient ingredient = new Ingredient(SAUCE,"Соус Spicy-X",90);
        Assert.assertEquals(SAUCE, ingredient.getType());
    }

    @Test
    public void getTypeFILLINGReturnTypeFILLING() {
        Ingredient ingredient = new Ingredient(FILLING,"Мясо бессмертных моллюсков Protostomia",1337);
        Assert.assertEquals(FILLING, ingredient.getType());
    }


}
