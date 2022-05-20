package employeeDashboardTestCases;

import ddoObject.DDOLandingPage;
import employeeDashboardObject.GoalsObject;
import employeeDashboardObject.NoticePeriodObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import javax.swing.plaf.TableHeaderUI;
import java.io.IOException;

public class NoticePeriod extends Base
{
    public WebDriver driver;


    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void noticePeriodField() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp = new DDOLandingPage(driver);
        NoticePeriodObject npo =new NoticePeriodObject(driver);
        ddoObject.LoginPage lp = dlp.getLogin();
        lp.getUsername().sendKeys("Aditya kumar");
        lp.getPassword().sendKeys("123456");
        lp.getSubmitLogin().click();
        Thread.sleep(3000);
        npo.getEmpdashboard().click();
        npo.getNoticrperiod().click();

    }
}
