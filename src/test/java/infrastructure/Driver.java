package infrastructure;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Driver {
    WebDriver driver;

    public void setBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            this.driver = new ChromeDriver();
        } else {
            try {
                throw new Exception("Browser " + browser + " not supported");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void maximize() {
        this.driver.manage().window().maximize();
    }

    public void get(String url) {
        this.driver.get(url);
    }

    public void close() {
        this.driver.close();
    }

    public Actions getActions() {
        return new Actions(this.driver);
    }

    public WebElement findElement(By elem) {
        return this.driver.findElement(elem);
    }

    public void setImplicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}
