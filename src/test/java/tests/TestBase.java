package tests;

import manager.ApplicationManager;
import manager.HelperBase;
import manager.HelperUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;
public class TestBase implements HelperUser {

    WebDriver wd;

    @BeforeSuite
//    public void init(){
//        wd = new ChromeDriver();
//        wd.navigate().to("https://telranedu.web.app/home");
//        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//    }
    public void setup() {
        init();
    }


    @AfterSuite
//    public void tearDown(){
//        pause(5000);
//        wd.quit();
//    }
    public void stop() {
        pause(5000);
        tearDown();
    }
}