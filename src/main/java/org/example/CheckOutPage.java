package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class CheckOutPage extends Utils{
    private By _continue = new By.ByName("save");
    private By _continue1 = new By.ByXPath("//button[@class ='button-1 shipping-method-next-step-button']");
    private By _CreditCard = new By.ById("paymentmethod_1");
    private By _Continue2 = new By.ByXPath("(//button[text()='Continue'])[4]");
    private By _SelectCrediteCard = new By.ByName("CreditCardType");
    private By _CardName = new By.ById("CardholderName");
    private By _CardNumber = new By.ById("CardNumber");
    private By _ExpireMonth = new By.ByName("ExpireMonth");
    private By _ExpireYear = new By.ById("ExpireYear");
    private By _CardCord = new By.ById("CardCode");
    private By _Continue3 = new By.ByXPath("(//button[text()='Continue'])[5]");
    public By _Confirm = new By.ByXPath("//button[text()='Confirm']");
    public void CheckOutComputer(){
        clickOnElement(_continue);
        clickOnElement(_continue1);
        clickOnElement(_CreditCard);
        clickOnElement(_Continue2);
        selectElementByText(_SelectCrediteCard,"Visa");
        typetaxt(_CardName,"Ram Sharma");
        typetaxt(_CardNumber,"4929408430313531");
        selectElementByText(_ExpireMonth,"04");
         selectElementByValue(_ExpireYear,"2027");
         typetaxt(_CardCord,"460");
         clickOnElement(_Continue3);
         clickOnElement(_Confirm);


    }
    public void verfyUserShouldOrderSuccessfully(){
        String expectedRegistrationCompleteMGS = "Your order has been successfully processed!";
        String actualMessage = getTextFromelement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMGS,"Your order has been successfully processed!");}
}
