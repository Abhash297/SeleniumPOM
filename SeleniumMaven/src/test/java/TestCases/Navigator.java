package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Navigator {
    WebDriver driver;
    public Navigator(WebDriver driver1)
    {
        this.driver = driver1;
    }
    By cart = By.className("shopping_cart_link");
    By back = By.name("continue-shopping");
    By chkout = By.name("checkout");
    By conti = By.name("continue");
    By fini = By.name("finish");
    By menu = By.id("react-burger-menu-btn");
    By log = By.id("logout_sidebar_link");
    public void GoToCart()
    {
        driver.findElement(cart).click();
    }
    public void GoBack()
    {
        driver.findElement(back).click();
    }
    public void CheckOut()
    {
        driver.findElement(chkout).click();
    }
    public void Proceed()
    {
        driver.findElement(conti).click();
    }
   public void Finish()
    {
        driver.findElement(fini).click();
    }
    public void MenuBar()
    {
        driver.findElement(menu).click();
    }
    public void LogOut()
    {
        driver.findElement(log).click();
    }
}
