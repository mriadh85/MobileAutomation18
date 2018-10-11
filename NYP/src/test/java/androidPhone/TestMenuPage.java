package androidPhone;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageNYP;
import pages.MenuPage;
import pages.SearchPage;

public class TestMenuPage extends Base {
    @BeforeMethod
    public HomePageNYP homePageNYP() {
        return PageFactory.initElements(ad, HomePageNYP.class);
    }
    public MenuPage menuPage() {
        return PageFactory.initElements(ad, MenuPage.class);
    }
    @Test(priority = 1, enabled = true)
    public void testSearchArticle() throws InterruptedException {
        homePageNYP().clickOnNavDropDown();
        SearchPage searchPage = menuPage().searchArticle();
        searchPage.sendTextToSearchBox();
        sleep(5);
    }
}
