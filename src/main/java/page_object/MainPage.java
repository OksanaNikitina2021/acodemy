package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

import java.util.List;

public class MainPage {

    WebDriver driver = WebDriverManager.getInstance();
    private final By productElements = By.xpath("//ul[contains(@class,'products')]/li");

    public List<WebElement> getAllProducts() {
        return driver.findElements(productElements);
    }

    public ProductPage selectProductFromListByName(String productName) {

        getAllProducts().stream()
                .filter(product -> product.getText().contains(productName))
                .findFirst()
                .ifPresent(WebElement::click);

/*        for(int i = 0; i < getAllProducts().size(); i++){
            if(getAllProducts().get(i).getText().equals(productName)){
                getAllProducts().get(i).click();
                break;
            }
        }*/
     /*   for(WebElement product : driver.findElements(productElements)){
            if(product.getText().contains(productName)){
                product.click();
                break;
            }
        }*/
        return new ProductPage();
    }
}
