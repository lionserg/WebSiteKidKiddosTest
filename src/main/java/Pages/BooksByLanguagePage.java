package Pages;

import Constants.Constants;

public class BooksByLanguagePage extends BasePage{
    //BOOKS BY LANGUAGE DROP LIST XPATH
    public static final String DANISH_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[3]";
    public static final String DUTCH_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[4]";
    public static final String ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[5]";
    public static final String CHOOSE_PURCHASE_BOOK = "//*[@id='Collection']/div/div[1]/div/a/img";


    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }

    public BooksByLanguagePurchaseBookPage openBooksByLanguagePurchaseBookTab() {

        clickElementBypath(CHOOSE_PURCHASE_BOOK);
        return new BooksByLanguagePurchaseBookPage();

    }

}
