package testscripts;


import org.testng.annotations.Test;
import pages.BaseClass;
import pages.RegisterPage;

public class TC_RF_001 extends BaseTest {



    @Test
    public void TC_RF_001(){

        String fn = BaseClass.firstName(),ln = BaseClass.lastName(), email = BaseClass.emailID(), telephone = BaseClass.mobileNUumber(),password = "password@123";

        RegisterPage rp = new RegisterPage(driver);
        rp.navigateToRegistration();
        rp.enterPersonalDetails(fn,ln,email,telephone,password,password);
        rp.agreePrivacyPolicy();
        rp.submit();
        rp.verifyRegistrationSuccessMsg();

    }



}
