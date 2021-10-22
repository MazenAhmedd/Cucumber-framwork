package stepDefinitions.Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {

    //the hooks class should be within the same the STEP definition package
    @Before("@mobileTest")
    public void beforeValidation() {
        System.out.println("before mobile hook");
    }

    @After("@mobileTest")
    public void afterValidation() {
        System.out.println("after mobile hook");
    }

    @Before("@webTest")
    public void beforeWebHook() {
        System.out.println("Before Web hook");
    }

    @After("not @webTest or @mobileTest")
    public void afterAllHook() {
        System.out.println("After all hook");
    }

    @Before("not @webTest or @mobileTest")
    public void BeforeAllHoke() {
        System.out.println("Before all hook");
    }

    @After("@webTest")
    public void afterWebHook() {
        System.out.println("After web hook");
    }

}
