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

    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountMenu;

    @FindBy(xpath = "(//a[text()='Login'])[1]")
    public WebElement loginMenuButton;


    public void navigatetoLogin(){
        myAccountMenu.click();
        loginMenuButton.click();
        BaseClass.waitforelement(2000);
    }


    public void login(String email, String password){

        emailTextField.sendKeys(email);
        passwordTextField.sendKeys(password);
        loginButton.click();
        BaseClass.waitforelement(2000);
    }
}
