package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import pages.common.BasePage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownloadPage extends BasePage {
  private SelenideElement censusTotalDownloadLinkButton = $(By.xpath("//a[contains(text(), '2018 Census total')]"));
  private SelenideElement pageHeading = $(By.xpath("//h1[contains(text(), 'CSV files for download')]"));

  private final String downloadPage = "https://www.stats.govt.nz/large-datasets/csv-files-for-download/";

  public boolean isPageDisplayed() {
    return pageHeading.isDisplayed();
  }

  public DownloadPage openDownloadPage() {
    open(downloadPage);
    return this;
  }

  public DownloadPage scrollToCensusTotalLoadingLink() {
    censusTotalDownloadLinkButton.scrollTo();
    return this;
  }

  public DownloadPage clickTheCensusTotalDownloadLinkButton() {
    censusTotalDownloadLinkButton.click();
    return this;
  }
}
