package supportFactory;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

/**
 * Created by HoaQCAuto on 26/09/2017.
 */
public class PageUtils {
    public static void enterText(WebElement element, String strData) {
        element.sendKeys(strData);
    }
}
