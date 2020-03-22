package pages.blocks.homepage;

import com.codeborne.selenide.ElementsContainer;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import utils.DriverHelper;
import utils.enums.AboutPolytechnics;

import static com.codeborne.selenide.Selenide.$;

public class MenuBlock extends ElementsContainer {
  private SelenideElement aboutPolytechnicDropDown = $(By.xpath("//a[@id = 'lp_en']"));

  DriverHelper helper;

  public MenuBlock() {
    helper = new DriverHelper();
  }

  @Step
  public MenuBlock openAndSelectItemInTheAboutPolytechnicDropDown(AboutPolytechnics item) {
    aboutPolytechnicDropDown.click();
    helper.selectMenuItem(item.toString());
    return this;
  }


}
