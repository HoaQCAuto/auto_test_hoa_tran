package pagefactory.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/**
 * Created by HoaQCAuto on 27/09/2017.
 */
public class POSearchResultPage {

    private static final String XPATH_LIST_RESULT_ITEMS = "//div[@class = 'c-product-card__description']/a";

    @FindBy(xpath = XPATH_LIST_RESULT_ITEMS)
    public List<WebElement> resultItemList;

}
