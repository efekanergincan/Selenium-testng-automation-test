package TestCases;

import TestCaseFunctions.BackToMain;
import Utilities.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class T4_BackToMainTest extends BaseTest {
    @Test
    public void BackTest(){
        BackToMain backToMain =new BackToMain(driver);
        backToMain.adding();
    }
}
