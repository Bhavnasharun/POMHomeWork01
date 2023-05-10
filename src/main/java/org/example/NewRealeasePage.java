package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;

public class NewRealeasePage extends Utils{
    private By _Title = new By.ByCssSelector("input.enter-comment-title");
    private By _Textarea = new By.ById("AddNewComment_CommentText");
    private By _clickComment = new By.ByXPath("//button[@name='add-comment']");
    private By _TimeComment = new By.ByXPath("//div[@class='comment-list']/div[2]/div[5]/div[2]/div[1]");

    public void FillInTheDetails(){
        typetaxt(_Title, "Dear");
        typetaxt(_Textarea,"Hello");
        clickOnElement(_clickComment);

    }

public void verifyUserAddCommentSuccessfully(){
        String expectedAddedCompleteMGS = "News comment is successfully added.";
        String actualMessage = getTextFromelement(By.cssSelector("div.result"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectedAddedCompleteMGS ,"News comment is successfully added.");}

    public void verifyLasttimeMessageShouldPrint(){
        String expectelastInTheListMGS = "Created on: 5/9/2023 12:30 AM";
        String actualMessage = getTextFromelement(By.xpath("(//div[@class='comment-time'])[3]"));
        System.out.println("My mesage:"+actualMessage);// result willl come out
        Assert.assertEquals(actualMessage,expectelastInTheListMGS ,"Created on: 5/9/2023 12:30 AM");}
}

