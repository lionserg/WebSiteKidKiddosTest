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

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPageTest extends UseCaseBase {

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


//    @Test
//    public void openAllLanguagesDanishPage() {
//        AllLanguages.DanishPage danishPage = mainPage.openAllLanguagesDanishTab();
//        boolean success = danishPage.isPageTitleVisible();
//        logger.info("AllLangugesDanishPage load test");
//        danishPage.takeScreenshot("AllLanguagesDanishPageTest");
//        assertTrue(success);
//    }
//
//    @Test
//    public void openAllLanguagesDutchPage() {
//        AllLanguages.DutchPage dutchPage = mainPage.openAllLanguagesDutchTab();
//        boolean success = dutchPage.isPageTitleVisible();
//        logger.info("AllLangugesDutchPage load test");
//        dutchPage.takeScreenshot("AllLanguagesDutchPageTest");
//        assertTrue(success);
//    }
//
//    @Test
//    public void openAllLanguagesEnglishonlyPage() {
//        AllLanguages.EnglishOnlyPage englishOnlyPage = mainPage.openAllLanguagesEnglishOnlyTab();
//        boolean success = englishOnlyPage.isPageTitleVisible();
//        logger.info("AllLangugesEnglishOnlyhPage load test");
//        englishOnlyPage.takeScreenshot("AllLanguagesEnglishOnlyPageTest");
//        assertTrue(success);
//    }
//
//    @Test
//    public void openBooksByLanguageDanishPage() {
//        BooksByLanguage.DanishPage danishPage = mainPage.openBooksByLanguageDanishTab();
//        boolean success = danishPage.isPageTitleVisible();
//        logger.info("BooksByLanguageDanishPage load test");
//        danishPage.takeScreenshot("BooksByLanguageDanishPageTest");
//        assertTrue(success);
//
//    }
//
//    @Test
//    public void openBooksByLanguageDutchPage() {
//        BooksByLanguage.DuthPage dutchTab = mainPage.openBooksByLanguageDutchTab();
//        boolean success = dutchTab.isPageTitleVisible();
//        logger.info("BooksByLanguageDutchPage load test");
//        dutchTab.takeScreenshot("BooksByLanguageDutchPageTest");
//        assertTrue(success);
//    }
//
//
//    @Test
//    public void openBooksByLanguageEnglishOnlyPage() {
//        BooksByLanguage.EnglishOnlyPage englishOnlyPage = mainPage.openBooksByLanguageEnglishOnlyTab();
//        boolean success = englishOnlyPage.isPageTitleVisible();
//        logger.info("BooksByLanguageEnglishOnlyPage load test");
//        englishOnlyPage.takeScreenshot("BooksByLanguageEnglishOnlyPageTest");
//        assertTrue(success);
//    }
//
//
//    @Test
//    public void openEbooksByLanguageDanishPage() {
//        EbooksByLanguage.DanishPage danishPage = mainPage.openEBooksByLanguageDanishTab();
//        boolean success = danishPage.isPageTitleVisible();
//        logger.info("EbooksByLanguageDanishPage load test");
//        danishPage.takeScreenshot("EbooksByLanguageDanishPageTest");
//        assertTrue(success);
//
//    }
//
//    @Test
//    public void openEbooksByLanguageDutchPage() {
//        EbooksByLanguage.DutchPage dutchPage = mainPage.openEBooksByLanguageDutchTab();
//        boolean success = dutchPage.isPageTitleVisible();
//        logger.info("EbooksByLanguageDutchPage load test");
//        dutchPage.takeScreenshot("EbooksByLanguageDutchPageTest");
//        assertTrue(success);
//    }
//
//
//    @Test
//    public void openEbooksByLanguageEnglishOnlyPage() {
//        EbooksByLanguage.EnglishOnlyPage englishOnlyPage = mainPage.openEBooksByLanguageEnglishOnlyTab();
//        boolean success = englishOnlyPage.isPageTitleVisible();
//        logger.info("BooksByLanguageEnglishOnlyPage load test");
//        englishOnlyPage.takeScreenshot("EbooksByLanguageEnglishOnlyPageTest");
//        assertTrue(success);
//    }

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
        AllLanguagesPage allLanguagesCopy = mainPage.openAlllanguagesTab(Xpath);
        boolean success = allLanguagesCopy.isPageTitleVisible();
        logger.info("SpanishPage load test");
        allLanguagesCopy.takeScreenshot("BlogPageTest");
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



}
