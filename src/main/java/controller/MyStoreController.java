package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MyStoreController {

    @FindBy(xpath ="//a[@class='login']")
    WebElement signInButton;
    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(name = "email")
    WebElement inputEmailByName;
    @FindBy(name = "SubmitLogin")
    WebElement submitLogin;
    @FindBy(xpath = "//li[contains(text(),'Invalid password.')]")
    WebElement invalidPassError;


    public MyStoreController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void vaildLoginCode(WebDriver driver, String inputEmailOrPass) {
        signInButton.click();
        driver.findElement(By.id(""+inputEmailOrPass+"")).sendKeys();
        submitLogin.click();


    }
 public void invalidPasswordErrorValidation(){
     Assert.assertEquals(invalidPassError,invalidPassError);
     Assert.assertTrue(invalidPassError.isDisplayed());
 }

}
