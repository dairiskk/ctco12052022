package steps;

import infrastructure.TestContext;
import io.cucumber.java.en.Then;
import pageObjects.NavigationPageObject;

public class NavigationPageSteps extends BaseStep {

    public NavigationPageObject navigationPageObject = new NavigationPageObject(ctx().getDriver());

    public NavigationPageSteps(TestContext testContext) {
        super(testContext);
    }

    @Then("Open {} menu and click {} from the list")
    public void openCareersMenuAndClickVacanciesFromTheList(String menuItem, String submenuItem) throws Exception {
        if (menuItem.equalsIgnoreCase("careers")) {
            navigationPageObject.openCareersMenu();
            navigationPageObject.clickSubmenuItem(submenuItem);
        } else {
            throw new Exception(String.format("menu item %s does not exist", menuItem));
        }
    }
}
