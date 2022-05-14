package infrastructure;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.naming.Context;
import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
    private final Map<String, Object> scenarioContext;
    private final Driver driver;


    public ScenarioContext() {
        scenarioContext = new HashMap<String, Object>();
        this.driver = new Driver();
        this.driver.setBrowser("Chrome");
        this.driver.maximize();
        this.driver.setImplicitWait(5);
    }

    public void setContext(String key, Object value) {
        scenarioContext.put(key, value);
    }

    public Object getContext(String key) {
        return scenarioContext.get(key);
    }

    public Driver getDriver() {
        return this.driver;
    }
}
