package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BaseClass {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    // Objetct Repo


    @FindBy(xpath = "//span[text()='My Account']")
    public WebElement myAccountMenu;

    @FindBy(xpath = "(//a[text()='Register'])[1]")
    public WebElement registerMenu;

    @FindBy(xpath = "//input[@type='text' and @name='firstname']")
    public WebElement firstNameTextField;

    @FindBy(xpath = "//input[@type='text' and @name='lastname']")
    public WebElement lastNameTextField;

    @FindBy(xpath = "//input[@type='email' and @name='email']")
    public WebElement emailTextField;

    @FindBy(xpath = "//input[@type='tel' and @name='telephone']")
    public WebElement telephoneTextField;

    @FindBy(xpath = "//input[@type='password' and @name='password']")
    public WebElement passwordTextField;

    @FindBy(xpath = "//input[@type='password' and @name='confirm']")
    public WebElement confirmPasswordTextField;

    @FindBy(xpath = "//input[@type='checkbox' and @name='agree']")
    public WebElement agreeCB;

    @FindBy(xpath = "//input[@type='submit' and @value='Continue']")
    public WebElement submitButton;

    @FindBy(xpath = "//p[text()='Congratulations! Your new account has been successfully created!']")
    public WebElement successMsg;


    // Business Logic


    public void navigateToRegistration(){
        myAccountMenu.click();
        registerMenu.click();
    }

    public void enterPersonalDetails(String firstName, String lastName,
                                     String email, String telephone,
                                     String password, String confirmPassword){
        firstNameTextField.sendKeys(firstName);
        lastNameTextField.sendKeys(lastName);
        emailTextField.sendKeys(email);
        telephoneTextField.sendKeys(telephone);
        passwordTextField.sendKeys(password);
        confirmPasswordTextField.sendKeys(confirmPassword);
    }

    public void agreePrivacyPolicy(){
        agreeCB.click();
    }

    public void submit(){
        submitButton.click();
    }

    public void verifyRegistrationSuccessMsg(){
        BaseClass.verifyTitle(successMsg,"Congratulations! Your new account has been successfully created!");
    }




}
