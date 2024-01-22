package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneReplenishmentPage.selectChooseCardFromWallet();
        basePage.isAuthWidgetPresent();
    }
}
