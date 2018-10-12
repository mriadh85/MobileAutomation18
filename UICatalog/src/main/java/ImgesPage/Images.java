package ImgesPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * riadh 10/18
 */
public class Images extends Base {
    @FindBy(xpath = "//XCUIElementTypeSlider[@name='Duration']")
    private WebElement imageDurationSlider;

    public void setImageDurationSlider(){
        imageDurationSlider.click();
    }
}
