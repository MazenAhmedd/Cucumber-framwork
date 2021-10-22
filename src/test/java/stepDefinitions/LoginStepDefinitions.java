package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

//@RunWith(Cucumber.class) // this is optional
public class LoginStepDefinitions {


    //background stepDef
    @Given("^validate the browser$")
    public void validateTheBrowser() {
        System.out.println("opening the browser");
    }

    @When("^Browser is triggered$")
    public void browserIsTriggered() {
        System.out.println("browser is triggered");
    }

    @Then("^check if browser is displayed$")
    public void checkIfBrowserIsDisplayed() {
        System.out.println("browser is opened and displayed");
    }

    ////////////////////////
    @Given("^User is on NetBanking landing page$")
    public void userIsOnNetBankingLandingPage() {
        // code to user navigate to login url
        System.out.println("navigate to landing page ");
    }

//    @When("^User login into application with username and password$")
//    public void userLoginIntoApplicationWithUsernameAndPassword() {
//        // code to log in the application with username and password
//        System.out.println("logged in successfully ");
//    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userLoginIntoApplicationWithUserNameAndPassword(String userName, String password) {
        System.out.println("login with the below data");
        System.out.println("user name is " + userName);
        System.out.println("password is " + password);
    }

    @When("^User login in to application with (.+) and (.+)$")
    public void userLoginIntoApplicationWithAnd(String username, String password) {
        System.out.println("login with the below data");
        System.out.println("user name is " + username);
        System.out.println("password is " + password);
    }

    @When("^User sign up with following details$")
    public void userSignUpWithFollowingDetails(DataTable data) {
        List<List<String>> obj = data.asLists();
        //System.out.println(obj.get(rowIndex).get(columnIndex));
        System.out.println("using data table to pass the values as below ..");
        System.out.println("row with index 0 and column with index 0 is " + obj.get(0).get(0));
        System.out.println("row with index 0 and column with index 1  is " + obj.get(0).get(1));
        System.out.println("row with index 0 and column with index 2  is " + obj.get(0).get(2));
        System.out.println("row with index 0 and column with index 3  is " + obj.get(0).get(3));
        System.out.println("row with index 0 and column with index 4 is  " + obj.get(0).get(4));
    }

    @Then("^Home page is opened$")
    public void homePageIsOpened() {
        // code for home page validation
        System.out.println("validated home page");
    }

//    @And("^Cards are displayed$")
//    public void cardsAreDisplayed() {
//        // code for cards validations
//        System.out.println("validated cards ");
//    }
//
//    @And("^Cards are not displayed$")
//    public void cardsAreNotDisplayed() {
//        System.out.println("cards are not displayed");
//    }

    @And("^Cards  displayed are \"([^\"]*)\"$")
    public void cardsDisplayedAreSomething(String action) {
        System.out.println(action);
    }
}
