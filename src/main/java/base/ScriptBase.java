package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ScriptBase {
   public WebDriver driver;

    @BeforeTest
    public void ChromeWithoutDriver(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver=new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
