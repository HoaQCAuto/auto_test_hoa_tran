package pagefactory.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by HoaQCAuto on 26/09/2017.
 */
public class PORegisterPage {
    // message constants


    // xpath constants

    // id constants
    public static final String E_ID_CHECKBOX_MALE = "RegistrationForm_gender_0";
    public static final String E_ID_CHECKBOX_FEMALE = "RegistrationForm_gender_1";
    public static final String E_ID_INPUT_EMAIL = "RegistrationForm_email";
    public static final String E_ID_INPUT_FULLNAME = "RegistrationForm_first_name";
    public static final String E_ID_INPUT_DATE = "RegistrationForm_day";
    public static final String E_ID_INPUT_MONTH = "RegistrationForm_month";
    public static final String E_ID_INPUT_YEAR = "RegistrationForm_year";
    public static final String E_ID_INPUT_PASSWORD = "RegistrationForm_password";
    public static final String E_ID_INPUT_CONFIRM_PASSWORD = "RegistrationForm_password2";
    public static final String E_ID_BTN_SEND = "send";



    // xpath variables

    // id variables
    @FindBy(id = E_ID_CHECKBOX_MALE)
    public WebElement checkboxMale;
    @FindBy(id = E_ID_CHECKBOX_FEMALE)
    public WebElement checkboxFemale;
    @FindBy(id = E_ID_INPUT_EMAIL)
    public WebElement inputEmail;
    @FindBy(id = E_ID_INPUT_FULLNAME)
    public WebElement inputFullName;
    @FindBy(id = E_ID_INPUT_PASSWORD)
    public WebElement inputPassword;
    @FindBy(id = E_ID_INPUT_CONFIRM_PASSWORD)
    public WebElement inputConfirmPassword;
    @FindBy(id = E_ID_BTN_SEND)
    public WebElement btnSend;


    // by id objects

}
