package iPhone;

import ControlsPage.Controls;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ControlsTest extends Base {
    @BeforeMethod
    public Controls controls() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getControls();
        return PageFactory.initElements(ad, Controls.class);
    }

    @Test(priority = 1, enabled = false)
    public void testSwitch(){
        controls().clickonSwitch();
    }
    @Test(priority = 2, enabled = false)
    public void testStandardSlider(){
        controls().actionOnStandardSlider();
    }
    @Test(priority = 3, enabled = true)
    public void testCustomSlider(){
        controls().actionOnCustomSlider();
    }
}
