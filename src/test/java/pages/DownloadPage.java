package pages;

import com.codeborne.selenide.SelenideElement;
import pages.common.BasePage;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DownloadPage extends BasePage {
  private final String downloadPage = "https://www.stats.govt.nz/large-datasets/csv-files-for-download/";
  private SelenideElement censusTotalDownloadLinkButton = $(withText("2018 Census total"));
  private SelenideElement ageAndSexByEthnicGroupDownloadLinkButton = $(withText("last permanent residence"));
  private SelenideElement pageHeading = $(withText("CSV files for download"));

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

  public DownloadPage scrollToAgeAndSexByEthnicGroupLoadingLink() {
    ageAndSexByEthnicGroupDownloadLinkButton.scrollTo();
    return this;
  }

  public DownloadPage clickTheCensusTotalDownloadLinkButton() {
    censusTotalDownloadLinkButton.click();
    return this;
  }

  public DownloadPage clickTheAgeAndSexByEthnicGroupDownloadLinkButton() {
    ageAndSexByEthnicGroupDownloadLinkButton.click();
    return this;
  }
}
