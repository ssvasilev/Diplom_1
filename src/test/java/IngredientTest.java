import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.Bun;
import praktikum.Database;
import praktikum.Ingredient;
import praktikum.IngredientType;

import java.util.List;


public class IngredientTest  extends Database {


    @Mock
    IngredientType ingredientType;

    @Test
    public void getNameReturnName() {
        //Инициализируем базу данных
        Database database = new Database();
        List<Ingredient> ingredients = database.availableIngredients();
        //Создаём эталонный объект из базы данных
        Ingredient testIngredient = ingredients.get(0);
        //Создаём тестовый объект через класс
        Ingredient ingredient = new Ingredient(testIngredient.type,testIngredient.name,testIngredient.price);
        //Сверяем, что их имена совпадают
        Assert.assertEquals(ingredient.getName(), testIngredient.name);
    }

    @Test
    public void getPriceReturnPrice() {
        //Инициализируем базу данных
        Database database = new Database();
        List<Ingredient> ingredients = database.availableIngredients();
        //Создаём эталонный объект из базы данных
        Ingredient testIngredient = ingredients.get(0);
        //Создаём тестовый объект через класс
        Ingredient ingredient = new Ingredient(testIngredient.type,testIngredient.name,testIngredient.price);
        //Сверяем, что их цены совпадают
        Assert.assertEquals(ingredient.getPrice(), testIngredient.price, 0.1);
    }

    @Test
    public void getTypeReturnIngredientType() {
        //Инициализируем базу данных
        Database database = new Database();
        List<Ingredient> ingredients = database.availableIngredients();
        //Создаём эталонный объект из базы данных
        Ingredient testIngredient = ingredients.get(0);
        //Создаём тестовый объект через класс
        Ingredient ingredient = new Ingredient(testIngredient.type,testIngredient.name,testIngredient.price);
        //Сверяем, что их типы совпадают
        Assert.assertEquals(ingredient.getType(), testIngredient.type);
    }


}
