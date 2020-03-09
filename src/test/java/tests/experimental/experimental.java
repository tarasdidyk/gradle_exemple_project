package tests.experimental;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit5.ScreenShooterExtension;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.ScreenshotListener;

import java.net.MalformedURLException;
import java.net.URL;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static org.testng.Assert.assertEquals;

@ExtendWith({ScreenShooterExtension.class})
public class experimental {

    @Test
    void ableToRunDefaultDriverOnSelenoid() throws MalformedURLException, InterruptedException {
        Configuration.driverManagerEnabled = false;
        Configuration.remote = "http://192.168.0.102:4444/wd/hub";
        Configuration.screenshots = true;
        open("https://google.com");
        Assert.assertEquals(getWebDriver().getTitle(), "Test");
    }
}
