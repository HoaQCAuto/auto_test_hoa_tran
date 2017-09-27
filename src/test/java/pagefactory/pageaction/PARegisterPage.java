package pagefactory.pageaction;

import common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import pagefactory.pageobject.PORegisterPage;
import supportFactory.PageUtils;

/**
 * Created by HoaQCAuto on 26/09/2017.
 */
public class PARegisterPage extends PORegisterPage {
    WebDriver driver;

    public void inputDataForEmail(){
        PageUtils.enterText(inputEmail, Constants.TEXT_VALID_EMAIL);
    }

    public void inputDataForName(){
        PageUtils.enterText(inputFullName,Constants.TEXT_NAME);
    }

    public void inputDataForDate(){
        Select oSelectDate = new Select(driver.findElement(By.id(E_ID_INPUT_DATE)));
        oSelectDate.selectByValue(Constants.SELECT_DATE);
    }

    public void inputDataForMonth(){
        Select oSelectMonth = new Select(driver.findElement(By.id(E_ID_INPUT_MONTH)));
        oSelectMonth.selectByValue(Constants.SELECT_MONTH);
    }

    public void inputDataForYear(){
        Select oSelectYear = new Select(driver.findElement(By.id(E_ID_INPUT_YEAR)));
        oSelectYear.selectByValue(Constants.SELECT_YEAR);
    }

    public void inputDataForPassword(){
        PageUtils.enterText(inputPassword, Constants.TEXT_PASSWORD);
    }

    public void inputDataForConfirmPassword(){
        PageUtils.enterText(inputConfirmPassword, Constants.TEXT_CONFIRM_PASSWORD);
    }

    public void selectMaleGender(){
        checkboxMale.click();
    }

    public void selectFeMaleGender(){
        checkboxFemale.click();
    }

    public void clickSendButton(WebDriver driver){
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.id(E_ID_INPUT_PASSWORD));
        je.executeScript("arguments[0].scrollIntoView(true);",element);
        btnSend.click();
    }

    public void registerUser(WebDriver driver){
        selectMaleGender();
        inputDataForEmail();
        inputDataForName();
        inputDataForDate();
        inputDataForMonth();
        inputDataForYear();
        inputDataForPassword();
        inputDataForConfirmPassword();
        clickSendButton(driver);
    }

    public void goToHere(){
        driver.get(Constants.REGISTER_URL);
    }

    public PARegisterPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
