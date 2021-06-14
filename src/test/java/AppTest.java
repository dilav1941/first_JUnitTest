import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @BeforeAll
    public static void initSuite() {
        System.out.println("Запуск теста");

    }

    @AfterAll
    public static void completeSuite() {
        System.out.println("Тест выполнен");
    }

    @BeforeEach
    public void initTest() {
        System.out.println("Запуск нового теста");

    }

    @AfterEach
    public void finalizeTest() {
        System.out.println("Завершение теста");
    }

    @Test
    public void circleArea() {
        String argument = "7";
        double expected = 153.86;
        double result = App.circleArea(argument);
        Assertions.assertEquals (expected, result);
    }

    @Test
    public void circleLenght() {
        String argument = "7";
        double expected = 43.96;
        double result = App.circleLenght (argument);
        Assertions.assertEquals (expected, result);
    }

    @Test
    public void negative_number() {
        String argument = "-5";
        double result = App.negativeNumber (argument);
        Assertions.assertEquals (0.0, result);
    }
}