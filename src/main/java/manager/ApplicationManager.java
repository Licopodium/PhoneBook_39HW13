package manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public interface ApplicationManager {

    WebDriver wd = new ChromeDriver();

    default void init(){
        wd.manage().window().maximize();
        wd.navigate().to("https://telranedu.web.app/home");
        wd.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    default void tearDown(){
        wd.quit();
    }

}