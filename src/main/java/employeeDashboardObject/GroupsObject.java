package employeeDashboardObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class GroupsObject
{
    WebDriver driver;

    By employeedashboarda =By.xpath("//div[@id='ext-element-14']//div[@class='x-treelist-item-expander']");
    By group= By.xpath("//div[@id='ext-element-42']");
    By creategroup=By.xpath("//input[@id='textfield-1423-inputEl']");
    By deletegroup=By.xpath("//span[@id='button-1429-btnInnerEl']");
    By yesbutton =By.xpath("//span[@id='button-1006-btnInnerEl']");

    public GroupsObject(WebDriver driver)
    {
        this.driver=driver;
    }
    public WebElement getGroups()
    {
        return driver.findElement(group);
    }
    public WebElement getEmployeeDasboard()
    {
        return driver.findElement(employeedashboarda);
    }
    public WebElement getCreateGroupName()
    {
        return driver.findElement(creategroup);
    }
    public WebElement getDeleteButton()
    {
        return driver.findElement(deletegroup);
    }
    public WebElement getYesButton()
    {
        return driver.findElement(yesbutton);
    }
}
