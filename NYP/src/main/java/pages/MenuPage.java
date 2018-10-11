package pages;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends Base {
    @FindBy(id = "br.com.golmobile.nypost:id/search_container")
    private WebElement articleSearchBox;

    public  SearchPage searchArticle(){
        articleSearchBox.click();
        return PageFactory.initElements(ad, SearchPage.class);
    }
}
