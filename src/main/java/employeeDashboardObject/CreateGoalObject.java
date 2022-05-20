package employeeDashboardObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateGoalObject
{
 WebDriver driver;

            @FindBy(css = "div[id='ext-element-61']")
            WebElement empdashboard;
            @FindBy(css = "div[id='ext-element-47']")
            WebElement goals;
            @FindBy(css = "span[class='plus-icon']")
            WebElement creategoalform;
            @FindBy(css = "input[id='textfield-1286-inputEl']")
            WebElement goalname;
            @FindBy(css = "div[id='combobox-1410-inputWrap']")
            WebElement allgoals;

 public CreateGoalObject(WebDriver driver)
 {
     this.driver=driver;
     PageFactory.initElements(driver,this);

 }
 public WebElement getCreategoalform()
 {
     return creategoalform;
 }
    public WebElement getEmpdashboard()
    {
        return empdashboard;
    }
    public WebElement getGoals()
    {
        return goals;
    }
    public WebElement getGoalname()
    {
        return goalname;
    }
    public WebElement getAllgoals()
    {
        return allgoals;
    }
}
