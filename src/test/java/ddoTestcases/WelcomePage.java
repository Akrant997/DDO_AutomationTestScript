package ddoTestcases;

import ddoObject.DDOLandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;

public class WelcomePage extends Base
{
    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void welcomePage()
    {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp =new DDOLandingPage(driver);


    }
}
