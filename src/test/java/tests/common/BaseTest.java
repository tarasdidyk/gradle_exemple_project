package tests.common;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import utils.Utils;

public abstract class BaseTest {

    @BeforeAll
    static void setupDriver(String browser) {
        if (Utils.isEnvironmentRemote()) {
            Configuration.driverManagerEnabled = false;
            Configuration.remote = "http://192.168.0.102:4444/wd/hub";
        }
        Configuration.baseUrl = "http://nuwm.edu.ua/";
        Configuration.browser = "firefox";
    }

}
