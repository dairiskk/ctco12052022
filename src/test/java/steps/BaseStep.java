package steps;

import infrastructure.ScenarioContext;
import infrastructure.TestContext;

public class BaseStep {

    private final ScenarioContext scenarioContext;

    public BaseStep(TestContext testContext) {
        scenarioContext = testContext.getScenarioContext();
    }

    public ScenarioContext ctx() {
        return scenarioContext;
    }
}
