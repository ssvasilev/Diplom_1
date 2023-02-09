import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;
import praktikum.Database;

import java.util.List;


public class BunTest extends Database{


    @Test
    public void getNameReturnName() {
        //Инициализируем базу данных
        Database database = new Database();
        List<Bun> buns = database.availableBuns();
        //Создаём эталонный объект из базы данных
        Bun testBun = buns.get(0);
        //Создаём тестовый объект через класс
        Bun bun = new Bun(testBun.name,testBun.price);
        //Сверяем, что их имена совпадают
        Assert.assertEquals(bun.getName(), testBun.name);
    }

    @Test
    public void getPriceReturnPrice() {
        //Инициализируем базу данных
        Database database = new Database();
        List<Bun> buns = database.availableBuns();
        //Создаём эталонный объект из базы данных
        Bun testBun = buns.get(0);
        //Создаём тестовый объект через класс
        Bun bun = new Bun(testBun.name,testBun.price);
        //Сверяем, что их цены совпадают
        Assert.assertEquals(bun.getPrice(), testBun.price, 0.1);
    }
}
