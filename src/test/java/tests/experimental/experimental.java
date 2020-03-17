package tests.experimental;

import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.common.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class experimental extends BaseTest {

    @Test
    public void test() {
        openMainPage();
        assertEquals(getWebDriver().getTitle(), "test");
    }

    @Tag("test")
    @Test
    public void test2() {
        openMainPage();
        assertEquals(getWebDriver().getTitle(), "test");
    }

    @Step
    public void openMainPage() {
        open("http://nuwm.edu.ua/");
    }
}
