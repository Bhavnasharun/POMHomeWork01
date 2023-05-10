package org.example;

import org.openqa.selenium.By;

public class BillingCheckOutPage extends Utils {
    private By _FirstName = new By.ById("BillingNewAddress_FirstName");
    private By _LastName = new By.ById("BillingNewAddress_LastName");
    private By _Email = new By.ById("BillingNewAddress_Email");
    private By _Country = new By.ById("BillingNewAddress_CountryId");
    private By _province = new By.ById("BillingNewAddress_StateProvinceId");
    private By _City = new By.ById("BillingNewAddress_City");
    private By _Address = new By.ById("BillingNewAddress_Address1");
    private By _PostCode = new By.ById("BillingNewAddress_ZipPostalCode");
    private By _PhoneNumber = new By.ById("BillingNewAddress_PhoneNumber");
    private By _Continue = new By.ByName("save");
    public void shipingAddressDetails(){
    typetaxt(_FirstName,"Ram");
    typetaxt(_LastName,"Sharma");
    typetaxt(_Email,"ram.sharma"+timestamp()+"@gmail.com");
    selectElementByText(_Country,"United States");
    selectElementByText(_province,"AE (Armed Forces Europe)");
    typetaxt(_City,"London");
    typetaxt(_Address,"89 Chessington Aveune");
    typetaxt(_PostCode,"HA3 7SB");
    typetaxt(_PhoneNumber,"07483560066");
    clickOnElement(_Continue);


    }
}
