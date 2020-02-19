package tests.experimental;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.CollectionCondition.*;


public class experimental {

    @Test
    public void Test() {
        open("https://google.com");
    }
}
