package pageObjects;

import infrastructure.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class NavigationPageObject extends BasePage {
    protected Driver driver;
    protected BasePage basePage;

    public By careersMenuItem = By.xpath("//ul[@id='menu-main']/li[a[contains(@href, '/careers/')]]");
    public By navigationPageSection = By.xpath("//div[@id = 'navbarCollapse']");

    public NavigationPageObject(Driver driver) {
        super(driver);
        this.driver = driver;
        this.basePage = new BasePage(this.driver);
        Assertions.assertTrue(driver.findElement(navigationPageSection).isDisplayed());
    }

    public void openCareersMenu() {
        basePage.hoverElement(driver.findElement(careersMenuItem));
    }

    public void clickSubmenuItem(String subMenuItem) throws Exception {
        if (subMenuItem.equalsIgnoreCase("vacancies")) {
            driver.findElement(careersMenuItem).findElement(By.xpath(".//li[a[contains(@href, 'vacancies/')]]//a")).click();
        } else {
            throw new Exception("submenu in careers menu " + subMenuItem + " does not exist");
        }
    }
}
