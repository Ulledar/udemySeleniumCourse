package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneReplenishmentPage extends BasePage {

    public MobilePhoneReplenishmentPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By addToCartButton = By.xpath("//button[@data-qa-node='submit']");
    private final By paymentDetails = By.xpath("//div[@data-qa-node='details']");

    public MobilePhoneReplenishmentPage submitPayment() {
        driver.findElement(addToCartButton).click();
        return this;
    }

    public MobilePhoneReplenishmentPage paymentDetailsIsPresent(String text) {
        WebElement details = driver.findElement(paymentDetails);
        waitElementIsVisible(details);
        Assertions.assertEquals(text, details.getText());
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardCvv (String cardCvv) {
        driver.findElement(inputCardCvv).sendKeys(cardCvv);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardExpDate (String expDate) {
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    public MobilePhoneReplenishmentPage enterCardFrom (String card) {
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    public MobilePhoneReplenishmentPage enterPhoneNumber(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    public MobilePhoneReplenishmentPage enterAmount(String amount) {
        driver.findElement(inputAmount).clear();
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    public MobilePhoneReplenishmentPage selectChooseCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }
}
