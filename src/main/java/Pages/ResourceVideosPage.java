package Pages;

public class
ResourceVideosPage extends BasePage{
    private static final String CONTACT_US_HEADER= "//div[@class='section-header text-center']/h1";

    public boolean isPageTitleVisible() {
        return elementExists(CONTACT_US_HEADER);
    }
}
