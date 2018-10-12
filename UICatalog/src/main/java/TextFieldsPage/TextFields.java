package TextFieldsPage;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Edited by riadh 09/18.
 */
public class TextFields extends Base{
    @FindBy(xpath = "//XCUIElementTypeTextField[@name=\"Normal\"]")
    WebElement standardField;

    public void typeOnUiTextField(){
        typeByXpath("//XCUIElementTypeTextField[@name=\"Normal\"]", "Standard text");
    }
    public void typeOnUiTextFieldRounded(){
        typeByXpath("//XCUIElementTypeTextField[@name=\"Rounded\"]", "Rounded");
    }
    public void typeOnUiTextFieldSecure(){
        typeByXpath("//XCUIElementTypeTextField[@name=\"Secure\"]", "test123");
    }
    public void typeOnUiTextFieldLeftView(){
        typeByXpath("//XCUIElementTypeTextField[@name=\"Check\"]", "abcd1234");
    }

    public void writeTextToFields(String items)throws InterruptedException{
        standardField.click();
        standardField.sendKeys(items);
    }
}
