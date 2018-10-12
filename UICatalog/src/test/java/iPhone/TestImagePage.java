package iPhone;

import ImgesPage.Images;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestImagePage extends Base {
    @BeforeMethod
    public Images images() {
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getImages();
        return PageFactory.initElements(ad, Images.class);
    }

    @Test
    public void testImageDurationSlider(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        images().setImageDurationSlider();
    }
}
