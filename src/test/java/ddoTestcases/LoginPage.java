package ddoTestcases;

import ddoObject.DDOLandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;

public class LoginPage extends Base {
    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }

    @Test(description = "For Valid username & valid passward ")
    public void validLogin() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp = new DDOLandingPage(driver);
        ddoObject.LoginPage lp = dlp.getLogin();
        Thread.sleep(3000);
        lp.getUsername().sendKeys("Aditya kumar");
        lp.getPassword().sendKeys("123456");
        lp.getSubmitLogin().click();

    }

    @Test(description = "For invalid username & invalid passward")
    public void invalidLogin() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp = new DDOLandingPage(driver);
        ddoObject.LoginPage lp = dlp.getLogin();
        Thread.sleep(3000);
        lp.getUsername().sendKeys("Aditya");
        lp.getPassword().sendKeys("1234");
        lp.getSubmitLogin().click();

    }
}
