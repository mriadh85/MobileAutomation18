package pages;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends Base {
    @FindBy(id = "br.com.golmobile.nypost:id/search")
    private WebElement searchBox;

    public void sendTextToSearchBox(){
        searchBox.sendKeys("Politics", Keys.ENTER);
    }
}
