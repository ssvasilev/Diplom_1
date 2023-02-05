import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;
@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final String type;

    public IngredientTypeTest(String type) {
        this.type = type;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"SAUCE"},
                {"FILLING"},
        };
    }

    @Test
    public void ingredientTypeHaveSAUCE(){
        Assert.assertEquals(type, IngredientType.valueOf(type).toString());
    }

}

