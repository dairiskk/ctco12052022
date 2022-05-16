package steps;

import infrastructure.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.log4j.BasicConfigurator;

public class Hooks extends BaseStep {
    TestContext testContext;

    public Hooks(TestContext testContext) {
        super(testContext);
        this.testContext = testContext;
    }
    @Before
    public void BeforeSteps() {
        BasicConfigurator.configure();
    }

    @After
    public void AfterSteps() {
        this.testContext.getScenarioContext().getDriver().close();
    }
}
