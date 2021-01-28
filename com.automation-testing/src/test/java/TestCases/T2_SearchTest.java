package TestCases;

import TestCaseFunctions.SearchFunction;
import Utilities.BaseTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
public class T2_SearchTest extends BaseTest {
    @Test
    public void SearchTest(){
        SearchFunction searchFunction=new SearchFunction(driver);
        searchFunction.SearchTest();
    }

}
