package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class VoteResult extends Utils{
        public String expectedRegistretionCompleteMSG = "Your registration completed";
        public void VeryfyingUserShoulVote(){//for vote mesage success full Q-1
            String actualMessage = getTextFromelement(By.xpath("//div[@class=\\\"poll-vote-error\\\"]"));
            System.out.println("Actual masage:"+actualMessage);
            //expected result
            Assert.assertEquals(actualMessage,expectedRegistretionCompleteMSG,"User should vote");
        }}
