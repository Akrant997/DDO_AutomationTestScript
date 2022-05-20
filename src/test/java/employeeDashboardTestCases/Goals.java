package employeeDashboardTestCases;

import ddoObject.DDOLandingPage;
import employeeDashboardObject.GoalsObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Goals extends Base
{
    public WebDriver driver;


    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void goals() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp = new DDOLandingPage(driver);
        GoalsObject gl=new GoalsObject(driver);
        ddoObject.LoginPage lp = dlp.getLogin();
        lp.getUsername().sendKeys("Aditya kumar");
        lp.getPassword().sendKeys("123456");
        lp.getSubmitLogin().click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        JavascriptExecutor executor =(JavascriptExecutor)driver;
        /*executor.executeScript("arguments[0].click",gl.getEmpdashboard(),gl.getGoals());*/

        Thread.sleep(2000);
        gl.getEmpdashboard().click();
        gl.getGoals().click();
        gl.getSearchgoals().click();
        gl.getGoalname().click();
        gl.getGoalname().sendKeys("aaa");
        gl.getSearchpeople().click();
        Thread.sleep(3000);
       /* gl.getSearchpeople().sendKeys(Keys.ARROW_DOWN);*/
        gl.getStatus().click();
        gl.getCalander().click();
        gl.getScrollbutton().click();
        Thread.sleep(2000);
       /* WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable((gl.getYearselect()))).click();*/
        gl.getYearselect().click();
        Thread.sleep(2000);
        gl.getMonthselect().click();
gl.getClosetab().click();

    }
}
