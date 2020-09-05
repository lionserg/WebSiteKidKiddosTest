package Pages;

import Constants.Constants;

public class
ResourceVideosPage extends BasePage{

    public static final String VIDEOS_PAGE_RESOURCES_DROP_LIST = "//div[@id='SiteNavLabel-resources']//descendant::ul//li[1]";


    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }
}
