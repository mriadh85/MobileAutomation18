package androidphones;

import common.Base;
import login.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLoginPage extends LoginPage {
    public LoginPage loginPage(){
        return PageFactory.initElements(ad, LoginPage.class);
    }

    @Test(priority = 1, enabled = true)
    public void testNotNowBtn(){
        loginPage().clickNotNowBtn();
    }
}
