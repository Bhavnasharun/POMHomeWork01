package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterPage extends Utils{
    private By _firstName = By.id("FirstName");
    private By _LastName = By.id("LastName");
    private By _Email =By.id("Email");
    private By _Password = By.id("Password");
    private By _ConfirmPassword = By.id("ConfirmPassword");
    private By _registersubmitButton = By.id("register-button");
    private By _femaleButton = By.id("gender-female");

    public void FillinRegistrationDetails(){//regester for Q-7,6, 1
        clickOnElement(_femaleButton);
        typetaxt(_firstName,"TestFirstName");
        typetaxt(_LastName,"TestLastName");
        typetaxt(_Email,"test"+timestamp()+"@gmail.com");//this metod
        typetaxt(_Password,"Test1234");
        typetaxt(_ConfirmPassword,"Test1234");
        clickOnElement(_registersubmitButton);
        }

    }//uer should successfull register message should apear

