import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://documenter.getpostman.com/view/4016432/RWToRJCq#intro");
        String titleOfPage = driver.getTitle();
        System.out.println(titleOfPage);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
        System.out.println(driver.getPageSource());
    }
}
