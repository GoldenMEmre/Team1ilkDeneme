import Pages.Amazon;
import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class Omer {
    @Test
    public void testOmer(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Amazon amazon = new Amazon();
        amazon.aramaKutusu.sendKeys("Nutalla");
        amazon.aramaKutusu.submit();
        Driver.closeDriver();

    }
}
