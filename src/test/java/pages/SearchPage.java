package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    public WebDriver driver;
    public SearchPage(WebDriver driver){
        this.driver = driver;
    }

    // for ccs locating //tagname[attribute='value']
    // for xpath locating //tagname[@attribute='value']
    By productName = By.cssSelector("h4[class='product-name']");
    By quantity = By.cssSelector("a.increment");
    By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");

    public String getProductName() {
        return driver.findElement(productName).getText();
    }
    public WebElement getQuantity(){
         return  driver.findElement(quantity);
    }
    public WebElement addToCartButton(){
        return driver.findElement(addToCart);
    }
}
