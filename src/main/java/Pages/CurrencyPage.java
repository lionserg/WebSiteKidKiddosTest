package Pages;

public class CurrencyPage extends BasePage {

    public static final String CURRENCY_DROP_LIST_AUD = "//ul[2]/li[2]";
    public static final String CURRENCY_DROP_LIST_BRL = "//ul[2]/li[3]";
    public static final String CURRENCY_DROP_LIST_CAD = "//ul[2]/li[4]";
    public static final String CURRENCY_HEADER = "//header/div/div[3]/div/span[2]/span";


    public boolean isPageTitleVisible() {
        return elementExists(CURRENCY_HEADER);
    }
}
