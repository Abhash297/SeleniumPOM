import TestCases.ItemCheck;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import javax.swing.*;
import java.util.concurrent.TimeUnit;
import static java.lang.Thread.sleep;
import TestCases.cred;
import TestCases.ItemSelector;
import TestCases.*;


public class AutomationTest {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);


        // Login with the provided credentials from the website itself.
        cred credentials = new cred(driver);
        credentials.Uname("standard_user");
        credentials.Psw("secret_sauce");
        credentials.Login();


        // Add to cart “Sauce Labs Backpack” item.
        ItemSelector select = new ItemSelector(driver);
        select.backpack();

        //Navigate to the cart and assert quantity and item description.
        Navigator navigate = new Navigator(driver);
        navigate.GoToCart();
        Thread.sleep(2000);


        //Navigate to the cart and assert quantity and item description.
        ItemCheck check = new ItemCheck(driver);
        check.CheckQtty();
        check.CheckDesc();
        //Remove the item and assert cart is empty.
        select.remove();
        check.CheckQtty2();

        navigate.GoBack();
        Thread.sleep(2000);
        // Add another item “Test.allTheThings() T-Shirt (Red)” to the cart.
        select.ReShirt();




        //Click check out
        navigate.GoToCart();
        navigate.CheckOut();
        Thread.sleep(2000);
        navigate.Proceed();


        //Click “CONTINUE” without filling any form and assert error message.
        credentials.CheckFirName();
        credentials.CheckLstName();
        credentials.CheckZipCode();
        Thread.sleep(2000);
        Thread.sleep(2000);
        //Fill the form and verify checkout complete.
        credentials.Fname("Abhash Shrestha");
        Thread.sleep(500);
        credentials.Lname("onepunchman");
        Thread.sleep(500);
        credentials.Zip("VeriskAnalytics");
        Thread.sleep(500);
        navigate.Proceed();
        navigate.Finish();
        check.ItmCheckOut();



        // Logout and verify Login Page.
        navigate.MenuBar();
        Thread.sleep(500);
        navigate.LogOut();

        ValidPage val= new ValidPage(driver);
        val.LoginCheck();


    }






}
