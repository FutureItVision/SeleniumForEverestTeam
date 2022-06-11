package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class ScriptBase {
   public static WebDriver driver;
   public WebDriver getDriver(){
       return driver;
   }
   public static final Logger log=Logger.getLogger(ScriptBase.class.getName());
    @Parameters("browser")
    @BeforeTest
    public void beforeTest(String browser){
        String Log4jConfigPath="log4j.properties";
        PropertyConfigurator.configure(Log4jConfigPath);
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");
            System.out.println(Thread.currentThread().getName());
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            driver.get("http://automationpractice.com/index.php");

        }else if(browser.equalsIgnoreCase("chromeHeadless")){
            WebDriverManager.chromedriver().setup();
            ChromeOptions options=new ChromeOptions();
            options.addArguments("--headless");
            driver=new ChromeDriver(options);
            driver.get("http://automationpractice.com/index.php");

        }else if(browser.equalsIgnoreCase("firefoxHeadless")){
            WebDriverManager.firefoxdriver().setup();
            FirefoxOptions options=new FirefoxOptions();
            options.addArguments("--headless");
            driver=new FirefoxDriver(options);
            driver.get("http://automationpractice.com/index.php");

        }else if(browser.equalsIgnoreCase("opera")){
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
            driver.get("http://automationpractice.com/index.php");

        }


    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }

}
