package tests.experimental;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
import static org.testng.Assert.assertEquals;


public class experimental {

    RemoteWebDriver remoteWebDriver;

    @Test
    void ableToRunDefaultDriverOnSelenoid() throws MalformedURLException {
        String url = "http://192.168.0.102:4444/";
        ChromeOptions options = new ChromeOptions();
        remoteWebDriver = new RemoteWebDriver(new URL(url), options);
        remoteWebDriver.get("https://google.com");
    }
}
