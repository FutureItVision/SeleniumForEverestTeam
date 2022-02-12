package loginTest;

import base.ScriptBase;
import controller.MyStoreController;
import org.testng.annotations.Test;
public class LoginTest extends ScriptBase {

    MyStoreController myStoreController;


    @Test
    public void verifyLoginTet() {
        myStoreController= new MyStoreController(driver);
        myStoreController.browserFunctionalCode(driver,"email");
        myStoreController.browserFunctionalCode(driver,"passwd");


    }

}
