package pagefactory.pageaction;

import common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagefactory.pageobject.POLazadaHomePage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import static org.hamcrest.Matchers.is;

/**
 * Created by HoaQCAuto on 27/09/2017.
 */
public class PALazadaHomePage extends POLazadaHomePage {
    WebDriver driver;
    public void goToHere() {
        driver.get(Constants.BASE_URL);
        assertThat(driver.getTitle(), is(HOMEPAGE_TITLE));
    }

    public void searchKeyword(String keyword) {
        searchBox.sendKeys(keyword);
        searchBtn.click();
    }

    public PALazadaHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
