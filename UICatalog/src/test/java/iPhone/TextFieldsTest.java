package iPhone;

import common.Base;
import navigate.NavigateUi;
import TextFieldsPage.TextFields;
import UiCatalogPage.UiCatalog;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * riadh 09/18
 */
public class TextFieldsTest extends Base {
    @BeforeMethod
    public TextFields textFields() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTextFields();
        return PageFactory.initElements(ad, TextFields.class);
    }

    @Test(priority = 1, enabled = true)
    public void testTypeOnFields()throws InterruptedException{
        textFields().writeTextToFields();
    }
}
