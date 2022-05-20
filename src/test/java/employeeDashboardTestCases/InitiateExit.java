package employeeDashboardTestCases;

import ddoObject.DDOLandingPage;
import employeeDashboardObject.GroupsObject;
import employeeDashboardObject.InitiateExitObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class InitiateExit extends Base {
    public WebDriver driver;


    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void groupButton() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp = new DDOLandingPage(driver);
        InitiateExitObject ie = new InitiateExitObject(driver);
        ddoObject.LoginPage lp = dlp.getLogin();
        lp.getUsername().sendKeys("Aditya kumar");
        lp.getPassword().sendKeys("123456");
        lp.getSubmitLogin().click();
        Thread.sleep(2000);
        ie.getempDasboard().click();
        ie.getintiateExit().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        /*ie.getemployee().click();*/
      /*  ie.getreasons().sendKeys("afdfffsfgcvhvhvhvhvhvvhvvh");*/
    }
}
