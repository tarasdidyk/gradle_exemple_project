package tests.experimental;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class experimental {
  /*HomePage homePage;

  @BeforeEach
  public void setup() {
    homePage = new HomePage();
  }

  @Tag("test")
  @Test
  public void test() {
    open(Configuration.baseUrl);
    homePage.menuBlock.openAndSelectItemInTheAboutPolytechnicDropDown(AboutPolytechnics.PORTAL);
    $("dqwdwq12312312").should(Condition.appear);
  }

  @AfterEach
  public void holdBrowserOpen() {
    Configuration.holdBrowserOpen = true;
  }*/

  public static RemoteWebDriver driver;
  public static WebDriver driver1;
  @FindBy(linkText = "some-file.txt")
  private WebElement downloadFile;

  public void init() {
    if (Utils.isEnvironmentRemote()) {
     /* String downloadFilepath = System.getProperty("//home//qa");
      HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
      chromePrefs.put("profile.default_content_settings.popups", 0);
      chromePrefs.put("download.default_directory", downloadFilepath);*/
      ChromeOptions options = new ChromeOptions();
/*      options.setExperimentalOption("prefs", chromePrefs);*/
      DesiredCapabilities cap = DesiredCapabilities.chrome();
      /*cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
      cap.setCapability(ChromeOptions.CAPABILITY, options);*/
      URL host = null;
      try {
        host = new URL("http://192.168.0.105:4444/wd/hub");
      } catch (MalformedURLException e) {
        e.printStackTrace();
      }
      driver = new RemoteWebDriver(host, cap);
      driver.setFileDetector(new LocalFileDetector());
 /*   System.setProperty("webdriver.chrome.driver",
        new File(this.getClass().getResource("/chromedriver.exe").getFile())
            .getPath());
    WebDriver driver = new ChromeDriver(cap);*/
    } else {
      String downloadFilepath = System.getProperty("user.dir");
      //String downloadFilepath = "C:\\1";
      HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
      chromePrefs.put("profile.default_content_settings.popups", 0);
      chromePrefs.put("download.default_directory", downloadFilepath);
      ChromeOptions options = new ChromeOptions();
      options.setExperimentalOption("prefs", chromePrefs);
      DesiredCapabilities cap = DesiredCapabilities.chrome();
      cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
      cap.setCapability(ChromeOptions.CAPABILITY, options);
      System.setProperty("webdriver.chrome.driver",
          new File(this.getClass().getResource("/chromedriver.exe").getFile())
              .getPath());
      driver1 = new ChromeDriver(cap);
    }
  }

  @Tag("test")
  @Test
  public void downloadLogLevelReportNetNetworkTest() throws InterruptedException {
    init();
    if (Utils.isEnvironmentRemote()) {
      PageFactory.initElements(driver, this);
      driver.get("http://the-internet.herokuapp.com/download");
    } else {
      PageFactory.initElements(driver1, this);
      driver1.get("http://the-internet.herokuapp.com/download");
    }
    downloadFile.click();
    Thread.sleep(60000);
  }

  @AfterEach
  public void tearDown() {
    saveScreenshot();
  }

  @Attachment(value = "Page screenshot", type = "image/png")
  public static byte[] saveScreenshot() {
    if (Utils.isEnvironmentRemote()) {
      return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
      return ((TakesScreenshot) driver1).getScreenshotAs(OutputType.BYTES);
  }

  @AfterAll
  public static void quiet() {
    if (Utils.isEnvironmentRemote()) {
      driver.quit();
    } else {
      driver1.quit();
    }
  }
}
