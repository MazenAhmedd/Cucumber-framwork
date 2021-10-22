package Cucumber;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverFactory {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver(String BrowserType) throws IOException {
        if (BrowserType.equalsIgnoreCase("chrome")) {
            prop = new Properties();
            FileInputStream fis = new FileInputStream
                    ("D:\\AutomationProjects\\Cucumber\\CucumberFramework\\src\\main\\java\\Cucumber\\global.properties");
            prop.load(fis);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(prop.getProperty("greenKartUrl"));
            driver.manage().window().maximize();
            return driver;
        } else if (BrowserType.equalsIgnoreCase("firefox")) {
            prop = new Properties();
            FileInputStream fis = new FileInputStream
                    ("D:\\AutomationProjects\\Cucumber\\CucumberFramework\\src\\main\\java\\Cucumber\\global.properties");
            prop.load(fis);
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(prop.getProperty("greenKartUrl"));
            driver.manage().window().maximize();
            return driver;
        } else {
            prop = new Properties();
            FileInputStream fis = new FileInputStream
                    ("D:\\AutomationProjects\\Cucumber\\CucumberFramework\\src\\main\\java\\Cucumber\\global.properties");
            prop.load(fis);
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get(prop.getProperty("greenKartUrl"));
            driver.manage().window().maximize();
            return driver;
        }
    }
}
