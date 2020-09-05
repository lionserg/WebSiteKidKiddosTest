package Pages;


public class CartPage extends BasePage{
    public static final String HEADER = "//div[@class='empty-page-content text-center']//h1";

    public boolean isPageTitleVisible() {
        return elementExists(HEADER);
    }

}
