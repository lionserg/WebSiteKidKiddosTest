import Pages.*;
import Utils.UseCaseBase;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends UseCaseBase {


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
    public void openResourcesBlogPage() {
        ResourceBlogPage resourceBlogPage = mainPage.openResourcesBlogTab();
        boolean success = resourceBlogPage.isPageTitleVisible();
        logger.info("ResourceBlogPage load test");
        resourceBlogPage.takeScreenshot("ResourceBlogPageTest");
        assertTrue(success);
    }

    @Test
    public void openResourcesVideosPage() {
        ResourceVideosPage resourceVideosPage = mainPage.openResourcesVideosTab();
        boolean success = resourceVideosPage.isPageTitleVisible();
        logger.info("ResourceVideosPage load test");
        resourceVideosPage.takeScreenshot("ResourceVideosPageTest");
        assertTrue(success);
    }

    @Test

    public void openContactUsPage() {
        ContactUsPage contactUsPage = mainPage.openContactUsTab();
        boolean success = contactUsPage.isPageTitleVisible();
        logger.info("ContactUsPage load test");
        contactUsPage.takeScreenshot("ContactUsTest");
        assertTrue(success);
    }

    @Test
    public void openBlogPage() {
        BlogPage blogPage = mainPage.openBlogTab();
        boolean success = blogPage.isPageTitleVisible();
        logger.info("BlogPage load test");
        blogPage.takeScreenshot("BlogPageTest");
        assertTrue(success);
    }


    @Test
    public void openChinesePage() {
        ChinesePage chinesePage = mainPage.openChineseTab();
        boolean success = chinesePage.isPageTitleVisible();
        logger.info("ChinesePage load test");
        chinesePage.takeScreenshot("ChinesePageTest");
        assertTrue(success);
    }

    @Test
    public void openFAQsPage() {
        FAQsPage faQsPage = mainPage.openFaqsTab();
        boolean success = faQsPage.isPageTitleVisible();
        logger.info("FAQsPage load test");
        faQsPage.takeScreenshot("FAQsPageTest");
        assertTrue(success);
    }

    @Test
    public void openFrancePage() {
        FrancePage francePage = mainPage.openFranceTab();
        boolean success = francePage.isPageTitleVisible();
        logger.info("FrancePage load test");
        francePage.takeScreenshot("FrancePageTest");
        assertTrue(success);
    }

    @Test
    public void openHomePage() {
        HomePage homePage = mainPage.openHomeTab();
        boolean success = homePage.isPageTitleVisible();
        logger.info("HomePage load test");
        homePage.takeScreenshot("HomePageTest");
        assertTrue(success);
    }

    @Test
    public void openSpanishPage() {
        SpanishPage spanishPage = mainPage.openSpanishTab();
        boolean success = spanishPage.isPageTitleVisible();
        logger.info("SpanishPage load test");
        spanishPage.takeScreenshot("BlogPageTest");
        assertTrue(success);
    }

    @Test
    public void openCartPage() {
        CartPage cartPage = mainPage.openCartTab();
        boolean success = cartPage.isPageTitleVisible();
        logger.info("SpanishPage load test");
        cartPage.takeScreenshot("BlogPageTest");
        assertTrue(success);
    }


    static Stream<Arguments> CurrencyDropList() {

        return Stream.of(
                Arguments.of(CurrencyPage.CURRENCY_DROP_LIST_AUD),
                Arguments.of(CurrencyPage.CURRENCY_DROP_LIST_BRL),
                Arguments.of(CurrencyPage.CURRENCY_DROP_LIST_CAD)

        );

    }

    @ParameterizedTest
    @MethodSource("CurrencyDropList")
    public void openCurrencyPage(String Xpath) {

        CurrencyPage currencyPage = mainPage.openCurrencyTab(Xpath);
        boolean success = currencyPage.isPageTitleVisible();
        logger.info("Currency Pageload test");
        currencyPage.takeScreenshot("CurrencyPageTest");
        assertTrue(success);
    }


    static Stream<Arguments> AllLanguages() {

        return Stream.of(
                Arguments.of(AllLanguagesPage.DANISH_ALL_LANGUAGE_DROP_LIST),
                Arguments.of(AllLanguagesPage.DUTCH_ALL_LANGUAGE_DROP_LIST),
                Arguments.of(AllLanguagesPage.ENGLISH_ONLY_ALL_LANGUAGE_DROP_LIST)

        );

    }

    @ParameterizedTest
    @MethodSource("AllLanguages")
    public void openAllLanguagesPage(String Xpath) {
        AllLanguagesPage allLanguagesPage = mainPage.openAlllanguagesTab(Xpath);
        boolean success = allLanguagesPage.isPageTitleVisible();
        logger.info("SpanishPage load test");
        allLanguagesPage.takeScreenshot("BlogPageTest");
        assertTrue(success);
    }


    static Stream<Arguments> BooksByLanguage() {

        return Stream.of(
                Arguments.of(BooksByLanguagePage.DANISH_BOOKS_BY_LANGUAGE_DROP_LIST),
                Arguments.of(BooksByLanguagePage.DUTCH_BOOKS_BY_LANGUAGE_DROP_LIST),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST)

        );

    }

    @ParameterizedTest
    @MethodSource("BooksByLanguage")
    public void openBooksByLanguagePage(String Xpath) {
        BooksByLanguagePage booksByLanguage = mainPage.openBooksByLanguageTab(Xpath);
        boolean success = booksByLanguage.isPageTitleVisible();
        logger.info("SpanishPage load test");
        booksByLanguage.takeScreenshot("BlogPageTest");
        assertTrue(success);
    }


    static Stream<Arguments> EBooksByLanguage() {

        return Stream.of(
                Arguments.of(EBooksByLanguagePage.DANISH_EBOOKS_BY_LANGUAGE_DROP_LIST),
                Arguments.of(EBooksByLanguagePage.DUTCH_EBOOKS_BY_LANGUAGE_DROP_LIST),
                Arguments.of(EBooksByLanguagePage.ENGLISH_ONLY_EBOOKS_BY_LANGUAGE_DROP_LIST)

        );

    }

    @ParameterizedTest
    @MethodSource("EBooksByLanguage")
    public void openEBooksByLanguagePage(String Xpath) {
        EBooksByLanguagePage eBooksByLanguage = mainPage.openEBooksByLanguageTab(Xpath);
        boolean success = eBooksByLanguage.isPageTitleVisible();
        logger.info("SpanishPage load test");
        eBooksByLanguage.takeScreenshot("BlogPageTest");
        assertTrue(success);
    }

    static Stream<Arguments> BooksDifferentLanguages() {

        return Stream.of(
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "1"),
                Arguments.of(BooksByLanguagePage.DUTCH_BOOKS_BY_LANGUAGE_DROP_LIST, "1"),
                Arguments.of(BooksByLanguagePage.DANISH_BOOKS_BY_LANGUAGE_DROP_LIST, "1"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "10"),
                Arguments.of(BooksByLanguagePage.DUTCH_BOOKS_BY_LANGUAGE_DROP_LIST, "10"),
                Arguments.of(BooksByLanguagePage.DANISH_BOOKS_BY_LANGUAGE_DROP_LIST, "10")
        );

    }

    @ParameterizedTest
    @MethodSource("BooksDifferentLanguages")

    public void verifyBookAdditionToCartTest(String xpath, String number) {
        BooksByLanguagePage booksByLanguagePage = mainPage.openBooksByLanguageTab(xpath);
        BooksByLanguagePurchaseBookPage booksByLanguagePurchaseBookPage = booksByLanguagePage.openBooksByLanguagePurchaseBookTab();
        booksByLanguagePurchaseBookPage.addToCartPurchaseBooks(number);
        CartPage cartPage = mainPage.openCartTab();
        int result = cartPage.verifyQuantityBookAddToCart();
        logger.info("VerifyingCartTest");
        cartPage.takeScreenshot("VerifyingCartTest");
        assertTrue(result >= 1);

    }

    static Stream<Arguments> NegativeData() {

        return Stream.of(
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "long text long text long text long text long text long text long text long text"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "(519) 556-89-12"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "-256644 2646 hghjkrf 69"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "%^^%&^^$#%*)__+"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "0"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, ",.")


        );

    }

    @ParameterizedTest
    @MethodSource("NegativeData")

    public void verifyBookAdditionToCartNegativeTest(String xpath, String testing_data) {
        BooksByLanguagePage booksByLanguagePage = mainPage.openBooksByLanguageTab(xpath);
        BooksByLanguagePurchaseBookPage booksByLanguagePurchaseBookPage = booksByLanguagePage.openBooksByLanguagePurchaseBookTab();
        booksByLanguagePurchaseBookPage.addToCartPurchaseBooks(testing_data);
        boolean result = booksByLanguagePurchaseBookPage.isPageTitleVisible();
        logger.info("VerifyingAdditionCartFieldNegativeTest");
        booksByLanguagePurchaseBookPage.takeScreenshot("VerifyingAdditionCartFieldNegativeTest");
        assertTrue(result);

    }

    static Stream<Arguments> NegativeDataLongNumber() {

        return Stream.of(
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "''"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "15Jan2020"),
                Arguments.of(BooksByLanguagePage.ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST, "45668925685292005")
        );
    }

    @ParameterizedTest
    @MethodSource("NegativeDataLongNumber")

    public void verifyBookAdditionToCartLongNumberNegativeTest(String xpath, String testing_data) {
        BooksByLanguagePage booksByLanguagePage = mainPage.openBooksByLanguageTab(xpath);
        BooksByLanguagePurchaseBookPage booksByLanguagePurchaseBookPage = booksByLanguagePage.openBooksByLanguagePurchaseBookTab();
        booksByLanguagePurchaseBookPage.addToCartPurchaseBooks(testing_data);
        logger.info("VerifyingAdditionCartFieldNegativeTest");
        booksByLanguagePurchaseBookPage.takeScreenshot("VerifyingAdditionCartFieldNegativeTest");
        boolean result = booksByLanguagePurchaseBookPage.isPageTitleVisible();
        assertFalse(result);

    }

}
