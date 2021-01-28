package TestCaseFunctions;

import Utilities.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public String title(){return driver.getTitle();}
    public void HomePage(){
    Assert.assertEquals(title(), "Teknosa | Herkes İçin Teknoloji - Teknosa Alışveriş Sitesi");
    }
}
