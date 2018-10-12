package iPhone;

import SegmentsPage.Segments;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSegmentPage extends Base {
    @BeforeMethod
    public Segments segments() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getSegments();
        return PageFactory.initElements(ad, Segments.class);
    }

    @Test
    public void testUiCheckBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        segments().clickOnCheckBtn();
    }
    @Test
    public void testUiSearchBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        segments().clickOnSearchBtn();
    }
    @Test
    public void testUiToolsBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        segments().clickOnToolsBtn();
    }
}
