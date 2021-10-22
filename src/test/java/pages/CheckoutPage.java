package pages;

import Cucumber.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage  {
    public WebDriver driver;
    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elements
    By productText = By.cssSelector("p.product-name");
    By cartButton = By.cssSelector("img[alt='Cart']");
    By checkoutButton = By.xpath("//button[text()='PROCEED TO CHECKOUT']");

    //Actions on elements
    public String getProductText() {
        return driver.findElement(productText).getText();
    }
    public WebElement CartPageButton (){
        return  driver.findElement(cartButton);
    }
    public WebElement checkOutButton(){
        return driver.findElement(checkoutButton);
    }
}
