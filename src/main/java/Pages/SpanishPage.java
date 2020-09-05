package Pages;

import Constants.Constants;

public class SpanishPage extends BasePage{

    public boolean isPageTitleVisible() {
        return elementExists(Constants.HEADER);
    }
}
