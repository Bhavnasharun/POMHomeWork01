package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ResisterResultPage extends Utils{

      //  private By actualMessage = By.xpath("//div[text()=\"Your registration completed\"]");

        static String expectedRegistrationCompleteMGS = "Your registration completed";
        public void verfyUserResisteredSuccessfully(){
        String actualMessage = getTextFromelement(By.xpath("//div[@class=\"result\"]"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMGS,"registration"+"is workin");}
}




