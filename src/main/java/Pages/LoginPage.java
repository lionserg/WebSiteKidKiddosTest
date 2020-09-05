package Pages;

public class LoginPage extends BasePage {
    public static final String LOGIN_HEADER = "//div[@id='CustomerLoginForm']//h1";
    private static final String EMAIL_FIELD = "//input[@id='CustomerEmail']";
    private static final String PASSWORD_FIELD = "//input[@id='CustomerPassword']";
    private static final String SIGN_IN_BUTTON = "//input[@value='Sign In']";
//    private static final String EMAIL_FIELD_ERROR = ;
//    private static final String _FIELD_ERROR = "//input[@value='Sign In']";

    public boolean isPageTitleVisible() {
        return elementExists(LOGIN_HEADER);
    }

    public void typeEmail(String email) {
        sendTextToElementByXpath(EMAIL_FIELD, email);
    }

    public void typePassword(String password) {
        sendTextToElementByXpath(PASSWORD_FIELD, password);
    }

    public void clickButton() {
        clickElementBypath(SIGN_IN_BUTTON);
    }
//    public CartPage openCartTab() {
//        clickElementBypath(SIGN_IN_BUTTON);
//        return new CartPage();

//    public boolean existsErrorUsername() {
//        return elementExists(USERNAME_ERROR);
//    }
}
