package stepDefinition;

import appModules.CreateCustomer_Action;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateCustomer_Steps {
    String url;
    CreateCustomer_Action action = new CreateCustomer_Action();

    @Given("^I want to go on register page")
    public void i_want_to_go_on_register_page() throws Throwable {

        action.navigateToCreateCustomerPage();
    }

    @When("^I input correctly information")
    public void i_input_correctly_information() throws Throwable {
        action.inputDataCorrectly();
    }

    @Then("I will create a new account successfully")
    public void i_will_create_a_new_account_successfully( )throws Throwable {
        action.verifyCreateUserSuccessfully();
    }
}
