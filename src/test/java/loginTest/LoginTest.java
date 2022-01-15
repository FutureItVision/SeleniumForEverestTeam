package loginTest;

import base.ScriptBase;
import controller.MyStoreController;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends ScriptBase {
    MyStoreController myStoreController;

   @BeforeTest
   public void beforeTest(){
       SafariWithoutDriver();
   }

    @Test
    public void verifyLoginTestWithSafari() throws InterruptedException {
        myStoreController= new MyStoreController(driver);
        myStoreController.safariBrowserFunctionalCode();

    }

}
