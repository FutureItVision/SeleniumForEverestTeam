package loginTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class ValidLoginTest {

    @Test
    public void beforeTest(){
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
       // element.isDisplayed();
        System.out.println(element.isDisplayed());
        //System.out.println(element.getText());
        element.click();
        //driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).isDisplayed();



    }


    @Test
    public void firefoxTest(){
        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/drivers/geckodriver");
        WebDriver driver;
        driver=new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        System.out.println(element.isDisplayed());
        //System.out.println(element.getText());
        element.click();
        //driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).isDisplayed();



    }

    @Test
    public void firefoxTestWithoutDriver(){
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver;
        driver=new FirefoxDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        System.out.println(element.isDisplayed());
        //System.out.println(element.getText());
        element.click();
        //driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).isDisplayed();



    }

    @Test
    public void ChromeWithoutDriver(){
       WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        System.out.println(element.isDisplayed());
        //System.out.println(element.getText());
        element.click();
        driver.findElement(By.id("ember650")).sendKeys("test@gmail.com");



    }

    @Test
    public void SafariWithoutDriver(){
        WebDriverManager.safaridriver().setup();
        WebDriver driver;
        driver=new SafariDriver();
        driver.get("http://automationpractice.com/index.php");
        WebElement element=driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a"));
        // element.isDisplayed();
        System.out.println(element.isDisplayed());
        //System.out.println(element.getText());
        element.click();
        driver.findElement(By.id("ember650")).sendKeys("test@gmail.com");



    }

}
