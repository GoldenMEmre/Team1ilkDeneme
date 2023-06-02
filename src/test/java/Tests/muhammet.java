package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class muhammet {
    //Amazon'a gidilir.
    //Arama çubuğuna (istenen element) yazılır.
    //Arama butonuna basılır.
    //Browser kapatılır.
    AmazonPage amazonPage= new AmazonPage();

    @Test
    public void testAMazonMuhammet(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        amazonPage.aramaKutusu.sendKeys("Test Automation ");
        amazonPage.aramaKutusu.submit();
        Driver.quitDriver();




    }
}
