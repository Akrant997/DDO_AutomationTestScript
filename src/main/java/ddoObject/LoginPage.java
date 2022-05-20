package ddoObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
    WebDriver driver;

        By username = By.xpath("//input[@id='username']");
        By password = By.xpath("//input[@id='password']");
        By submitlogin = By.xpath("//input[@id='kc-login']");


    public LoginPage(WebDriver driver)
    {
        this.driver = driver;

    }

    public WebElement getUsername()
    {
        return driver.findElement(username);
    }
    public WebElement getPassword()
    {
        return driver.findElement(password);
    }
    public WebElement getSubmitLogin()
    {
        return driver.findElement(submitlogin);
    }

}
