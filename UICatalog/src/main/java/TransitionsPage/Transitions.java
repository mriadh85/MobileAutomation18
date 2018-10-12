package TransitionsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * riadh 10/18
 */
public class Transitions extends Base {

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Flip Image\"]")
    private WebElement flipImageBtn;

    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"Curl Image\"]")
    private WebElement curlImageBtn;

    public void clickOnFlipImage(){
        flipImageBtn.click();
    }
    public void clickOnCurlImage(){
        curlImageBtn.click();
    }
}
