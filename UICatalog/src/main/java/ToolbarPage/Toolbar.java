package ToolbarPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * riadh 10/18
 */
public class Toolbar extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Default\"]")
    private WebElement defaultBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Black\"]")
    private WebElement blackBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Translucent\"]")
    private WebElement translucentBtn;

    public void clickOnDefaultBtn(){
        defaultBtn.click();
    }
    public void clickOnBlackBtn(){
        blackBtn.click();
    }
    public void clickOnTranslucentBtn(){
        translucentBtn.click();
    }

}
