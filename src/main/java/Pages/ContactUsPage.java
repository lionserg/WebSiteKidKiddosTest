package Pages;

import Constants.Constants;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage {

    private static final String CONTACT_US_HEADER = "//h1[text()='Contact us']";
    private static final String USERNAME_FIELD = "//input[@name='field[3]']";
    private static final String EMAIL_FIELD = "//input[@name='email']";
    private static final String YOUR_MESSAGE_FIELD = "//textarea[@name='field[7]']";
    private static final String BUTTON_SEND_YOUR_MESSAGE = "//button[@class='_submit']";
    private static final String USERNAME_ERROR = "//div[@class='_field-wrapper']/input[@name='field[3]']//following-sibling::div";
    private static final String EMAIL_ERROR = "//div[@class='_field-wrapper']/input[@name='email']//following-sibling::div";
    private static final String YOUR_MESSAGE_FIELD_ERROR = "//div[@class='_field-wrapper']/textarea[@name='field[7]']//following-sibling::div";


    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);

    }

    public void typeUserName(String userName) {
        sendTextToElementByXpath(USERNAME_FIELD, userName);
    }

    public void typeEmail(String email) {
        sendTextToElementByXpath(EMAIL_FIELD, email);
    }

    public void typeMessageField(String messageField) {
        sendTextToElementByXpath(YOUR_MESSAGE_FIELD, messageField);
    }

    public boolean existsErrorUsername() {
        return elementExists(USERNAME_ERROR);
    }

    public boolean existsErrorEmail() {
        return elementExists(EMAIL_ERROR);
    }

    public boolean existsErrorMessageField() {
        return elementExists(YOUR_MESSAGE_FIELD_ERROR);
    }

    public void clickButton() {
        clickElementBypath(BUTTON_SEND_YOUR_MESSAGE);
    }
    public void sendMessage(){
        typeUserName("John Smith");
        typeEmail("JohnSmith@gmail.com");
        typeMessageField("I like to read the books");
        clickButton();
    }
    public String getURLmethod(){
        return getCurrentPageURL();
    }
}



