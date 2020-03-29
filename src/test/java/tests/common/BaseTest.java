package tests.common;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.google.common.io.Resources;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Utils;

import java.util.Objects;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BaseTest {

  @BeforeAll
  static void setUpDriver() {
    if (Utils.isEnvironmentRemote()) {
      Configuration.driverManagerEnabled = false;
      Configuration.remote = "http://192.168.0.103:4444/wd/hub";
    }
    Configuration.baseUrl = "https://lpnu.ua/en";
    Configuration.startMaximized = true;
    Configuration.downloadsFolder = "src/test/resources/download/";
  }

  @AfterEach
  public void tearDown() {
    saveScreenshot();
  }

  @Attachment(value = "Page screenshot", type = "image/png")
  public static byte[] saveScreenshot() {
    return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
  }
}
