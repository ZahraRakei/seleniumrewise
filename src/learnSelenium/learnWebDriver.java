package learnSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class learnWebDriver {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "/src/webDriver/chromedriver";
        System.setProperty("webdriver.chrome.driver", path);

        WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
      //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://walmart.com");
    }
}
