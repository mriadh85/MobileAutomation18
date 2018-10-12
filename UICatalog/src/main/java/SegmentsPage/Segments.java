package SegmentsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * riadh 10/18
 */
public class Segments extends Base {

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Check\"])[1]")
    private WebElement UiCheckBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Search\"])[1]")
    private WebElement UiSearchBtn;

    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"Tools\"])[1]")
    private WebElement UiToolsBtn;

    public void clickOnCheckBtn(){
        UiCheckBtn.click();
    }
    public void clickOnSearchBtn(){
        UiSearchBtn.click();
    }
    public void clickOnToolsBtn(){
        UiToolsBtn.click();
    }
}
