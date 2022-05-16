package steps;

import infrastructure.TestContext;
import io.cucumber.java.en.Given;
import org.apache.log4j.Logger;

public class CommonSteps extends BaseStep {

    private static Logger log = Logger.getLogger(CommonSteps.class);
    public CommonSteps(TestContext testContext) {
        super(testContext);
    }

    @Given("Log in to {} page")
    public void logInToPage(String page) {
        ctx().getDriver().get(page);
    }
}
