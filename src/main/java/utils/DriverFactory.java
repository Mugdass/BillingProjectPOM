package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.time.Duration;
import java.util.Objects;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            String browser = System.getProperty("browser", ConfigReader.get("browser")).toLowerCase();
            boolean headless = Boolean.parseBoolean(System.getProperty("headless", ConfigReader.get("headless")));

            switch (browser) {
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    ChromeOptions options = new ChromeOptions();
                    if (headless) options.addArguments("--headless=new");
                    driver = new ChromeDriver(options);
                    break;
            }
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void quitDriver() {
        if (Objects.nonNull(driver)) {
            driver.quit();
            driver = null;
        }
    }
}
