package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import models.User;

public class LoginTests extends TestBase{


    @Test
    public void loginPositiveTest() {
        User user = new User(

                "coral@gmail.com",
                "565656Ca$");
        openLoginRegistrationForm();
        fillLoginRegistrationForm(user);
        submitLogin();
        pause(3000);
        Assert.assertTrue(isElementPresent(By.tagName("button")));
    }
    }


