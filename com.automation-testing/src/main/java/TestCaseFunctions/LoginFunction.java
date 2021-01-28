package TestCaseFunctions;

import Utilities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginFunction extends BasePage {
    public LoginFunction(WebDriver driver) {
        super(driver);
    }


    private By css=By.cssSelector(" a[class='personaclick-search-product']:nth-child(2)");
    private By login=By.cssSelector("a[class='my-account has-not-login']");
    private By mail=By.id("j_username");
    private By pass=By.id("j_password");
    private By log=By.id("customerLoginButton");

    public void addProduct(){
        element(css).click();

    }
    public void login(){
        element(login).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        //You should write your log infos.
        element(mail).sendKeys("-");//username
        element(pass).sendKeys("-");//password
        element(log).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }
}
