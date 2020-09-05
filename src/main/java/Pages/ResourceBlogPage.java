package Pages;

import Constants.Constants;

public class ResourceBlogPage extends BasePage{
    public static final String HEADER= "//header[@class='section-header text-center']/h1";

    public static final String BLOG_PAGE_RESOURCES_DROP_LIST = "//div[@id='SiteNavLabel-resources']//descendant::ul//li[2]";
    public boolean isPageTitleVisible() {
        return elementExists(HEADER);
    }
}
