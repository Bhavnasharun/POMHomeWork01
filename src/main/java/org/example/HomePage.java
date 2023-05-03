package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends Utils{
    //click here for resister button for qu. -1
    private By _registerButton =  By.className("//a[text()=\"Register\"]");
    //click on good question-1
    private By _GooD = By.xpath("//input[contains(@id,\"pollanswers-2\")]");
  //click on element question -1
    private By _Vote = By.xpath("//div[@id=\"poll-block-1\"]/div[1]");
    //quistion 2 iteam apple make book
    private By _compairButton = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]");
   //qution 2 compair iteam Visual gift card
    private By _compairButtontwo = By.xpath("//div[@class=\"product-grid home-page-product-grid\"]/div[2]/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
   //qu-2 message appear compair item to go next page click on
    private By _productCompair = By.xpath("//a[text()='product comparison']");
    //qu-3 add product success fully build own computer
    private By _clickComputer = By.xpath("//a[text()='Build your own computer']");
   //qution- 5 addd to go camera product
    private By _Electrics = By.xpath("//div[@class=\"header-menu\"]/ul[1]/li[2]/a");
  //drop down button camera click on Q-5
    private By _Clickcamera = By.xpath("/div[@class=\"header-menu\"]/ul[1]/li[2]/ul/li[1]/a/");
  //  private By _registeragain = By.xpath("//a[text()=\"Register\"]");
    private By _Good1 = By.className("pollanswers-1");//Q-7 register successfull
    private By _Vote1 = By.xpath("//button[text()=\"Vote\"]");//Q-7
    private By _login = By.xpath("//a[text()=\"Log in\"]");//Q-7 do log in for vote
    private By _computers = By.linkText("Computers ");//Q-6 click on computer
    private By _Softwear = By.linkText("Software ");//Q-6 click on drop down button
    public void clickOnRegisterButton(){
        clickOnElement(_registerButton);}
    public void DoVoteButton(){//Q-1
        clickOnElement(_GooD);
        clickOnElement(_Vote);}
    public void CompairTheElement(){//Q-2
        clickOnElement(_compairButton);
        clickOnElement(_compairButtontwo);
        clickOnElement(_productCompair);}
    public void emailfriendIteam(){
        clickOnElement(_clickComputer);}
    public void addTocardIteam(){
        clickOnElement(_Electrics);
        clickOnElement(_Clickcamera);}

        public void clickOnLoginButton(){
        clickOnElement(_login);}
    public void clickOncomputerandsoftwear(){
        clickOnElement(_computers);
        clickOnElement(_Softwear);//total 14 iteams

}


}
