package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Objetct Repo


    @FindBy(xpath = "//input[@id='input-email']")
    public WebElement emailTextField;


    @FindBy(xpath = "//input[@id='input-password']")
    public WebElement passwordTextField;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginButton;

    //


}
