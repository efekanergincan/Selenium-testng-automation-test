package TestCases;


import Listener.Listener;
import TestCaseFunctions.HomePage;
import Utilities.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Listeners({Listener.class})
public class T1_HomePageTest extends BaseTest {
    @Test
    public void HomeTest(){
        HomePage homePage=new HomePage(driver);
        homePage.HomePage();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
