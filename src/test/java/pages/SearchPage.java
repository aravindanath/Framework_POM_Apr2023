package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BaseClass {

    public SearchPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//input[@name='search' and @placeholder='Search']")
    public WebElement searchField;

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCartButton;

    @FindBy(xpath = "//span[@id='cart-total']")
    public WebElement cartTotal;

    @FindBy(xpath = "//strong[contains(text(),'Checkout')]")
    public WebElement checkoutButton;

    @FindBy(xpath = "//ul[@class='G43f7e']/li/div/div[2]/div")
    List<WebElement> autosuggestions;


    public void searchAndAddToCart(String search){
        searchField.sendKeys(search, Keys.ENTER);
        addToCartButton.click();
        cartTotal.click();
        checkoutButton.click();
    }

    public void selectValue(String value){

        for(WebElement element :autosuggestions){
            if(element.getText().equals(value)){
                element.click();
            }
        }

    }

}
