package pagefactory.pageaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pagefactory.pageobject.POSearchResultPage;

/**
 * Created by HoaQCAuto on 27/09/2017.
 */
public class PASearchResultPage extends POSearchResultPage {
    WebDriver driver;

    public void scrollToResultList() {
        Actions actions = new Actions(driver);
        actions.moveToElement(resultItemList.get(0));
        actions.perform();
    }

    public boolean isCorrectResult(String searchKeyword) {
        boolean isResult = true;

        for (WebElement resultItem : resultItemList) {
            if (!resultItem.getText().toLowerCase().contains(searchKeyword)) {
                isResult = false;
                break;
            }
        }

        return isResult;
    }

    public PASearchResultPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
