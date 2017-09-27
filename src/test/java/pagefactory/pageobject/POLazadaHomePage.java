package pagefactory.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HoaQCAuto on 27/09/2017.
 */
public class POLazadaHomePage {
    public static final String HOMEPAGE_TITLE = "LAZADA Vietnam™ - Mua Hàng Trực Tuyến Giá Tốt";

    public static final String XPATH_SEARCH_BOX = "//input[@type = 'search']";

    public static final String XPATH_SEARCH_BTN = "//button[@class = 'c-header-search__input-group-button c-header-search__input-group-button_type_search']";

    public static final String SEARCH_VALUE = "SH150";

    @FindBy(xpath = XPATH_SEARCH_BOX)
    public WebElement searchBox;

    @FindBy(xpath = XPATH_SEARCH_BTN)
    public WebElement searchBtn;
}
