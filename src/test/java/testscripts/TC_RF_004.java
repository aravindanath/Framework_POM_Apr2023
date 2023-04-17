package testscripts;


import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;

public class TC_RF_004 extends BaseTest {



    @Test
    public void TC_RF_001(){

        String  email = "Dipendra@testmail.com",password = "password@123";



        LoginPage lp = new LoginPage(driver);
        lp.navigatetoLogin();
        lp.login(email,password);

        AccountPage ap = new AccountPage(driver);
        ap.navigateToMyAccount();


    }



}
