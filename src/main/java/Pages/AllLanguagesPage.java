package Pages;

import Constants.Constants;

public class AllLanguagesPage extends BasePage{

//    private static final String CONTACT_US_HEADER= "//div[@class='section-header text-center']/h1";

    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }

    //LANGUAGE DROP LIST XPATH
    public static final String DANISH_ALL_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-all-languages']//descendant::ul//li[3]";
    public static final String DUTCH_ALL_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-all-languages']//descendant::ul//li[4]";
    public static final String ENGLISH_ONLY_ALL_LANGUAGE_DROP_LIST = "//div[@id='SiteNavLabel-all-languages']//descendant::ul//li[5]";




}
