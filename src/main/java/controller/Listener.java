package controller;

import base.ScriptBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.Utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Listener extends ScriptBase implements ITestListener{

    public void onTestStart(ITestResult result) {
        String methodName=result.getName();
        log.info("###############"+"Test Start: "+methodName+"##############");

    }

    public void onTestSuccess(ITestResult result) {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName=result.getName();
        if(result.isSuccess()){
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try{
                String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/successScreenshots";
                File destFile=new File((String)reportDirectory+"/"+methodName+"_"+formater.format(calendar.getTime())+".png");
                FileUtils.copyFile(srcFile,destFile);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

    }

    public void onTestFailure(ITestResult result) {
        Calendar calendar=Calendar.getInstance();
        SimpleDateFormat formater=new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
        String methodName=result.getName();
        if(result.getStatus()==ITestResult.FAILURE){
            File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            try{
                String reportDirectory=new File(System.getProperty("user.dir")).getAbsolutePath()+"/src/main/java/failureScreenshots";
                File destFile=new File((String)reportDirectory+"/"+methodName+"_"+formater.format(calendar.getTime())+".png");
                FileUtils.copyFile(srcFile,destFile);
            }catch (Exception e){
                e.printStackTrace();
            }

        }

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

    }

}
