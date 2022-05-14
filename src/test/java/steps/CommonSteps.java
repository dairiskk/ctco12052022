package steps;

import infrastructure.BaseStep;
import infrastructure.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.Logger;
import pageObjects.NavigationPageObject;

public class CommonSteps extends BaseStep {

    private static Logger log = Logger.getLogger(CommonSteps.class);
    public CommonSteps(TestContext testContext) {
        super(testContext);
    }

    @Given("Log in to {} page")
    public void logInToPage(String page) {
        ctx().getDriver().get(page);
        log.info(page);
    }
}
