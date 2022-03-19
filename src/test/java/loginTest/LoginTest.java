package loginTest;

import base.ScriptBase;
import controller.MyStoreController;
import org.testng.annotations.Test;
public class LoginTest extends ScriptBase {

    MyStoreController myStoreController;


    @Test
    public void verifyLoginTestWithInvalidPassword() {
        myStoreController= new MyStoreController(driver);
        myStoreController.vaildLoginCode("test@gmail.com","1222333");
        myStoreController.invalidPasswordErrorValidation();


    }
    @Test
    public void verifyValidLoginTest() {
        myStoreController= new MyStoreController(driver);
        myStoreController.vaildLoginCode("zaman_test@gmail.com","Admin123");
        myStoreController.validLoginValidation();
        myStoreController.signOutAccount();


    }

}
