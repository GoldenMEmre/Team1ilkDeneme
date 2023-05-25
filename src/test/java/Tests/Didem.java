package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class Didem {

    @Test
    public void test01(){

        AmazonPage amazonPage = new AmazonPage();

        // Amazon'a gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //Arama çubuğuna (istenen element) yazılır.
        //Arama butonuna basılır.
        amazonPage.aramaKutusu.sendKeys("Selenium");
        amazonPage.aramaKutusu.submit();

        //Browser kapatılır.
        Driver.quitDriver();

        //Not: 27.05.2023 tarihine kadar görev tamamlanıp Github'a gönderilmesi gerekir.


    }




}
