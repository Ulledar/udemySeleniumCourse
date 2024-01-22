package tests.loans.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.CAR_LOANS_URL;

public class CarLoansPositiveTests extends BaseTest {

    @Test
    public void selectAgreementTabInPublicSession(){
        basePage.goToUrl(CAR_LOANS_URL);
        carLoansPage.selectAgreementsTab();
        basePage.isAuthWidgetPresent();
    }
}
