package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Omer {
    @Test
    public void testOmer(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazon = new AmazonPage();
        amazon.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+ Keys.ENTER);
        Driver.closeDriver();

    }
}
