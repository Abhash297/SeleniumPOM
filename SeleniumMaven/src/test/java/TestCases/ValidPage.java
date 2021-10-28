package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.lang.*;

public class ValidPage {

    WebDriver driver;
    public ValidPage(WebDriver driver1)
    {
        this.driver = driver1;
    }




        public void LoginCheck()
        {
            WebElement loginPage = driver.findElement(By.id("login-button"));
            String TxtLogin = loginPage.getAttribute("value");
            if(TxtLogin.equals("Login"))
            {
                System.out.println("Log - In Page Reached");
            }

        }

}
