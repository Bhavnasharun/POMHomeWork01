package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().minimize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    public void closeBrowser(){
        driver.close();// this class have to creat second and only close and open
        //method willcom
    }}
