package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class BaseClass {

    protected WebDriver driver;

    public BaseClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public static String getValue(String key) {
        String path = System.getProperty("user.dir") + File.separator + "config.properties";
        String val = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties properties = new Properties();
            properties.load(fis);
            val = properties.getProperty(key);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return val;
    }


    public static String firstName(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.name().firstName();
    }

    public static String lastName(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.name().lastName();
    }
    public static String emailID(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.name().firstName()+"@testmail.com";
    }
    public static String mobileNUumber(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.number().digits(10);
    }
    public static String companyName(){
        Faker faker = new Faker(new Locale("en-IND"));;
        return faker.company().name();
    }

    public static void scroll(WebDriver driver){
        try {

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,500)");

        }catch (Exception e){

        }
    }

    public  static void mouseHover(WebDriver driver, WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }



    public static void dragNDrop(WebDriver driver, WebElement element1, WebElement element2){
        Actions action = new Actions(driver);
        action.dragAndDrop(element1, element2).perform();
    }

    public static void rightClick(WebDriver driver, WebElement element1){
        Actions action = new Actions(driver);
        action.contextClick(element1).perform();
    }

    public static void alertDismiss(WebDriver driver){
        Alert alert =  driver.switchTo().alert();
        alert.dismiss();
    }

    public static void alertAccept(WebDriver driver){
        Alert alert =  driver.switchTo().alert();
        alert.accept();
    }


    public static void alertAccept(WebDriver driver,String message){
        Alert alert =  driver.switchTo().alert();
        alert.sendKeys(message);
        alert.accept();
    }

    public static void scrollToElement(WebDriver driver,WebElement element){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",element);
    }


    public static void selectByValue(WebElement element,String value){
        Select sel = new Select(element);
        sel.selectByValue(value);
    }


    public static void verifyTitle(WebElement element,String title){
        String actualTitle =element.getText();
        Assert.assertEquals(actualTitle,title);
    }

    public static void waitforelement(long seconds){
        try{
            Thread.sleep(seconds);

        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
