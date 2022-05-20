package ddoTestcases;

import ddoObject.DDOLandingPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;

public class CreateAccount extends Base
{
    public WebDriver driver;
    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }
    @Test(description = "Create Account for invalid data")
    public void invalidCreateAccount() throws InterruptedException {
      driver.get(prop.getProperty("url"));
        DDOLandingPage dlp=new DDOLandingPage(driver);
        ddoObject.CreateAccountObject ca=dlp.getCreateAccount();
        ca.getorganizationname().sendKeys("abs");
        ca.getfirstname().sendKeys("sas");
        ca.getlastname().sendKeys("ads");
        ca.getemail().sendKeys("ads97@gmail.com");
        ca.getmobilenumber().sendKeys("963332");
        ca.getdesignation().sendKeys("asd");
        Thread.sleep(5000);
        ca.getcreateaccount().click();
       /* ca.getcreateaccount().click();*/


    }
    @Test(description = "Create Account for valid data")
    public void validCreateAccount()
    {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp= new DDOLandingPage(driver);
        ddoObject.CreateAccountObject ca=dlp.getCreateAccount();
        ca.getorganizationname().sendKeys("Walking tree");
        ca.getfirstname().sendKeys("Aman");
        ca.getlastname().sendKeys("singh");
        ca.getemail().sendKeys("akr45@gmail.com");
        ca.getmobilenumber().sendKeys("7041677722");
        ca.getdesignation().sendKeys("Software developer");
        ca.getcreateaccount().click();
    }

}
