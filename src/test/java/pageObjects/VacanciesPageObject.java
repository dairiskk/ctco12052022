package pageObjects;

import infrastructure.Driver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;

public class VacanciesPageObject extends BasePage {
    protected Driver driver;
    protected BasePage basePage;


    public By vacanciesPage = By.xpath("//body[contains(@class, 'page-template-vacancies')]//div[contains(@class, 'vacancies-main')]");


    public VacanciesPageObject(Driver driver) {
        super(driver);
        this.driver = driver;
        this.basePage = new BasePage(this.driver);
        waitForElementToBeDisplayed(vacanciesPage);
    }

    public void openVacancyByName(String vacancyName) throws Exception {
        if (vacancyName.equalsIgnoreCase("Test Automation Engineer")) {
            driver.findElement(vacanciesPage).findElement(By.xpath(".//li[a[contains(@href, 'test-automation-engineer')]]")).click();
        } else {
            throw new Exception("vacancy " + vacancyName + " not found");
        }
    }


}
