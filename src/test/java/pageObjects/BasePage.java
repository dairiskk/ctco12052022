package pageObjects;

import infrastructure.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    Driver driver;

    BasePage(Driver driver) {
        this.driver = driver;
    }

    public void hoverElement(WebElement elem) {
        Actions action = this.driver.getActions();
        action.moveToElement(elem).perform();
    }
    public void waitForElementToBeDisplayed(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
