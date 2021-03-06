package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver) {
    this.driver = driver;
    }

    // Elements
    By search = By.cssSelector("input[type='search']");
    // WebElement search = driver.findElement(By.cssSelector("input[type='search']"));

    // Actions - methods on elements
    public WebElement getSearchElement() {
        return  driver.findElement(search);
    }
}
