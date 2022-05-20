package ddoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountObject
{
    WebDriver driver;

     By organizationname= By.xpath("//input[@id='textfield-1095-inputEl']");
     By firstname =By.xpath("//input[@id='textfield-1096-inputEl']");
     By lastname= By.xpath("//input[@id='textfield-1097-inputEl']");
     By email=  By.xpath("//input[@id='textfield-1098-inputEl']");
     By mobilenumber=   By.xpath("//input[@id='textfield-1099-inputEl']");
     By designation=   By.xpath("//input[@id='textfield-1100-inputEl']");
     By createaccount= By.xpath("//div[@id='form-1092-innerCt']");

 public CreateAccountObject(WebDriver driver)
 {
     this.driver=driver;
 }

 public WebElement getorganizationname()
     {
      return driver.findElement(organizationname);
     }
      public WebElement getfirstname()
     {
      return driver.findElement(firstname);
     }
     public WebElement getlastname()
     {
      return driver.findElement(lastname);
     }
     public WebElement getemail()
     {
      return driver.findElement(email);
     }
     public WebElement getmobilenumber()
     {
      return driver.findElement(mobilenumber);
     }
     public WebElement getdesignation()
     {
      return driver.findElement(designation);
     }
     public WebElement getcreateaccount()
     {
      return driver.findElement(createaccount);
     }
}


