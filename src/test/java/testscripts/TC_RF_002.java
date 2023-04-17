package testscripts;


import org.testng.annotations.Test;
import pages.BaseClass;
import pages.RegisterPage;
import pages.SearchPage;

public class TC_RF_002 extends BaseTest {



    @Test
    public void TC_RF_001(){

        String product= "imac";

        SearchPage rp = new SearchPage(driver);
        rp.searchAndAddToCart(product);
    }



}
