package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HomePage extends Utils {
    //click here for resister button for qu. -1
    private By _registerButton = By.xpath("//a[@class='ico-register']");
    //click on good question-1
    private By _GooD = By.xpath("//input[contains(@id,'pollanswers-2')]");
    //click on element question -1
    private By _Vote = By.xpath("//div[@id='poll-block-1']/div[1]");
    //quistion 2 iteam apple make book
    private By _compairButton = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[2]");
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
    private By _SearchButton = By.xpath("//button[text()='Search']");
    private By _USDoller = By.id("customerCurrency");
    private By _Euro = By.id("customerCurrency");
    private By _faceBookButton = By.xpath("//a[text()='Facebook']");
    private By _SearchItem = By.id("small-searchterms");
    private By _Newrelease = By.xpath("//a[text()='nopCommerce new release!']");
    private By _addToCartComputer = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]");
    public void clickOnRegisterButton() {
        clickOnElement(_registerButton);
    }

    public void DoVoteButton() {//Q-1
        clickOnElement(_GooD);
        clickOnElement(_Vote);
    }

    public void CompairTheElement() {//Q-2
        clickOnElement(_compairButton);
        clickOnElement(_compairButtontwo);
        clickOnElement(_productCompair);
    }

    public void emailfriendIteam() {
        clickOnElement(_clickComputer);
    }

    public void addTocardIteam() {
        clickOnElement(_Electrics);
        clickOnElement(_Clickcamera);
    }

    public void clickOnLoginButton() {
        clickOnElement(_login);
    }

    public void clickOncomputerandsoftwear() {
        clickOnElement(_computers);
        clickOnElement(_Softwear);//total 14 iteam
    }

    public void ClickOnSearchButton() {
        clickOnElement(_SearchButton);
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");
        alert.accept();
    }

    public void printProductNames() {
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }

    }

    public void clickoncurrencyButtonDoller() {
        selectElementByText(_USDoller, "US Dollar");
        System.out.println("Your currency has chaneged as US Dollar");

        List<WebElement> actualcurrency = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement e : actualcurrency) {
            System.out.println(e.getText());
            String expectedDollerCurrencyShoulBePrintOut = "$1,200.00";
            String actualMessage = getTextFromelement(By.xpath("//span[@class='price actual-price']"));
             System.out.println(" mesage:"+actualMessage);// result willl come out
             Assert.assertEquals(actualMessage,expectedDollerCurrencyShoulBePrintOut,"$1,200.00");
             }}

    public void clickCurrencyButtonEuro(){
        selectElementByText(_Euro,"Euro");
        System.out.println("your currency has changed as Euro");
        List<WebElement> actualcurrency = driver.findElements(By.xpath("//span[@class='price actual-price']"));
        for (WebElement e : actualcurrency) {
            System.out.println(e.getText());
            String expectedEuroCurrencyShoulBePrintOut = "€1032.00";
            String actualMessage = getTextFromelement(By.xpath("//span[@class='price actual-price']"));
            System.out.println(" mesage:"+actualMessage);// result willl come out
            Assert.assertEquals(actualMessage,expectedEuroCurrencyShoulBePrintOut,"€1032.00");
    }}

    public void clickOnVoteButton(){
        clickOnElement(_Vote);
    }
    public void MessageShouldApearForVote(){
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "Please select an answer");
        alert.accept();

    }
    public void UserShouldAbleToclickOnfacebook(){
        clickOnElement(_faceBookButton);
        waitForClickable(_faceBookButton, 20);
        String MainWindow = driver.getWindowHandle();
        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();
            if(!MainWindow.equalsIgnoreCase(ChildWindow)){
                driver.switchTo().window(ChildWindow);
            }
          //  String actualMessage = getTextFromElement(_welComeMsg);
         //   System.out.println("My massage:"+actualMessage);
            //Close URL
          //  Assert.assertEquals(actualMessage,expectedWelcomeMsg);
    }}
    public void SearchIteamAccordingli(){
        typetaxt(_SearchItem,"Nike");
        clickOnElement(_SearchButton);

    }
    public void nopCommercenewRealease(){
        clickOnElement(_Newrelease);
    }
    public void BuildYourComputer(){
        clickOnElement(_addToCartComputer);
    }
}