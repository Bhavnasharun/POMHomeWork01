package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Set;

public class Utils extends BasePage {
    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typetaxt(By by, String text){driver.findElement(by).sendKeys(text);}
    public static String getTextFromelement(By by){return driver.findElement(by).getText();}
    public static long timestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();}
    public static void selectElementByText(By by, String text){
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void  selectElementByValue(By by, String value){
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static void selectElementByIndex(By by, int index){
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void waitForClickable(By by, int timeInSec){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }



}//all the method have to declair


