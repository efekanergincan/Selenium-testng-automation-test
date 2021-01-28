package TestCaseFunctions;

import Utilities.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class BackToMain extends BasePage {
    public BackToMain(WebDriver driver) {
        super(driver);
    }

    private By logo=By.cssSelector("img[title='Teknosa Logo']");
    public void adding(){

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        element(logo).click();

    }
}
