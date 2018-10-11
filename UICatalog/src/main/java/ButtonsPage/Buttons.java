package ButtonsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


/**
 * riadh on 09/18.
 */
public class Buttons extends Base{

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Gray\"]")
    private WebElement backgroundImageBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Right pointing arrow\"]")
    private WebElement imageBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Rounded\"]")
    private WebElement roundedBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
    private WebElement backBtn;

    public void clickOnbackgroundBtn(){
        backgroundImageBtn.click();
    }

    public void clickOnImageBtn(){
        imageBtn.click();
    }

    public void clickOnRoundedBtn(){
        roundedBtn.click();
    }

    public void clickOnBackBtn(){
        backBtn.click();
    }
}

