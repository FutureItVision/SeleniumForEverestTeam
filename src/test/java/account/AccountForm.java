package account;

import base.ScriptBase;
import controller.Account;
import controller.MyStoreController;
import org.testng.annotations.Test;

public class AccountForm extends ScriptBase {
Account account;

    @Test
    public void verifyLoginTestWithInvalidPassword() {
        account= new Account(driver);
        account.vaildLoginCode("test@gmail.com","1222333");
        account.invalidPasswordErrorValidation();
    }
    @Test
    public void verifyCreateEmailEccepted() {
        account= new Account(driver);
       account.createAnAccount();


    }
}
