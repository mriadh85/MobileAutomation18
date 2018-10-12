package iPhone;

import TransitionsPage.Transitions;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestTransitionsPage extends Base {
    @BeforeMethod
    public Transitions transitions() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getTransitions();
        return PageFactory.initElements(ad, Transitions.class);
    }

    @Test
    public void testFlipImageBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        transitions().clickOnFlipImage();
    }
    @Test
    public void testCurlImageBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        transitions().clickOnCurlImage();
    }
}
