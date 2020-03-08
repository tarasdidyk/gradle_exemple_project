package tests.experimental;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;


public class experimental {

    @BeforeSuite
    void setUp() throws MalformedURLException {
        Configuration.remote = "http://192.168.0.104:4444/wd/hub";
    }

    @Test(alwaysRun = true)
    public void Test1() throws InterruptedException {
        open("https://google.com");
        Thread.sleep(5000);
    }

    @Test(alwaysRun = true)
    public void Test12() throws InterruptedException {
        open("https://google.com");
        Thread.sleep(5000);
    }
}
