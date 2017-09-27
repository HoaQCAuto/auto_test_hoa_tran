package pagefactory.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HoaQCAuto on 27/09/2017.
 */
public class PORegisterSuccesfulPage {
    // message constants


    // xpath constants
    public static final String E_XPATH_INFO_FRAME = "//div[@class = 'account-dashboard__box account-dashboard__box_first']";

    // id constants

    // xpath variables

    // id variables
    @FindBy(xpath = E_XPATH_INFO_FRAME)
    public WebElement infoFrame;
}
