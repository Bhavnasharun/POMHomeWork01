package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCartPage extends Utils {
    private By _addtocart = By.xpath("//div[@class=\"products-container\"]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[2]");
    private By _clickMessage = By.xpath("//a[text()=\"shopping cart\"]");
public void UsershouldableToaddtheiteam(){
    clickOnElement(_addtocart);
} public String expectedRegistretionCompleteMSG = "Your addtocart completed";
    public void successfulyiteamadd(){
        String actualMessage = getTextFromelement(By.xpath("//a[text()=\"shopping cart\"]"));
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG,"User should add the camera");
    }
}
