package pages.car_loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {
    WebDriver driver;
    public CarLoansPage(WebDriver driver) {
        this.driver = driver;
    }

    public final By tabAgreement = By.xpath("//div[contains(text(), 'Agreements')]");

    public CarLoansPage selectAgreementsTab() {
        driver.findElement(tabAgreement).click();
        return this;
    }
}
