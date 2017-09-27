package pagefactory.pageaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pagefactory.pageobject.PORegisterSuccesfulPage;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by HoaQCAuto on 27/09/2017.
 */
public class PARegisterSuccesfulPage extends PORegisterSuccesfulPage {
    WebDriver driver;

    public void verifyCreateUserSuccessful(){
        assertThat(infoFrame.isDisplayed(), is(true));
    }

    public PARegisterSuccesfulPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
