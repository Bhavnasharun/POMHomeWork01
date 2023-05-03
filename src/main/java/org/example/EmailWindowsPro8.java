package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailWindowsPro8 extends Utils{
    //quiestion 6 like went computer home page, click on softwear home page
    //then softwear page

    private By _friendEmail =By.xpath("//div[@class=\"form-fields\"]/div[1]/input");
    //friend
    private By _yourEmail = By.xpath("//div[@class=\"form-fields\"]/div[2]/input");
    private By _Text = By.xpath("//div[@class=\"form-fields\"]/div[3]/textarea");
    private By _Sendemail = By.xpath("//div[@class=\"buttons\"]");
    public void referItemToFriend(){
        typetaxt(_friendEmail,"ram"+timestamp()+"@gmail.com");
        typetaxt(_yourEmail, "bha"+timestamp()+"@gmail.com");
        typetaxt(_Text,"Hello");
        clickOnElement(_Sendemail);//click on send email button
    }
     String expectedRegistrationCompleteMGS = "Your registration completed";
    public void verfyUserreferiteamSuccessfully(){//method declair in the test siut class
        String actualMessage = getTextFromelement(By.xpath("//li[text()=\"Only registered customers can use email a friend feature\"]"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedRegistrationCompleteMGS,"refereIteam"+"successfully");}
}//qutions nuber 6 refer to friend the Iteam
