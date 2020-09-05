package Pages;

import Constants.Constants;

public class FrancePage extends BasePage{


    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }
}
