package steps;

import infrastructure.TestContext;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import pageObjects.TestAutomationPage;

public class TestAutomationPageSteps extends BaseStep {

    public TestAutomationPage testAutomationPage = new TestAutomationPage(ctx().getDriver());

    public TestAutomationPageSteps(TestContext testContext) {
        super(testContext);
    }

    @Then("Verify that paragraph under Professional skills and qualification: contains exactly {int} skills.")
    public void verifyThatParagraphUnderProfessionalSkillsAndQualificationContainsExactlySkills(int skillCount) {
        Assertions.assertEquals(testAutomationPage.getProfessionalSkillsAndQualifications().size(), skillCount);
    }
}
