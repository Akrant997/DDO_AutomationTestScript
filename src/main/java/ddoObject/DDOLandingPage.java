package ddoObject;

import employeeDashboardObject.GroupsObject;
import employeeDashboardObject.OrganizationChartObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DDOLandingPage
{
  WebDriver driver;

    By createaccount=By.xpath("//span[@id='button-1020-btnInnerEl']");
    By login=By.xpath("//span[@id='button-1021-btnInnerEl']");
    By employeedashboardbutton =By.xpath("//div[@id='ext-element-14']//div[@class='x-treelist-item-expander']");

  public DDOLandingPage(WebDriver driver)
  {
    this.driver=driver;
  }
  public LoginPage getLogin()
  {
    driver.findElement(login).click();
    LoginPage lp=new LoginPage(driver);
    return lp;
  }
  public CreateAccountObject getCreateAccount()
  {
    driver.findElement(createaccount).click();
    CreateAccountObject ca=new CreateAccountObject(driver);
    return ca;
  }
  /*public OrganizationChartObject getemployeedashboard()
  {
    driver.findElement(employeedashboardbutton).click();
    OrganizationChartObject oc =new OrganizationChartObject(driver);
    return oc;
  }*/
 /* public GroupsObject getGroup()
  {
    GroupsObject go =new GroupsObject(driver);
    return go;
  }*/

  public void LoginPageObject(WebDriver driver)
    {
      this.driver=driver;
    }
    public WebElement getWelcomePage()
    {
      return driver.findElement(createaccount);
    }
    public WebElement getLoginPage()
    {
      return driver.findElement(login);
    }
}
