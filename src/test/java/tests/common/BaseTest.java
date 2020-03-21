package tests.common;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import utils.Utils;

public abstract class BaseTest {

  @BeforeAll
  static void setUpDriver() {
    if (Utils.isEnvironmentRemote()) {
      Configuration.driverManagerEnabled = false;
      Configuration.remote = "http://192.168.0.103:4444/wd/hub";
    }
    Configuration.baseUrl = "https://lpnu.ua/en";
    Configuration.startMaximized = true;
    //Configuration.timeout = 30000;
  }
}
