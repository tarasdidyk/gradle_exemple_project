package tests.experimental;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DownloadPage;
import tests.common.BaseTest;

public class experimental extends BaseTest {

  @Tag("test")
  @Test
  public void downloadLogLevelReportNetNetworkTest() throws InterruptedException {
    DownloadPage downloadPage = new DownloadPage();
    downloadPage.openDownloadPage();
    downloadPage.scrollToCensusTotalLoadingLink();
    downloadPage.clickTheCensusTotalDownloadLinkButton();
    Selenide.sleep(10000);
  }
}
