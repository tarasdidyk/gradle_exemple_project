package tests.experimental;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.HomePage;
import pages.blocks.homepage.MenuBlock;
import tests.common.BaseTest;
import utils.DriverHelper;
import utils.enums.AboutPolytechnics;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class experimental extends BaseTest {
  HomePage homePage;

  @BeforeEach
  public void setup() {
    homePage = new HomePage();
  }

  @Tag("test")
  @Test
  public void test() {
    open(Configuration.baseUrl);
    homePage.menuBlock.openAndSelectItemInTheAboutPolytechnicDropDown(AboutPolytechnics.PORTAL);
  }

  @AfterEach
  public void holdBrowserOpen() {
    Configuration.holdBrowserOpen = true;
  }
}
