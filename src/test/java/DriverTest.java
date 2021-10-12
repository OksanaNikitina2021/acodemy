import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static utils.PropertiesReader.*;

public class DriverTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(getProperties().getProperty("home.page"));
        //driver.get("https://shop.acodemy.lv");
    }

    @Test
    public void driverTest() {
    }

    @Test
    public void checkIfTitleIsCorrect() {
        assertThat(driver.getTitle(), equalTo("Online shop – acodemy – Just another WordPress site"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
