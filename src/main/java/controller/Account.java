package controller;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.sql.Timestamp;

public class Account {
    @FindBy(id="email_create")
    WebElement createEmail;
    @FindBy(xpath ="//a[@class='login']")
    WebElement signInButton;
    @FindBy(id = "passwd")
    WebElement inputPassword;
    @FindBy(id = "email")
    WebElement inputEmailByName;
    @FindBy(name = "SubmitLogin")
    WebElement submitLogin;
    @FindBy(xpath = "//li[contains(text(),'Authentication failed.')]")
    WebElement authError;
    @FindBy(xpath = "//span[contains(text(),'Zaman MD')]")
    WebElement validAccountValidation;
    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement signOut;



    public Account(WebDriver driver){
        PageFactory.initElements(driver,this);
    }


    public void createAnAccount(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        createEmail.sendKeys("test"+timestamp.toString().replace(" ","S").replace(":","C").replace(".","D")+"@gmail.com");
    }

    public void time(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    }
    public void vaildLoginCode(String inputEmail, String inputPass) {
        signInButton.click();
        inputEmailByName.sendKeys(inputEmail);
        inputPassword.sendKeys(inputPass);
        submitLogin.click();


    }
    public void invalidPasswordErrorValidation(){
        Assert.assertEquals(authError,authError);
        Assert.assertTrue(authError.isDisplayed());
    }

    public void validLoginValidation(){
        Assert.assertEquals(validAccountValidation,validAccountValidation);
        Assert.assertTrue(validAccountValidation.isDisplayed());
    }
}

