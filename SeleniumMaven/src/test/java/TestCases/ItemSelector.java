package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemSelector {

    WebDriver driver;

    By ItemName = By.name("add-to-cart-sauce-labs-backpack");
    By ItemName2 = By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
    By ItemRemove = By.name("remove-sauce-labs-backpack");

    public ItemSelector(WebDriver driver1)
    {
        this.driver = driver1;
    }

    public void backpack()
    {
        driver.findElement(ItemName).click();
    }

    public void ReShirt()
    {
        driver.findElement(ItemName2).click();
    }

    public void remove()
    {
        driver.findElement(ItemRemove).click();
    }

}
