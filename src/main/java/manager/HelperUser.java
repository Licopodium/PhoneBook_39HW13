package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public interface HelperUser extends HelperBase{


    default boolean isLogged(){
        return isElementPresent(By.xpath("//*[.='Sign Out']"));
    }

    default void logout(){
        click(By.xpath("//*[.='Sign Out']"));
    }

    default void submitLogin(){
        wd.findElement(By.xpath("//button[1]")).click();
    }

    default void submitRegistration(){
        wd.findElement(By.xpath("//button[2]")).click();
    }
   default void fillLoginRegistrationForm(User user){

        type(By.xpath("//input[1]"), user.getEmail());;
        type(By.xpath("//input[2]"), user.getPassword());
    }

    default void openLoginRegistrationForm(){
        wd.findElement(By.xpath("//*[.='LOGIN']")).click();
    }
}

