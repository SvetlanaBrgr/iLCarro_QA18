package manager;

import com.sun.org.apache.bcel.internal.generic.LASTORE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {//create constructor - Generate->Constructor
        super(wd);
    }

    public void openRegistrationForm() {
        click(By.xpath("//a[5]"));
        //"//a _ngcontent-wib-c44[@class = 'navigation-link']"
    }
    public void fillRegistrationForm(String name, String lastName, String email,String password){
        type(By.xpath("//input[@id='name']"), name);
        type(By.xpath("//input[@id='lastName']"), lastName);
        type(By.xpath("//input[@id='email']"), email);
        type(By.xpath("//input[@id='password']"), password);

    }

    public void checkboxLabel(){
        click(By.xpath("//label[@class = 'checkbox-label terms-label']"));
    }
    public void buttonYalla(){
        click(By.xpath("//button[@type='submit']"));
    }
    public void submitButtonYalla() {
        click(By.xpath("//button[@type='submit']"));

    }
    public void logout(){
        click(By.xpath("//a[5]"));
//        click(By.xpath("//button[.='Sign Out']"));
    }
    public boolean isLogged(){
        return isElementPresent(By.xpath("//a[5]"));
    }
}
