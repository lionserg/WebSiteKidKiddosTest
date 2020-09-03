package Pages;

import Constants.Constants;

public class ChinesePage extends BasePage{
//    private static final String CONTACT_US_HEADER= "//div[@class='section-header text-center']/h1";

    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }
}
