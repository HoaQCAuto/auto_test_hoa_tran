package appModules;

import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.pageaction.PARegisterPage;
import pagefactory.pageaction.PARegisterSuccesfulPage;
import webDriver.Driver;

public class CreateCustomer_Action {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    PARegisterPage paRegisterPage = new PARegisterPage(driver);
    PARegisterSuccesfulPage paRegisterSuccesfulPage = new PARegisterSuccesfulPage(driver);


    public void navigateToCreateCustomerPage() {
        driver.get(Constants.REGISTER_URL);
    }

    public void inputDataCorrectly(){
        paRegisterPage.registerUser(driver);
    }

    public void verifyCreateUserSuccessfully(){
        paRegisterSuccesfulPage.verifyCreateUserSuccessful();
    }
}
