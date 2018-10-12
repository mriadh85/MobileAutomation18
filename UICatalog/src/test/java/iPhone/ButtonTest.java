package iPhone;

import ButtonsPage.Buttons;
import common.Base;
import navigate.NavigateUi;
import UiCatalogPage.UiCatalog;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import static common.Base.ad;

public class ButtonTest extends Base {
    @BeforeMethod
    public Buttons buttons() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getButtonPage();
        return PageFactory.initElements(ad, Buttons.class);
    }

    @Test(priority = 1, enabled = false)
    public void testBackgroundBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttons().clickOnbackgroundBtn();
    }
    @Test(priority = 2, enabled = false)
    public void testImagedBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttons().clickOnImageBtn();
    }
    @Test(priority = 3, enabled = false)
    public void testRoundedBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttons().clickOnRoundedBtn();
    }
    @Test(priority = 4, enabled = true)
    public void testBackBtn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        buttons().clickOnBackBtn();
    }

}
