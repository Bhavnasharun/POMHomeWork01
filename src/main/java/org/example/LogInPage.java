package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class LogInPage extends Utils{
    //log in page fill in details for Q-7 and Q-6
    private By _email = By.id("Email");
    private By _password = By.className("Password");
    private By _login = By.xpath("//button[text()=\"Log in\"]");
    public void VeryfyUserShaouldClick(){
        typetaxt(_email,"khana"+timestamp()+"@gmail.com");
        typetaxt(_password,"Rest1234");
        clickOnElement(_login);
    }
    public String expectedRegistretionCompleteMSG2 = "Your registration completed";
    public void VeryfyingUserShoulloginsuccessFully(){
        String actualMessage = getTextFromelement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG2,"User should vote now");
    }}


