package tests.experimental;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
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
       /* String url = "http://192.168.0.102:4444/wd/hub";
        ChromeOptions options = new ChromeOptions();
        remoteWebDriver = new RemoteWebDriver(new URL(url), options);
        openGoogle();*/
        Configuration.driverManagerEnabled = false;
        Configuration.remote = "http://192.168.0.102:4444/wd/hub";
        open("https://google.com");
    }

    @Step("open google ")
    public void openGoogle() {
        remoteWebDriver.get("https://google.com");
    }
}
