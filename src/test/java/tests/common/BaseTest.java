package tests.common;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTest {

    @BeforeAll
    static void setUpDriver() {
        /*if (Utils.isEnvironmentRemote()) {
            Configuration.driverManagerEnabled = false;
            Configuration.remote = "http://192.168.0.103:4444/wd/hub";
            Configuration.startMaximized = true;
        }*/
        Configuration.baseUrl = "http://nuwm.edu.ua/";
        //Configuration.browser = "firefox";
    }

}
