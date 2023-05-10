package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class FaceBookPage extends Utils{
    private By _cookies = new By.ByXPath("(//div[@aria-label = 'Allow all cookies'])[2]/div[1]/div[1]");
    private By _close = new By.ByXPath("//div[@role='dialog']/div[1]");
    private By _Email = new By.ByXPath("//input[@placeholder='Email or phone']");
    private By _Password = new By.ByXPath("//input[@placeholder='Password']");
    private By _Login = new By.ByXPath("(//span[text()='Log in'])[2]");

    public void verifyingFacebookPage() {
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertEquals(currentURL,"https://www.facebook.com/nopCommerce");
        clickOnElement(_cookies);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(_close));
        clickOnElement(_close);

        if(driver.findElements(_Email).size() != 0){
            System.out.println("Element Email is Present");
        }else{
            System.out.println("Element Email is Absent");
        }
        if(driver.findElements(_Password).size() != 0){
            System.out.println("Element Email is Present");
        }else{
            System.out.println("Element Email is Absent");
        }
        if(driver.findElements(_Login).size() != 0){
            System.out.println("Element Email is Present");
        }else{
            System.out.println("Element Email is Absent");
        }
        // Closing the Child Window.
        driver.close();


    }}