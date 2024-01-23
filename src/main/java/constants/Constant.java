package constants;

public class Constant {

    public static class TimeoutVariables {
        public static final int IMPLICIT_WAIT_TIME = 5;
        public static final int EXPLICIT_WAIT_TIME = 10;
    }

    public static class Urls{
        public static final String MOBILE_PAYMENT_URL = "https://next.privat24.ua/mobile?lang=en";
        public static final String CAR_LOANS_URL = "https://next.privat24.ua/auto-credit/order?lang=en";
    }

    public static class MobileReplenishmentTestData {
        public static final String MOBILE_PAYMENT_PHONE_NUMBER = "686976712";
        public static final String MOBILE_PAYMENT_CARD = "4567739561253907";
        public static final String MOBILE_PAYMENT_CARD_EXP_DATE = "0924";
        public static final String MOBILE_PAYMENT_CARD_CVV = "528";
    }
}
