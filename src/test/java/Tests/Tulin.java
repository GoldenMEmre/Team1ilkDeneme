package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Tulin {
    /*
    Amazon'a gidilir.
 Arama çubuğuna (istenen element) yazılır.
 Arama butonuna basılır.
 Browser kapatılır.
     */
    @Test
    public void test() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") +
                Keys.ENTER);
        Driver.closeDriver();

    }
}
