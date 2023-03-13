import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LeumiTest {
    WebDriver wd;
    @BeforeMethod
    public void preCondition() {

        wd = new ChromeDriver();
       wd.navigate().to("https://www.leumi.co.il/");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLeumi() {
        WebElement element1 = wd.findElement(By.xpath("//*[contains(@li, “first”)]"));

    }
    @AfterMethod
    public void tearDown() {
//        wd.quit();
    }
}

