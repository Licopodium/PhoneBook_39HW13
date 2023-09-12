package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import models.User;
import org.testng.annotations.Test;

public class RegistrationTests extends TestBase{

    @Test
    public void registrationPositive(){
        int i = (int)(System.currentTimeMillis()/1000)%3600;

        User user = new User(

                "coral_" + i + "@gmail.com",
                "565656Ka$"
        );
        openLoginRegistrationForm();
        fillLoginRegistrationForm(user);
        submitRegistration();
        pause(3000);
        Assert.assertTrue(isAlertPresent());
    }

}
