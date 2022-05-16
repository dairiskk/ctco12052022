package infrastructure;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Driver implements WebDriver {
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

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    public void close() {
        this.driver.close();
    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }

    public Actions getActions() {
        return new Actions(this.driver);
    }

    public WebElement findElement(By elem) {
        return this.driver.findElement(elem);
    }

    @Override
    public String getPageSource() {
        return null;
    }

    public void setImplicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}
