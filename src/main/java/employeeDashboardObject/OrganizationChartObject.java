package employeeDashboardObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrganizationChartObject
{
   WebDriver driver;

   By employeedashboard =By.xpath("//div[@id='ext-element-14']//div[@class='x-treelist-item-expander']");
   By organizationchart= By.xpath("//div[@id='ext-element-37']");
   By empName= By.cssSelector("#combobox-1280-inputEl");
   By department=By.cssSelector("#mainviewport-1047-targetEl");







   public OrganizationChartObject(WebDriver driver)
   {
       this.driver=driver;
   }
   public WebElement getEmployeeDashboardButton()
   {
       return driver.findElement(employeedashboard);
   }
   public WebElement getOrgChart()
   {
       return driver.findElement(organizationchart);
   }
   public WebElement getEmpName()
   {
       return driver.findElement(empName);
   }
   public WebElement getdepartmentName()
   {
       return driver.findElement(department);
   }
}
