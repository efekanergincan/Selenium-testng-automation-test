package TestCases;

import TestCaseFunctions.LoginFunction;
import Utilities.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners
public class T3_ProductTest extends BaseTest {
    @Test
    public void ProductTest(){
        LoginFunction loginFunction =new LoginFunction(driver);
        loginFunction.addProduct();
        loginFunction.login();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
