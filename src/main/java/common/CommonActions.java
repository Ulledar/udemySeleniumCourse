package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimeoutVariables.*;

public class CommonActions {

    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (PLATFORM_AND_BROWSER){
            case "CHROME_MAC" -> {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
                driver = new ChromeDriver();
            }
            case "CHROME_WINDOWS" -> {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                driver = new ChromeDriver();
            }
            case "MOZILLA_MAC" -> {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");
                driver = new ChromeDriver();
            }
            default -> throw new IllegalArgumentException("Unsupported platform and browser: " + PLATFORM_AND_BROWSER);
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);

        return driver;
    }
}
