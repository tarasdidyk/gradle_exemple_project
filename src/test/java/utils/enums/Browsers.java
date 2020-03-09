package utils.enums;

public enum Browsers {
    CHROME("chrome"),
    FIREFOX("firefox"),
    INTERNET_EXPLORER("ie");

    private String browser;

    Browsers(String  browser) {
        this.browser = browser;
    }

    @Override
    public String toString() {
        return browser;
    }
}
