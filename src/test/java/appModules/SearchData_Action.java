package appModules;

import common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.pageaction.PALazadaHomePage;
import pagefactory.pageaction.PARegisterPage;
import pagefactory.pageaction.PARegisterSuccesfulPage;
import pagefactory.pageaction.PASearchResultPage;
import webDriver.Driver;

import static pagefactory.pageobject.POLazadaHomePage.SEARCH_VALUE;

public class SearchData_Action {
    static WebDriver driver = Driver.getCurrentDriver();
    static WebDriverWait wait = new WebDriverWait(driver, 10);
    PALazadaHomePage paLazadaHomePage = new PALazadaHomePage(driver);
    PASearchResultPage paSearchResultPage = new PASearchResultPage(driver);


    public void navigateToHomePage() {

        paLazadaHomePage.goToHere();
    }

    public void inputDataForSearch(){
        paLazadaHomePage.searchKeyword(paLazadaHomePage.SEARCH_VALUE);
    }

    public void verifySearchValueCorrectly(){
        paSearchResultPage.scrollToResultList();
        paSearchResultPage.isCorrectResult(paLazadaHomePage.SEARCH_VALUE);
    }
}
