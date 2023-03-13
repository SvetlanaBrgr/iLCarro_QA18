package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {
    @BeforeMethod
    public void preCondition() {
        if (app.getUser().isLogged()) {
            app.getUser().logout();
        }
    }
    @Test
    public void loginPositiveTest(){

            int i = (int)(System.currentTimeMillis() / 1000) % 3600;
            String name = "Rosa";
            String lastName = "Levit";
            String email =  "test"+i+"@mail.ru";
            String password = "Qwer1234$";

        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(name, lastName,email,password);

        app.getUser().checkboxLabel();
        app.getUser().buttonYalla();
        Assert.assertTrue(app.getUser().isLogged());

    }
    @Test
    public void loginNegativeTestWrongEmail(){
        String name = "Rosa";
        String lastName = "Levit";
        String email = "testmail.ru";
        String password = "Qwer1234$";

        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(name, lastName,email, password);
        app.getUser().checkboxLabel();
        app.getUser().buttonYalla();
    }
    @Test
    public void loginNegativeTestWrongPassword(){
        int i = (int)(System.currentTimeMillis() / 1000) % 3600;
        String name = "Rosa";
        String lastName = "Levit";
        String email = "test"+i+"@mail.ru";
        String password = "Q1234";

        app.getUser().openRegistrationForm();
        app.getUser().fillRegistrationForm(name, lastName,email, password);
        app.getUser().checkboxLabel();
        app.getUser().buttonYalla();
        app.getUser().submitButtonYalla();
    }

}
