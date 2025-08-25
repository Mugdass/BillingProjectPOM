package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverFactory;
import utils.ReportingUtils;

public class SampleFailTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.get("https://example-billing-app.com");
    }

    @Test
    public void failingTestExample() {
        try {
            driver.findElement(By.id("nonExistingElement"));
            Assert.fail("This line should never be reached.");
        } catch (Exception e) {
            ReportingUtils.captureScreenshot(driver);
            Assert.fail("Expected failure: Element not found.", e);
        }
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
