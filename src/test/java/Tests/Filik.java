package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Filik {

    @Test
    public void testFilik(){
        //Amazon'a gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Arama çubuğuna (istenen element) yazılır.
        //Arama butonuna basılır.
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys(ConfigReader.getProperty("amazonAranacakKelime")+Keys.ENTER);
        //Browser kapatılır.
        Driver.closeDriver();
        //Not: 27.05.2023 tarihine kadar görev tamamlanıp Github'a gönderilmesi gerekir.
    }
}
