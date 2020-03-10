package tests.experimental;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import tests.common.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class experimental extends BaseTest {

    @Test
    public void test() {
        open("https://google.com");
        Assert.assertEquals(getWebDriver().getTitle(), "test");
    }
}
