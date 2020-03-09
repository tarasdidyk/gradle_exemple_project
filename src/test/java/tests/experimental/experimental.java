package tests.experimental;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import tests.common.BaseTest;

import java.util.logging.Level;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class experimental extends BaseTest {

    @BeforeAll
    static void setUp() {
        LoggingPreferences logPrefs = new LoggingPreferences();
        Configuration.browserCapabilities.setCapability(CapabilityType.LOGGING_PREFS, logPrefs);
        //Configuration.browserCapabilities.setCapability("goog:loggingPrefs", logPrefs);
    }

    @Test
    public void test() {
        open("https://google.com");

        LogEntries les = getWebDriver().manage().logs().get(LogType.PERFORMANCE);
        for (LogEntry le : les) {
            System.out.println(le.getMessage());
        }
    }
}
