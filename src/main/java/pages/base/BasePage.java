package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimeoutVariables.*;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");

//  The method to navigate to a specific URL
    public void goToUrl(String url) {
        driver.get(url);
    }

//  Waif for element visibility in DOM
    public WebElement waitElementIsVisible(WebElement element) {
        new WebDriverWait(driver, EXPLICIT_WAIT_TIME).until(ExpectedConditions.visibilityOf(element));
        return element;
    }

//  Check if Auth is available
    public void isAuthWidgetPresent(){
        WebElement authFrame = driver.findElement(authWidget);
        waitElementIsVisible(authFrame);
    }
}
















