package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.LocalDriverManager;
import utils.SharedContext;

import java.util.List;

import static utils.StaticKeys.CURRENT_ITEM;

public class MainPage {

    WebDriver driver = LocalDriverManager.getInstance();
    private final By productElements = By.xpath("//ul[contains(@class,'products')]/li");

    public List<WebElement> getAllProducts() {
        return driver.findElements(productElements);
    }

    public ProductPage selectProductFromListByName(String productName) {

        getAllProducts().stream()
                .filter(product -> product.getText().contains(productName))
                .findFirst()
                .ifPresent(WebElement::click);

        SharedContext.setValue(CURRENT_ITEM, productName);

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
