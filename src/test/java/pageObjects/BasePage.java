package pageObjects;

import infrastructure.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BasePage {
    Driver driver;

    BasePage(Driver driver) {
        this.driver = driver;
    }

    public void hoverElement(WebElement elem) {
        Actions action = this.driver.getActions();
        action.moveToElement(elem).perform();
    }
}
