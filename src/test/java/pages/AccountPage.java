package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AccountPage extends BaseClass {

    public AccountPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "(//a[text()='My Account'])[2]")
    public WebElement myAccountBtn;

    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccountTitle;



    public void navigateToMyAccount(){
        myAccountBtn.click();
        String actual = myAccountTitle.getText();
        Assert.assertEquals(actual,"My Account");
    }
}
