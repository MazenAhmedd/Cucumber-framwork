package stepDefinitions;

import Cucumber.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchPage;

import java.io.IOException;

public class SearchStepDefinitions {

    WebDriver driver;
    HomePage hPage ;
    SearchPage sPage ;

    @Given("^User is on greenKart Landing page$")
    public void userIsOnGreenKartLandingPage() throws IOException {
        driver = DriverFactory.getDriver("chrome");
    }

    @Then("^User search for a product (.+)$")
    public void userSearchForAProduct(String product) throws InterruptedException {
        hPage = new HomePage(driver);
        hPage.getSearchElement().sendKeys(product);
        Thread.sleep(2000);
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void checkTheProductResultsAreDisplayed(String product) {
        sPage = new SearchPage(driver);
        Assert.assertTrue(sPage.getProductName().contains(product));
    }

    @And("^add items to cart$")
    public void addItemsToCart() {
        sPage = new SearchPage(driver);
        sPage.getQuantity().click();
        sPage.addToCartButton().click();
    }
}
