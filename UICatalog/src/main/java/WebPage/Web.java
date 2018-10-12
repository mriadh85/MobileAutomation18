package WebPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * riadh 10/18
 */
public class Web extends Base {
    @FindBy(xpath = "//XCUIElementTypeOther[@name=\"Global, navigation\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]")
    private WebElement appleHomeIcon;

    @FindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Open Menu\"])[1]")
    private WebElement openMenuIcon;

    public void clickOnAppleIcon(){
        appleHomeIcon.click();
    }

    public void typeOnMenuIcon() throws InterruptedException {
        openMenuIcon.click();
        sleep(2);
        typeByXpath("//XCUIElementTypeOther[@name=\"Search apple.com\"]", "airPods");
    }

}
