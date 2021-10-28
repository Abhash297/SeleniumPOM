package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ItemCheck {

    WebDriver driver;

    public ItemCheck(WebDriver driver1)
    {
       this.driver = driver1;
    }

    //int quantity = Integer.parseInt(qtt);
    public void CheckQtty()
    {
        String qtt = driver.findElement(By.className("cart_quantity")).getText();
        int quantity = Integer.parseInt(qtt);
        Assert.assertEquals(quantity, 1, "QUANTITY... TEST... HAS....FAILED");
        System.out.println("QUANTITY MATCH - TEST PASSED");
    }

    public void CheckQtty2()
    {
        String count = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.removed_cart_item")).getText();
        if (count == "")
        {
            int Itmcount = 0;
            System.out.println("Cart Is Empty");
            System.out.println("Number of Items in Cart:"+Itmcount);
        }
    }
    public void CheckDesc()
    {

        String desc = driver.findElement(By.cssSelector("#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_item_label > div.inventory_item_desc")).getText();
        Assert.assertEquals(desc , "carry.allTheThings() with the sleek, " +
                        "streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
                "Description does not MATCH!!!");
        System.out.println("DESCRIPTION MATCH - TEST PASSED");
    }

    public void ItmCheckOut()
    {
        String checkout = driver.findElement(By.cssSelector("#checkout_complete_container > h2")).getText();
        Assert.assertEquals(checkout, "THANK YOU FOR YOUR ORDER");
        System.out.println("Checkout Successful!");
    }
}
