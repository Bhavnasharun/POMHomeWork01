package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils{
   // private By _femaleButton = By.id("gender-female");
    private By _firstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _Email =By.id("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registersubmitButton = By.id("register-button");
    private By _day = By.name("DateOfBirthDay");
    private By _month = By.name("DateOfBirthMonth");
    private By _Year = By.name("DateOfBirthYear");


    public void FillinRegistrationDetails(){//regester for Q-7,6, 1
      //  clickOnElement(_femaleButton);
        typetaxt(_firstName,"Sayam");
        typetaxt(_LastName,"Ram");
        selectElementByValue(_day,"6");
        selectElementByIndex(_month,4);
        selectElementByText(_Year,"1996");
        typetaxt(_Email,"SayamRam"+timestamp()+"@gmail.com");//this metod
        typetaxt(_Password,"Ram1234");
        typetaxt(_ConfirmPassword,"Ram1234");
        clickOnElement(_registersubmitButton);

        }


    }//uer should successfull register message should apear

