package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils{
    public String expectedRegistretionCompleteMSG = "Your addtocart completed";
    public void successfulyiteamadd(){
        String actualMessage = getTextFromelement(By.xpath("//button[text()=\"Update shopping cart\"]"));
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG,"User should add the camera");
    }
}


