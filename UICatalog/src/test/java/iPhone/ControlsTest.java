package iPhone;

import ControlsPage.Controls;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ControlsTest extends Base {
    @BeforeMethod
    public Controls controls() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getControls();
        return PageFactory.initElements(ad, Controls.class);
    }

    @Test(priority = 1, enabled = false)
    public void testSwitch(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        controls().clickonSwitch();
    }
    @Test(priority = 2, enabled = false)
    public void testStandardSlider(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        controls().actionOnStandardSlider();
    }
    @Test(priority = 3, enabled = true)
    public void testCustomSlider(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        controls().actionOnCustomSlider();
    }
}
