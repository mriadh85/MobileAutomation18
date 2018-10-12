package iPhone;

import ToolbarPage.Toolbar;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestToolbarPage extends Base {
    @BeforeMethod
    public Toolbar toolbar() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getSegments();
        return PageFactory.initElements(ad, Toolbar.class);
    }

    @Test
    public void testDefaultBtn(){
        toolbar().clickOnDefaultBtn();
    }
    @Test
    public void testBlackBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        toolbar().clickOnBlackBtn();
    }
    @Test
    public void testTranslucentBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        toolbar().clickOnTranslucentBtn();
    }
}
