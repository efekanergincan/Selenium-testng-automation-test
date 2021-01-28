package Listener;

import Utilities.BaseTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listener extends BaseTest implements ITestListener {
    @Override
    public void onTestStart(ITestResult iTestResult) {
      System.out.println("Test is running");
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test successfully done");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed");
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Efekan\\Desktop\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(BaseUrl);
        driver.manage().window().maximize();
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
    System.out.println("all  tests done");
    driver.quit();
    }
}
