package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ResisterResultPage extends Utils{


        public void verfyUserResisteredSuccessfully(){
        String expectedRegistrationCompleteMGS = "Your registration completed";
        String actualMessage = getTextFromelement(By.xpath("//div[@class=\"result\"]"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMGS,"Your registration completed");}
}




