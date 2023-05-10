package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class NikeProductPage extends Utils{
    public void AllTheNikeProduct() {
        List<WebElement> productList = driver.findElements(By.xpath("//div[@class='product-grid']"));
        for (WebElement e : productList) {
            System.out.println(e.getText());


    }}}