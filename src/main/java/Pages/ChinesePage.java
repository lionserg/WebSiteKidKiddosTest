package Pages;

import Constants.Constants;

public class ChinesePage extends BasePage{


    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }
}
