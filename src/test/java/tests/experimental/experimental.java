package tests.experimental;



import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
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
import static org.testng.Assert.assertEquals;

public class experimental extends TestListenerAdapter {

    RemoteWebDriver remoteWebDriver;

    @Test
    void ableToRunDefaultDriverOnSelenoid() throws MalformedURLException, InterruptedException {
       /* String url = "http://192.168.0.102:4444/wd/hub";
        ChromeOptions options = new ChromeOptions();
        remoteWebDriver = new RemoteWebDriver(new URL(url), options);
        openGoogle();*/
        Configuration.driverManagerEnabled = false;
        Configuration.remote = "http://192.168.0.102:4444/wd/hub";
        Configuration.screenshots = true;
        open("https://google.com");
        Thread.sleep(2999);
        saveScreenshot();
        Thread.sleep(2999);
    }

    @Step("open google ")
    public void openGoogle() {
        remoteWebDriver.get("https://google.com");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        saveScreenshot();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        saveScreenshot();
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) remoteWebDriver).getScreenshotAs(OutputType.BYTES);
    }
}
