package Pages;

import Constants.Constants;

public class FAQsPage extends BasePage{


    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }
}
