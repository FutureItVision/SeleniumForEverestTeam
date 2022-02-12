package loginTest;

import base.ScriptBase;
import controller.MyStoreController;
import org.testng.annotations.Test;
public class LoginTest extends ScriptBase {

    MyStoreController myStoreController;


    @Test
    public void verifyLoginTestWithInvalidPassword() {
        myStoreController= new MyStoreController(driver);
        myStoreController.vaildLoginCode(driver,"email");
        myStoreController.vaildLoginCode(driver,"passwd");
        myStoreController.invalidPasswordErrorValidation();


    }
    @Test
    public void verifyLoginTestWithInvalidEmail() {
        myStoreController= new MyStoreController(driver);
        myStoreController.vaildLoginCode(driver,"email");
        myStoreController.vaildLoginCode(driver,"passwd");
        myStoreController.invalidPasswordErrorValidation();


    }
    @Test
    public void verifyLoginTestWithValidPassword() {
        myStoreController= new MyStoreController(driver);
        myStoreController.vaildLoginCode(driver,"email");
        myStoreController.vaildLoginCode(driver,"passwd");


    }
    @Test
    public void verifyLoginTestWithValidemail() {
        myStoreController= new MyStoreController(driver);
        myStoreController.vaildLoginCode(driver,"email");
        myStoreController.vaildLoginCode(driver,"passwd");


    }
}
