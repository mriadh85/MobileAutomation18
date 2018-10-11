package login;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Base {
    @FindBy(id = "com.imdb.mobile:id/splash_not_now")
    private WebElement notNowBtn;

    public void clickNotNowBtn(){
        notNowBtn.click();
    }
}
