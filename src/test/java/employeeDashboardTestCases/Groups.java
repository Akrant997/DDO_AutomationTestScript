package employeeDashboardTestCases;

import ddoObject.DDOLandingPage;
import employeeDashboardObject.GroupsObject;
import employeeDashboardObject.OrganizationChartObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;

public class Groups extends Base
{
        public WebDriver driver;


        @BeforeTest
        public void initialize() throws IOException {

            driver = initializeDriver();
            driver.manage().window().maximize();
        }

        @Test
        public void groupButton() throws InterruptedException
        {
            driver.get(prop.getProperty("url"));
            DDOLandingPage dlp = new DDOLandingPage(driver);
            /*OrganizationChartObject oc = new OrganizationChartObject(driver);*/
            GroupsObject go =new GroupsObject(driver);
            ddoObject.LoginPage lp = dlp.getLogin();
//        Thread.sleep(3000);
            lp.getUsername().sendKeys("Aditya kumar");
            lp.getPassword().sendKeys("123456");
            lp.getSubmitLogin().click();
            Thread.sleep(2000);
            go.getEmployeeDasboard().click();
            go.getGroups().click();
            go.getCreateGroupName().sendKeys("abc"+Keys.chord(Keys.ENTER));
//            Thread.sleep(3000);
//            go.getCreateGroupName().click();
            go.getDeleteButton().click();
            go.getYesButton().click();


        }
    }

