package employeeDashboardObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoalsObject
{
    WebDriver driver;
    @FindBy(css = "div[id='ext-element-61']")
    WebElement empdashboard;
    @FindBy(css = "div[id='ext-element-47']")
    WebElement goals;
    @FindBy(css = "input[id='textfield-1406-inputEl']")
    WebElement searchgoals;
    @FindBy(css = "input[id='textfield-1417-inputEl']")
    WebElement goalname;
    @FindBy(css = "div[id='form-1416-innerCt']")
    WebElement searchpeople;
    @FindBy(css = "span[id='button-1424-btnInnerEl']")
    WebElement status;
    @FindBy(css = "div[id='datefield-1430-trigger-picker']")
    WebElement calander;
    @FindBy (css = "span#splitbutton-1435-btnWrap")
    WebElement scrollbutton;
    @FindBy(xpath="//a[normalize-space()='2024']")
    WebElement yearselect;
    @FindBy(xpath = "//a[normalize-space()='Nov']")
    WebElement monthselect;

    @FindBy(css = "div#tool-1433-toolEl")
    WebElement closetab;

    public  GoalsObject(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement getEmpdashboard()
    {
        return empdashboard;
    }
    public WebElement getGoals()
    {
        return goals;
    }
    public WebElement getSearchgoals()
    {
        return searchgoals;
    }
    public WebElement getGoalname()
    {
        return goalname;
    }
    public WebElement getSearchpeople()
    {
        return searchpeople;
    }
    public WebElement getStatus()
    {
        return status;
    }
    public WebElement getCalander()
    {
        return  calander;
    }
    public WebElement getScrollbutton()
    {
        return  scrollbutton;
    }
    public WebElement getYearselect()
    {
        return  yearselect;
    }
    public WebElement getMonthselect()
    {
        return monthselect;
    }
    public WebElement getClosetab()
    {
        return closetab;
    }

}


