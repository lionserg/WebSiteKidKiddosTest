import Pages.ContactUsPage;
import Pages.LoginPage;
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

    public class LoginPageTest extends UseCaseBase {

        private static MainPage mainPage;
        private static final Logger logger = LogManager.getLogger(MainPageTest.class);

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
            boolean success = mainPage.isLogovisible();
            assertTrue(success);
        }

        @Test
        public void openLoginPage() {
            LoginPage loginPage = mainPage.openLoginTab();
            boolean success = loginPage.isPageTitleVisible();
            loginPage.takeScreenshot("ContactUsTest");
            assertTrue(success);
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

        public void EmailLoginPageNegativeTest(String Xpath) {
            LoginPage loginPage = mainPage.openLoginTab();
            loginPage.typeEmail(Xpath);
            loginPage.clickButton();
            logger.info("Negative Case for Email field");
            mainPage.takeScreenshot("LoginPageEmailError");
            assertTrue(loginPage.isPageTitleVisible());
        }



        @Test
        public void EmailLoginPagePositiveTest() {
            LoginPage loginPage = mainPage.openLoginTab();
            loginPage.typeEmail("test@example.com");
            loginPage.clickButton();
            logger.info("Positive Case for Email field");
            mainPage.takeScreenshot("LoginPageEmailPositiveResult");
            assertFalse(loginPage.isPageTitleVisible());
        }

        static Stream<Arguments> DataTestPassword() {

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
        @MethodSource("DataTestPassword")
        public void LoginPagePasswordNegativeTest(String testingData) {
            LoginPage loginPage = mainPage.openLoginTab();
            loginPage.typePassword(testingData);
            loginPage.clickButton();
            logger.info("Negative Case for Password field");
            mainPage.takeScreenshot("LoginPagePasswordNegativeResult");
            assertFalse(loginPage.isPageTitleVisible());
        }
    }