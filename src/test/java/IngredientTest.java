import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.Ingredient;
import praktikum.IngredientType;


public class IngredientTest {


    @Mock
    IngredientType ingredientType;



    @Test
    public void getNameReturnName() {
        Ingredient ingredient = new Ingredient(ingredientType,"Соус Spicy-X",90);
        Assert.assertEquals("Соус Spicy-X", ingredient.getName());
    }

    @Test
    public void getPriceReturnPrice() {
        Ingredient ingredient = new Ingredient(ingredientType,"Соус Spicy-X",90);
        Assert.assertEquals(90, ingredient.getPrice(),0.1);
    }

    @Test
    public void getTypeReturningredientType() {
        Ingredient ingredient = new Ingredient(ingredientType,"Соус Spicy-X",90);
        Assert.assertEquals(ingredientType, ingredient.getType());
    }


}
