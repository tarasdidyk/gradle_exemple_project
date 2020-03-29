package tests.experimental;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.DownloadPage;
import tests.common.BaseTest;
import utils.Utils;

import java.io.File;
import java.io.IOException;

public class experimental extends BaseTest {

  @Tag("test")
  @Test
  public void downloadLogLevelReportNetNetworkTest() throws InterruptedException, IOException {
    DownloadPage downloadPage = new DownloadPage();

    //Utils.cleanDirectory();
    downloadPage.openDownloadPage();
    downloadPage.scrollToAgeAndSexByEthnicGroupLoadingLink();
    //downloadPage.clickTheCensusTotalDownloadLinkButton();
    downloadPage.clickTheAgeAndSexByEthnicGroupDownloadLinkButton();
    Utils.isFileDownloadedToTheDownloadFolder("international-migration-December-2019-citizenship-by-visa-by-country-of-last-permanent-residence.csv", 50);
    //Assertions.assertTrue(Utils.isDirectoryClean(), "The directory is no clean");

  }
}
