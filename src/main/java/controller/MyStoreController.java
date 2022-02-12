package controller;

import base.ScriptBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreController {

    @FindBy(xpath ="//a[@class='login']")
    WebElement signInButton;
    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(name = "email")
    WebElement inputEmailByName;


    public MyStoreController(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void browserFunctionalCode(WebDriver driver,String inputEmailOrPass) {
        signInButton.isDisplayed();
        signInButton.click();
        //inputEmail.sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//*[@id="+inputEmailOrPass+"]")).sendKeys();


    }

}
