package utils;

import com.codeborne.selenide.SelenideWait;
import org.openqa.selenium.By;
import tests.common.BaseTest;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.element;

public class DriverHelper extends BaseTest {
  
  public void selectMenuItem(String menuItemName) {
    element(By.xpath("//ul[contains(@class, 'dropdown-menu')]")).should(appear);
    String locator = String.format("//ul[contains(@class, 'dropdown-menu')]" +
        "//a[contains(text(),'%s')]", menuItemName);
    element(By.xpath(locator)).click();
  }
}
