package tests.experimental;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import tests.common.BaseTest;

import static com.codeborne.selenide.Selenide.open;

public class experimental extends BaseTest {

    @Test
    public void test() {
       open("https://google.com");
    }
}
