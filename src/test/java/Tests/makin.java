package Tests;

import Pages.AmazonPage;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class makin {


    @Test
    public void AmazonTest(){

        //1- Amazon'a gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        //2-Arama çubuğuna (istenen element) yazılır.

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Java");
        //3-Arama butonuna basılır.
        amazonPage.aramaKutusu.submit();

        //4-Browser kapatılır.
        Driver.closeDriver();


        //Not: 27.05.2023 tarihine kadar görev tamamlanıp Github'a gönderilmesi gerekir.
    }

    }

