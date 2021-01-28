package TestCaseFunctions;

import Utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class SearchFunction extends BasePage {
    public SearchFunction(WebDriver driver) {
        super(driver);
    }
    private By text=By.name("s");
    private By searchBtn=By.className("icon-search");

    public void SearchTest(){
        element(text).sendKeys("bilgisayar");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
