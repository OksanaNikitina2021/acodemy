import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.MainPage;
import page_object.ProductPage;
import utils.WebDriverManager;

import static utils.PropertiesReader.getProperties;

@Slf4j

public class CouponCodeTest {

    private final WebDriver driver = WebDriverManager.getInstance();
    private final MainPage mainPage = new MainPage();

    @BeforeEach
    public void setUp() {
        driver.get(getProperties().getProperty("home.page"));
    }

    @Test
    public void applyCouponTest() {
        mainPage.selectProductFromListByName("Polo").addProductToCart();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
