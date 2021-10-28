package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cred {

    WebDriver driver;

    By username = By.id("user-name");

    By password = By.id("password");

    By BtnLogin = By.name("login-button");

    By FirstName = By.id("first-name");

    By LastName = By.id("last-name");

    By ZipCode = By.id("postal-code");

    public cred(WebDriver driver1)
    {
    this.driver = driver1;
    }

    public void Uname(String uid)
    {
        driver.findElement(username).sendKeys(uid);
    }

    public void Psw(String pswrd)
    {
        driver.findElement(password).sendKeys(pswrd);
    }

    public void Login()
    {
        driver.findElement(BtnLogin).click();
    }

    public void Fname(String FN)
    {
        driver.findElement(FirstName).sendKeys(FN);
    }

    public void Lname(String LN)
    {
        driver.findElement(LastName).sendKeys(LN);
    }

    public void Zip(String ZCode)
    {
        driver.findElement(ZipCode).sendKeys(ZCode);
    }

    public void CheckFirName()
    {
        WebElement FirstName = driver.findElement(By.id("first-name"));
        String textInsideInputBox1 = FirstName.getAttribute("value");
        if(textInsideInputBox1.isEmpty())
        {
            System.out.println("Warning: First Name Is Empty");
        }
    }

    public void CheckLstName()
    {
        WebElement LastName = driver.findElement(By.id("last-name"));
        String textInsideInputBox2 = LastName.getAttribute("value");
        if(textInsideInputBox2.isEmpty())
        {
            System.out.println("Warning: Last Name Is Empty");
        }
    }

    public void CheckZipCode()
    {
        WebElement Zip = driver.findElement(By.id("postal-code"));
        String textInsideInputBox3 = Zip.getAttribute("value");
        if(textInsideInputBox3.isEmpty())
        {
            System.out.println("Warning: Zip Is Empty");
        }
    }






}
