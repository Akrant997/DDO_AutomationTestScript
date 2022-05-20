package employeeDashboardTestCases;

import ddoObject.DDOLandingPage;
import employeeDashboardObject.CreateGoalObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class CreateGoal extends Base {
    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void createGoal() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp =new DDOLandingPage(driver);
        CreateGoalObject cro= new CreateGoalObject(driver);

        ddoObject.LoginPage lp = dlp.getLogin();
        lp.getUsername().sendKeys("Aditya kumar");
        lp.getPassword().sendKeys("123456");
        lp.getSubmitLogin().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Thread.sleep(2000);
       /* JavascriptExecutor executor =(JavascriptExecutor)driver;*/
        cro.getEmpdashboard().click();
        cro.getGoals().click();
        Thread.sleep(2000);
        cro.getCreategoalform().click();
        cro.getGoalname().click();
        cro.getGoalname().sendKeys("aaa");

    }
    @Test
    public void allGoals() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp =new DDOLandingPage(driver);
        CreateGoalObject cro= new CreateGoalObject(driver);

        ddoObject.LoginPage lp = dlp.getLogin();
        lp.getUsername().sendKeys("Aditya kumar");
        lp.getPassword().sendKeys("123456");
        lp.getSubmitLogin().click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        Thread.sleep(3000);
        cro.getEmpdashboard().click();
        cro.getGoals().click();
        Thread.sleep(2000);
        cro.getAllgoals().click();

    }
}

