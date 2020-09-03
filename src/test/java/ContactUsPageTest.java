import Pages.ContactUsPage;
import Pages.MainPage;
import Utils.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class ContactUsPageTest extends UseCaseBase {

    private static MainPage mainPage;
    private static final Logger logger= LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetUp() {
        mainPage = new MainPage();
    }

    @BeforeEach
    public void beforeTest() {
        mainPage.navigateToMainpage();
    }

    @Test
    public void mainPageLoadTest() {
        logger.info("Main page load test");
        mainPage.takeScreenshot("MainPageTest");
        Boolean success = mainPage.isLogovisible();
        assertTrue(success);
    }

    @Test

    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean success = contactUsPage.isPageTitleVisible();
        contactUsPage.takeScreenshot("ContactUsTest");
        assertTrue(success);
    }

    @Test
    public void blankFieldUserNameContactUsTest() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        contactUsPage.typeUserName(" ");
        contactUsPage.clickButton();
        logger.info("Negative Case for Username field");
        mainPage.takeScreenshot("ContactUsPageBlankFieldUsernameError");
        assertTrue(contactUsPage.existsErrorUsername());
    }

    @Test
    public void blankFieldEmailContactUsTest(){
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        contactUsPage.typeEmail(" ");
        contactUsPage.clickButton();
        logger.info("Negative case for Email field");
        mainPage.takeScreenshot("ContactUsPageBlankFieldEmailError");
        assertTrue(contactUsPage.existsErrorEmail());
    }
    @Test
    public void blankFieldSendMessageContactUsTest(){
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        contactUsPage.typeMessageField(" ");
        contactUsPage.clickButton();
        logger.info("Negative case for SendMessage field");
        mainPage.takeScreenshot("ContactUsPageBlankFieldSendMessageError");
        assertTrue(contactUsPage.existsErrorMessageField());
    }

    static Stream<Arguments> DataTestUserName() {

        return Stream.of(
                Arguments.of("long text long text long text long text long text long text long text long text"),
                Arguments.of("(519) 556-89-12"),
                Arguments.of("15Jan2020"),
                Arguments.of("-256644 2646 hghjkrf 69"),
                Arguments.of("%^^%&^^$#%*)__+"),
                Arguments.of("' '"),
                Arguments.of("    gkegjie")

        );

    }

    @ParameterizedTest
    @MethodSource("DataTestUserName")

    public void userNameFieldTest(String testingData){
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        logger.info("Positive cases Username field");
        contactUsPage.typeUserName(testingData);
        contactUsPage.clickButton();
        assertFalse(contactUsPage.existsErrorUsername());
    }

    static Stream<Arguments> DataTestSendMessage() {

        return Stream.of(
                Arguments.of("long text long text long text long text long text long text long text long text"),
                Arguments.of("(519) 556-89-12"),
                Arguments.of("15Jan2020"),
                Arguments.of("-256644 2646 hghjkrf 69"),
                Arguments.of("%^^%&^^$#%*)__+"),
                Arguments.of("' '"),
                Arguments.of("    gkegjie")

        );

    }

    @ParameterizedTest
    @MethodSource("DataTestSendMessage")

    public void sendMessageFieldTest(String testingData){
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        logger.info("Positive cases for SendMessage field");
        contactUsPage.typeMessageField(testingData);
        contactUsPage.clickButton();
        assertFalse(contactUsPage.existsErrorMessageField());
    }

    static Stream<Arguments> DataTestEmail() {

        return Stream.of(
                Arguments.of("long text long text long text long text long text long text long text long text"),
                Arguments.of("(519) 556-89-12"),
                Arguments.of("15Jan2020"),
                Arguments.of("-256644 2646 hghjkrf 69"),
                Arguments.of("%^^%&^^$#%*)__+"),
                Arguments.of("' '"),
                Arguments.of("    gkegjie")

        );

    }

    @ParameterizedTest
    @MethodSource("DataTestEmail")

    public void emailFieldTest(String testingData){
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        logger.info("Negative cases for Email field");
        contactUsPage.typeEmail(testingData);
        contactUsPage.clickButton();
        assertTrue(contactUsPage.existsErrorEmail());
    }

    @Test
    public void sendMessageTest(){
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        logger.info("Positive cases for each field");
        contactUsPage.sendMessage();
        String url= "https://kidkiddos.com/pages/contact-us";
        mainPage.takeScreenshot("ContactUsMessageHasSend");
        assertEquals(contactUsPage.getURLmethod(),url);

    }


}
