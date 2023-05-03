package org.example;

import org.openqa.selenium.By;

public class Windows8Page extends Utils{
    private By _ClickEmail = By.xpath("//button[text()=\"Email a friend\"]");
    public void clickonthebutton(){
        clickOnElement(_ClickEmail  );//window 8 pro Q-6
    }
}
