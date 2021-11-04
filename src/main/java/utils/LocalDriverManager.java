package utils;

import exceptions.UnsupportedDriverException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Locale;

public class LocalDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance(){
        if(driver == null){
            driver = configureDriver();
        }
        return driver;
    }

    public static WebDriver configureDriver(){
        String browser = PropertiesReader.getProperties().getProperty("browser").toUpperCase();
        switch (browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                //chromeOptions.addArguments("--headless");
                //chromeOptions.addArguments("start-maximized");
                chromeOptions.addArguments("--incognito");
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                chromeOptions.merge(capabilities);
                return new ChromeDriver(chromeOptions);
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default: throw new UnsupportedDriverException("Following browser is not supported: " + browser);
        }
    }

    public static DesiredCapabilities setUpCapabilities(){
        // example of how to manage your code better
        return new DesiredCapabilities();
    }

/*    @SneakyThrows
    public static RemoteWebDriver remoteWebDriver() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        return new RemoteWebDriver(
                URI.create("http://207.154.243.63:4444/wd/hub").toURL(),
                capabilities
        );
    }

    public static WebDriver configureDriver() {
        String environment = PropertiesReader.readProperties().getProperty("environment");
        switch (environment) {
            case "local":
                return localDriver();
            case "remote":
                return remoteWebDriver();
            default:
                throw new UnsupportedEnvironmentException(String.format("'%s' environment is not supported", environment));
        }
    }*/

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
