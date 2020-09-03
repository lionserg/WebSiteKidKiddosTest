package Pages;

import Constants.Constants;

public class EBooksByLanguagePage extends BasePage {
    //    private static final String CONTACT_US_HEADER= "//div[@class='section-header text-center']/h1";

    // EBOOKS BY LANGUAGE DROP LIST XPATH
    public static final String DANISH_EBOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-ebooks-by-language']//descendant::ul//li[3]";
    public static final String DUTCH_EBOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-ebooks-by-language']//descendant::ul//li[4]";
    public static final String ENGLISH_ONLY_EBOOKS_BY_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-ebooks-by-language']//descendant::ul//li[5]";

    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }
}
