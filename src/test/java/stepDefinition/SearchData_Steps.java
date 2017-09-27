package stepDefinition;

import appModules.CreateCustomer_Action;
import appModules.SearchData_Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchData_Steps {
    String url;
    SearchData_Action action = new SearchData_Action();

    @Given("^I want to go on home page")
    public void i_want_to_go_on_home_page() throws Throwable {

        action.navigateToHomePage();
    }

    @When("^I input key word and do search action")
    public void i_input_key_word_and_do_search_action() throws Throwable {
        action.inputDataForSearch();
    }

    @Then("I view an search result correctly")
    public void i_view_an_search_result_correctly( )throws Throwable {
        action.verifySearchValueCorrectly();
    }
}
