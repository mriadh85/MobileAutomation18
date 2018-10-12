package iPhone;

import UiCatalogPage.UiCatalog;
import WebPage.Web;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestWebPage extends Base {
    @BeforeMethod
    public Web web() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getWeb();
        return PageFactory.initElements(ad, Web.class);
    }
    @Test
    public void testAppleHomeIcon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        web().clickOnAppleIcon();
    }
}
