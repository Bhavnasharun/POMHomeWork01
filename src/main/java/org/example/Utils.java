package org.example;

import org.openqa.selenium.By;

import java.sql.Timestamp;

public class Utils extends BasePage {
    public static void clickOnElement(By by){driver.findElement(by).click();}
    public static void typetaxt(By by, String text){driver.findElement(by).sendKeys(text);}
    public static String getTextFromelement(By by){return driver.findElement(by).getText();}
    public static long timestamp(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime();

    }}//all the method have to declair


