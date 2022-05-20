package employeeDashboardTestCases;

import ddoObject.DDOLandingPage;
import employeeDashboardObject.OrganizationChartObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resource.Base;

import java.io.IOException;

public class OrganizationChart extends Base
{
    public WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {

        driver = initializeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void employeeDashboardButton() throws InterruptedException {
        driver.get(prop.getProperty("url"));
        DDOLandingPage dlp = new DDOLandingPage(driver);
        OrganizationChartObject oc=new OrganizationChartObject(driver);
        ddoObject.LoginPage lp = dlp.getLogin();
//        Thread.sleep(3000);
        lp.getUsername().sendKeys("Aditya kumar");
        lp.getPassword().sendKeys("123456");
        lp.getSubmitLogin().click();
        Thread.sleep(3000);
        oc.getEmployeeDashboardButton().click();
        oc.getOrgChart().click();
         oc.getEmpName().click();
        oc.getdepartmentName().click();




    }

}
