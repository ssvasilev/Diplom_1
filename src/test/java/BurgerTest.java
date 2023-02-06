import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Bun;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;
    @Mock
    Ingredient secondIngredient;


    @Test
    public void setBunsReturnBun(){
        Burger burger = new Burger();
        burger.setBuns(bun);
        Assert.assertEquals(bun,burger.bun);
    }

    @Test
    public void addIngredientAddListIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        Assert.assertEquals(List.of(ingredient),burger.ingredients);
    }

    @Test
    public void removeIngredientDeleteIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.removeIngredient(0);
        Assert.assertEquals(List.of(),burger.ingredients);
    }

    @Test
    public void moveIngredientMoveIngredient(){
        Burger burger = new Burger();
        burger.addIngredient(ingredient);
        burger.addIngredient(secondIngredient);
        burger.moveIngredient(0,1);
        Assert.assertEquals(List.of(secondIngredient,ingredient),burger.ingredients);
    }

    @Test
    public void getPriceReturnPrice(){
        Burger burger = new Burger();
        Mockito.when(bun.getPrice()).thenReturn(988F);
        burger.setBuns(bun);
        Mockito.when(ingredient.getPrice()).thenReturn(90F);
        burger.addIngredient(ingredient);
        Assert.assertEquals(2066.0,burger.getPrice(),0.1);
    }

    @Test
    public void  getReceiptReturnReceipt(){
        Burger burger = new Burger();
        Mockito.when(bun.getName()).thenReturn("Флюоресцентная булка R2-D3");
        Mockito.when(bun.getPrice()).thenReturn(988F);
        Mockito.when(ingredient.getName()).thenReturn("Соус Spicy-X");
        Mockito.when(ingredient.getPrice()).thenReturn(90F);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Assert.assertEquals(
                "(==== Флюоресцентная булка R2-D3 ====)\r\n= sauce Соус Spicy-X =\r\n(==== Флюоресцентная булка R2-D3 ====)\r\n\r\nPrice: 2066,000000\r\n"
,burger.getReceipt());
    }

}
