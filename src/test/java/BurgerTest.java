import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import praktikum.Ingredient;

import java.util.List;

import static org.hamcrest.CoreMatchers.notNullValue;

@RunWith(Parameterized.class)
public class BurgerTest {


        private final Bun bun;
        private final List<Ingredient> ingredients;

        public BurgerTest(Bun bunSet, List<Ingredient> ingredientsSet) {
            this.bun = bunSet;
            this.ingredients = ingredientsSet;

        }


        // Тестовые данные
        @Parameterized.Parameters
        public static Object[][] getDataOrder() {
            return new Object[][]{
                    {"Никита", "Комбаров", "Комсомольская ул., д. 6 кв.152", "Черкизовская", "89888678901", "1", "30.11.2022", "Прикрепить бантик на руль", "[\"black\"]"},
                    {"Пётр", "Петрович", "Чкалова ул., д. 15 кв.55", "Китай-город", "89881235897", "2", "22.08.2023", "Оставить у двери", "[\"grey\"]"},
                    {"Леонид", "Ксенофонтов", "Вокзальная ул., д. 19 кв.170", "Речной вокзал", "89882836886", "3", "27.05.2024", " ", "[\"black\",\"grey\"]"},
                    {"Александр", "Пушкин", "Мира ул., д. 20 кв.35", "Комсомольская", "89889783152", "4", "13.05.2024", "Ничего не делать", "[]"},

            };
        }

//        @Test
//        @DisplayName("Создание заказа (Параметризованный)") // имя теста
//        @Description("Параметры учитывают все варианты из задания") // описание теста
//        public void restCreateOrder() {
//            //Собираем из тестовых данных JSON, который послужит телом для запроса.
//            Order order = new Order(firstNameSet,lastNameSet,addressSet,metroStationSet,phoneSet,rentTimeSet,deliveryDateSet,commentSet,colorSet);
//
//            //Отправляем запрос
//            Response response = OrderApi.createOrder(order);
//            //Проверяем, что в ответе содержится track и оно не пустое.
//            response
//                    .then().assertThat().body("track", notNullValue())
//                    .and()
//                    .statusCode(SC_CREATED); //Проверяем, что код ответа = 201
//
//        }




}
