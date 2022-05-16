package steps;

import infrastructure.BaseStep;
import infrastructure.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.VacanciesPageObject;

public class VacanciesPageSteps extends BaseStep {

    VacanciesPageObject vacanciesPageObject = new VacanciesPageObject(ctx().getDriver());

    public VacanciesPageSteps(TestContext testContext) {
        super(testContext);
    }

    @Then("Open vacancy with title {}")
    public void openVacancyWithTitleTestAutomationEngineer(String vacancy) throws Exception {
        vacanciesPageObject.openVacancyByName(vacancy);
    }
}
