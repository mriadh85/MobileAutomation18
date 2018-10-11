package pages;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Menu\"]")
    private WebElement navigationDropDownBtn;

    @FindBy(id = "br.com.golmobile.nypost:id/turn_on_notifications_item")
    private WebElement notificationIcon;

    public void clickOnNavDropDown(){
        navigationDropDownBtn.click();
    }
    public void clickOnNotificationIcon(){
        notificationIcon.click();
    }
}
