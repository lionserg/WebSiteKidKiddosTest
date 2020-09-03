package COPY;

public class Copy {

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



    //    public EbooksByLanguage.DanishPage openEBooksByLanguageDanishTab() {
//        clickElementBypath(E_BOOKS_BY_LANGUAGE_OPTION);
//        clickElementBypath(DANISH_EBOOKS_BY_LANGUAGE_DROP_LIST);
//        return new EbooksByLanguage.DanishPage();
//    }
//
//    public EbooksByLanguage.DutchPage openEBooksByLanguageDutchTab() {
//        clickElementBypath(E_BOOKS_BY_LANGUAGE_OPTION);
//        clickElementBypath(DUTCH_EBOOKS_BY_LANGUAGE_DROP_LIST);
//        return new EbooksByLanguage.DutchPage();
//    }
//
//    public EbooksByLanguage.EnglishOnlyPage openEBooksByLanguageEnglishOnlyTab() {
//        clickElementBypath(E_BOOKS_BY_LANGUAGE_OPTION);
//        clickElementBypath(ENGLISH_ONLY_EBOOKS_BY_LANGUAGE_DROP_LIST);
//        return new EbooksByLanguage.EnglishOnlyPage();
//    }

//    public Resource openResourceTab(String Xpath) {
//
//        clickElementBypath(RESOURCES_OPTION);
//        clickElementBypath(Xpath);
//        return new Resource();

//    }
    //    public BooksByLanguage.DanishPage openBooksByLanguageDanishTab() {
//        clickElementBypath(BOOKS_BY_LANGUAGE_OPTION);
//        clickElementBypath(DANISH_BOOKS_BY_LANGUAGE_DROP_LIST);
//        return new BooksByLanguage.DanishPage();
//    }
//
//    public BooksByLanguage.DuthPage openBooksByLanguageDutchTab() {
//        clickElementBypath(BOOKS_BY_LANGUAGE_OPTION);
//        clickElementBypath(DUTCH_BOOKS_BY_LANGUAGE_DROP_LIST);
//        return new BooksByLanguage.DuthPage();
//    }
//
//    public BooksByLanguage.EnglishOnlyPage openBooksByLanguageEnglishOnlyTab() {
//        clickElementBypath(BOOKS_BY_LANGUAGE_OPTION);
//        clickElementBypath(ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST);
//        return new BooksByLanguage.EnglishOnlyPage();
//    }

    //    public AllLanguages.DanishPage openAllLanguagesDanishTab() {
//        clickElementBypath(ALL_LANGUAGES_OPTION);
//        clickElementBypath(DANISH_ALL_LANGUAGE_DROP_LIST);
//        return new AllLanguages.DanishPage();
//    }
//
//    public AllLanguages.DutchPage openAllLanguagesDutchTab() {
//        clickElementBypath(ALL_LANGUAGES_OPTION);
//        clickElementBypath(DUTCH_ALL_LANGUAGE_DROP_LIST);
//        return new AllLanguages.DutchPage();
//    }
//
//    public AllLanguages.EnglishOnlyPage openAllLanguagesEnglishOnlyTab() {
//        clickElementBypath(ALL_LANGUAGES_OPTION);
//        clickElementBypath(ENGLISH_ONLY_ALL_LANGUAGE_DROP_LIST);
//        return new AllLanguages.EnglishOnlyPage();
//    }


//    //LANGUAGE DROP LIST XPATH
//    private static final String DANISH_ALL_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-all-languages']//descendant::ul//li[3]";
//    private static final String DUTCH_ALL_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-all-languages']//descendant::ul//li[4]";
//    private static final String ENGLISH_ONLY_ALL_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-all-languages']//descendant::ul//li[5]";
//
//    //BOOKS BY LANGUAGE DROP LIST XPATH
//    private static final String DANISH_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[3]";
//    private static final String DUTCH_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[4]";
//    private static final String ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[5]";
//
//    // EBOOKS BY LANGUAGE DROP LIST XPATH
//    private static final String DANISH_EBOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-ebooks-by-language']//descendant::ul//li[3]";
//    private static final String DUTCH_EBOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-ebooks-by-language']//descendant::ul//li[4]";
//    private static final String ENGLISH_ONLY_EBOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-ebooks-by-language']//descendant::ul//li[5]";

}
