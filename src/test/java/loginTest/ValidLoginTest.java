package loginTest;

import base.ScriptBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ValidLoginTest extends ScriptBase {

    @Test
    public void openBrowser(){
       beforeTest();

    }


    @Test
    public void firefoxT(){

    firefoxTest();

    }

    @Test
    public void firefoxTest(){
       firefoxTestWithoutDriver();


    }

    @Test
    public void ChromeWith(){
     ChromeWithoutDriver();

    }

    @Test
    public void SafariTest(){
        SafariWithoutDriver();
    }


}
