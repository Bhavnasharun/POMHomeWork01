package org.example;

import org.openqa.selenium.By;

import java.util.Base64;

public class WelcomeSignPage extends Utils {
    private By _CheckOutGest = new By.ByXPath("//button[text()='Checkout as Guest']");
    public void CheckOutAsGuest(){
        clickOnElement(_CheckOutGest);
    }

}
