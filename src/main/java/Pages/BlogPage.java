package Pages;

public class BlogPage extends BasePage{

    private static final String CONTACT_US_HEADER= "//header[@class='section-header text-center']/h1";

    public boolean isPageTitleVisible() {
        return elementExists(CONTACT_US_HEADER);
    }
}
