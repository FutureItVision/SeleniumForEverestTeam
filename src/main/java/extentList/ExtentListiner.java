package extentList;

import base.ScriptBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Date;

public class ExtentListiner  implements ITestListener {
    static Date date=new Date();
    static String reportName="SeleniumTest_"+date.toString().replace(" ","_").replace(":","_")+".html";
   private static ExtentReports extent=ExtentManager.createInstance(System.getProperty("user.dir")+"/ExtentReports/"+reportName);
   private static ThreadLocal<ExtentTest> test=new ThreadLocal();

    public void onTestStart(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+" :started");
        ExtentTest extentTest=extent.createTest(result.getMethod().getMethodName(),result.getMethod().getDescription());
        test.set(extentTest);

    }

    public void onTestSuccess(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+" :Test Passed");
        test.get().pass("Test Pass");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println(result.getMethod().getMethodName()+" :Test failed with exception");
        Object testCalss=result.getInstance();
        WebDriver webDriver=((ScriptBase) testCalss).getDriver();
        String failTestScreenshot="data:imagge/png;base64,"+((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BASE64);
        test.get().fail(result.getThrowable()).addScreenCaptureFromBase64String(failTestScreenshot);

    }

    public void onTestSkipped(ITestResult result) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }

    public void onTestFailedWithTimeout(ITestResult result) {

    }

    public void onStart(ITestContext context) {

    }

    public void onFinish(ITestContext context) {
        extent.flush();

    }
}
