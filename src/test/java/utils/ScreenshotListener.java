package utils;

import org.testng.TestListenerAdapter;

public class ScreenshotListener extends TestListenerAdapter {
  
 /* @Override
  public void onTestFailure(ITestResult result) {
    saveScreenshot();
  }
  
  @Override
  public void onTestSuccess(ITestResult result) {
    saveScreenshot();
  }
  
  *//*@Attachment(value = "Page screenshot", type = "image/png")
  public byte[] saveScreenshot() {
    return ((TakesScreenshot) DriverHelper.getDriver()).getScreenshotAs(OutputType.BYTES);
  }*/
}
