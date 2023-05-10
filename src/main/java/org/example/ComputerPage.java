package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//Q-6

public class ComputerPage extends Utils{
    public By _clickEmail = By.xpath("//button[text()='Email a friend']");
    public By _Processor = By.id("product_attribute_1");
    public By _Ram = By.xpath("//select[@id='product_attribute_2']");
    public By _HDD = By.id("product_attribute_3_6");
    public By _OS = By.id("product_attribute_4_9");
    public By _Microsoft = By.id("product_attribute_5_10");
    public By _Acrobat = By.id("product_attribute_5_11");
    public By _Commander = By.id("product_attribute_5_12");
    public By _AddToCart = By.id("add-to-cart-button-1");
    public By _ShoppingCart = By.xpath("//a[text()='shopping cart']");
    public void ClickOnEmailToFriend(){
        clickOnElement(_clickEmail);
    }
    public void BUildYourComputer(){
        selectElementByText(_Processor,"2.2 GHz Intel Pentium Dual-Core E2200");
        selectElementByText(_Ram,"8GB [+$60.00]");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(_Ram));
        clickOnElement(_HDD);
        clickOnElement(_OS);
        clickOnElement(_Microsoft);
        clickOnElement(_Acrobat);
        clickOnElement(_Commander);
        clickOnElement(_AddToCart);
        clickOnElement(_ShoppingCart);

    }

}
