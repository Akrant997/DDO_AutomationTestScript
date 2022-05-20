package employeeDashboardObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NoticePeriodObject
{
    WebDriver driver;
    @FindBy(css = "div[id='ext-element-61']")
    WebElement empdashboard;
    @FindBy(css = "div[id='ext-element-52']")
    WebElement noticrperiod;


    public NoticePeriodObject(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public WebElement getEmpdashboard()
    {
        return empdashboard;
    }
    public WebElement getNoticrperiod()
    {
        return noticrperiod;
    }
}
