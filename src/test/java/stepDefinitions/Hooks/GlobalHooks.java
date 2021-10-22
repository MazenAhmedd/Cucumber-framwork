package stepDefinitions.Hooks;

import Cucumber.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class GlobalHooks extends DriverFactory {

    @Before("@SeleniumTest")
    public void BeforeAllHoke() {
        System.out.println("global before hook");
    }

    @After("@SeleniumTest")
    public void afterAllHook() {
        driver.quit();
    }
}
