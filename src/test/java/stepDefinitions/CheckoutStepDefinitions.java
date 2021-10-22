package stepDefinitions;

import Cucumber.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CheckoutPage;

public class CheckoutStepDefinitions extends DriverFactory {

    CheckoutPage cPage ;


    @Then("^verify selected (.+) product are displayed in checkout page$")
    public void verifySelectedProductAreDisplayedInCheckoutPage(String product){
        cPage = new CheckoutPage(driver);
        Assert.assertTrue(cPage.getProductText().contains(product));
        System.out.println(product);
    }

    @And("^user proceeded to checkout page for purchase$")
    public void userProceededToCheckoutPageForPurchase() {
        cPage = new CheckoutPage(driver);
        cPage.CartPageButton().click();
        cPage.checkOutButton().click();
    }
}
