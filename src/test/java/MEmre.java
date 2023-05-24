import Utilities.ConfigReader;
import Utilities.Driver;
import org.testng.annotations.Test;

public class MEmre {
   @Test
    public void Test01 (){
       Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
   }

}
