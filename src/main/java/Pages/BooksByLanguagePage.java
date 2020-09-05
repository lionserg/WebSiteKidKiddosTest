package Pages;

import Constants.Constants;

public class BooksByLanguagePage extends BasePage{
    //BOOKS BY LANGUAGE DROP LIST XPATH
    public static final String DANISH_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[3]";
    public static final String DUTCH_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[4]";
    public static final String ENGLISH_ONLY_BOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-books-by-language']//descendant::ul//li[5]";



    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }

}
