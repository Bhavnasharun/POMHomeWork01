package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
//Q-2 compair the Iteam apple macbook and virtual gift its goes next page here
public class ComparePage extends Utils{
    //click on clear button
    private By _clearList = By.xpath("//a[text()='Clear list']");
    static String expectedRegistretionCompleteMSG = "Your registration completed";
    public void clickelementList(){
        clickOnElement(_clearList);}
    public void veryfytoMSGShouldappear(){
        //message will apear no iteam to compair
        String actualMessage = getTextFromelement(By.xpath("//div[text()='You have no items to compare.']"));
        System.out.println("Actual masage:"+actualMessage);
        Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG,"User should compare");
    }}


