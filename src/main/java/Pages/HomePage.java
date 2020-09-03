package Pages;

public class HomePage extends BasePage{
    private static final String HOME_HEADER= "//img[@itemprop='logo']";

    public boolean isPageTitleVisible() {
        return elementExists(HOME_HEADER);
    }

}
