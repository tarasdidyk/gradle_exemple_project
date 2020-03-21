package pages;

import org.openqa.selenium.support.FindBy;
import pages.blocks.common.BasePage;
import pages.blocks.homepage.MenuBlock;


public class HomePage extends BasePage {
  @FindBy(xpath = "//header[@id = 'navbar']")
  public MenuBlock menuBlock;

  public HomePage() {
    menuBlock = new MenuBlock();
  }

}
