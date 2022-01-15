package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreController {


    @FindBy(xpath = "//*[@id='header']/div[2]/div/div/nav/div[1]/a")
    WebElement signInButton;
    @FindBy(id = "email")
    WebElement inputEmail;

    public MyStoreController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void safariBrowserFunctionalCode() throws InterruptedException {
        Thread.sleep(1000);
        signInButton.isDisplayed();
        Thread.sleep(1000);
        signInButton.click();
        Thread.sleep(1000);
        inputEmail.sendKeys("test@gmail.com");

    }

}
