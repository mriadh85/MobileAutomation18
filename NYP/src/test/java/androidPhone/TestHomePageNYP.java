package androidPhone;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageNYP;

public class TestHomePageNYP extends HomePageNYP {
    @BeforeMethod
    public HomePageNYP homePageNYP() {
        return PageFactory.initElements(ad, HomePageNYP.class);
    }
    @Test(priority = 1, enabled = false)
    public void testNavDropDown(){
        homePageNYP().clickOnNavDropDown();
    }

    @Test(priority = 2, enabled = false)
    public void testNotificationIcon(){
        homePageNYP().clickOnNotificationIcon();
    }

    @Test(priority = 3, enabled = false)
    public void testHeadLine1(){
        homePageNYP().clickOnHeadLine1();
    }

    @Test(priority = 4, enabled = false)
    public void testHeadLine2(){
        homePageNYP().clickOnHeadLine2();
    }

    @Test(priority = 5, enabled = false)
    public void testHeadLine3(){
        homePageNYP().clickOnHeadLine3();
    }

    @Test(priority = 6, enabled = false)
    public void testHeadLine4(){
        homePageNYP().clickOnHeadLine4();
    }

    @Test(priority = 7, enabled = true)
    public void testHeadLine5(){
        homePageNYP().clickOnHeadLine5();
    }
}
