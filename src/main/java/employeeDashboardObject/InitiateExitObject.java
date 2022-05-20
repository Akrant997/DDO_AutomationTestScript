package employeeDashboardObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InitiateExitObject
{
    WebDriver driver;
   /* By employeedashboard = By.xpath("//div[@id='ext-element-14']//div[@class='x-treelist-item-expander']");
    By intiateexit=By.xpath("//div[@id='ext-element-57']");
    By employee=By.id("combobox-1123-trigger-picker");
    By reasons=By.cssSelector("#combobox-1123-inputEl");*/

    @FindBy(xpath = "//div[@id='ext-element-14']//div[@class='x-treelist-item-expander']")
    WebElement employeedashboard;

    @FindBy(xpath = "//div[@id='ext-element-57']")
    WebElement intiateexit;

    @FindBy(id = "combobox-1123-trigger-picker")
    WebElement employee;

    @FindBy(css = "#combobox-1123-inputEl")
    WebElement reasons;






    public InitiateExitObject(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }
    public WebElement getempDasboard()
    {
        return employeedashboard;
    }
    public WebElement getintiateExit()
    {
        return intiateexit;
    }
    public WebElement getemployee()
    {
        return employee;
    }
    public WebElement getreasons()
    {
        return reasons;
    }

}
