package pageObjects;

import infrastructure.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestAutomationPage extends BasePage {
    protected Driver driver;
    protected BasePage basePage;

    public By testAutomationSection = By.xpath("//div[contains(@class, 'vacancies-second-contents') and contains(@data-href, 'automation-engineer-3')]");

    public TestAutomationPage(Driver driver) {
        super(driver);
        this.driver = driver;
        this.basePage = new BasePage(this.driver);
        waitForElementToBeDisplayed(testAutomationSection);
    }

    public List<WebElement> getProfessionalSkillsAndQualifications() {
        WebElement listOfSkills = this.driver.findElement(testAutomationSection).findElements(By.xpath(".//p[strong[contains(text(), 'Professional skills and qualification:')]]/following-sibling::ul")).get(0);
        return listOfSkills.findElements(By.xpath(".//li"));
    }

}
