package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Burkay {


    @Test
    public void test01(){

        //Amazon'a gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Arama çubuğuna (istenen element) yazılır.
        AmazonPage amazonPage = new AmazonPage();
        //Arama butonuna basılır.
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime") + Keys.ENTER);
        //Browser kapatılır.
        Driver.closeDriver();
    }
}
