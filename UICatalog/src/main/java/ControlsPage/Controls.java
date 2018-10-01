package ControlsPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * riadh on 09/18.
 */
public class Controls {

    @FindBy(xpath = "//XCUIElementTypeSwitch[@name=\"Standard\"]")
    private WebElement standardSwitch;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Standard\"]")
    private WebElement standardSlider;

    @FindBy(xpath = "//XCUIElementTypeSlider[@name=\"Custom\"]")
    private WebElement customSlider;

    public void clickonSwitch(){
        standardSwitch.click();
    }
    public void actionOnStandardSlider(){
       standardSlider.sendKeys("0.3");
    }
    public void actionOnCustomSlider(){
        customSlider.sendKeys("0.2");
    }

}
