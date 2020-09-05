package Pages;

import Constants.Constants;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {


    private static final String CONTACT_US_OPTION = "//a[text()='Contact Us']";
    private static final String ALL_LANGUAGES_OPTION = "//a[@aria-controls= 'SiteNavLabel-all-languages']";
    private static final String BLOG_OPTION = "//a[@class='site-nav__link site-nav__link--main'][text()='Blog']";
    private static final String BOOKS_BY_LANGUAGE_OPTION = "//a[@aria-controls= 'SiteNavLabel-books-by-language']";
    private static final String CHINESE_OPTION = "//a[text()='中文']";
    private static final String E_BOOKS_BY_LANGUAGE_OPTION = "//a[@aria-controls='SiteNavLabel-ebooks-by-language']";
    private static final String FRANCE_OPTION = "//a[text()='Français']";
    private static final String HOME_OPTION = "//a[text()='Home']";
    private static final String RESOURCES_OPTION = "//a[@aria-controls='SiteNavLabel-resources']";
    private static final String SPANISH_OPTION = "//a[text()='Español']";
    private static final String FAQS_OPTION = "//a[text()='FAQs']";
    private static final String LOGIN_OPTION = "//a[@class='site-header__account']";
    private static final String CART_OPTION = "//a[@class='site-header__cart']";
    private static final String CURRENCY_OPTION = "//span[@class='currency-converter-currency-button skiptranslate notranslate']";
    private static final String CHOOSE_CURRENCY = "//ul[@style='list-style-type: none; text-align: left; border: 1px solid rgb(216, 216, 216); background-color: rgb(255, 255, 255); border-radius: 2px; position: absolute; z-index: 100000000; margin: 0px; padding: 2px; max-height: 400px; min-width: 80px; min-height: 50px; top: 130.469px; left: 629.938px; display: block; overflow-y: auto;']/li[@class='currency-converter-chooser-item cbb-currency-code-AUD']";


    private static final String MAIN_PAGE_LOGO_IMG = "//img[@itemprop='logo']";


    public void navigateToMainpage() {
        webDriver.get(Constants.MAIN_URL);
    }

    public boolean isLogovisible() {

        boolean isvisible = elementExists(MAIN_PAGE_LOGO_IMG);
        return isvisible;
    }


    public AllLanguagesPage openAlllanguagesTab(String Xpath) {

        clickElementBypath(ALL_LANGUAGES_OPTION);
        clickElementBypath(Xpath);
        return new AllLanguagesPage();

    }


    public BooksByLanguagePage openBooksByLanguageTab(String Xpath) {

        clickElementBypath(BOOKS_BY_LANGUAGE_OPTION);
        clickElementBypath(Xpath);
        return new BooksByLanguagePage();

    }


    public EBooksByLanguagePage openEBooksByLanguageTab(String Xpath) {

        clickElementBypath(E_BOOKS_BY_LANGUAGE_OPTION);
        clickElementBypath(Xpath);
        return new EBooksByLanguagePage();

    }

    public ResourceBlogPage openResourcesBlogTab() {
        clickElementBypath(RESOURCES_OPTION);
        clickElementBypath(ResourceBlogPage.BLOG_PAGE_RESOURCES_DROP_LIST);
        return new ResourceBlogPage();
    }


    public ResourceVideosPage openResourcesVideosTab() {
        clickElementBypath(RESOURCES_OPTION);
        clickElementBypath(ResourceVideosPage.VIDEOS_PAGE_RESOURCES_DROP_LIST);
        return new ResourceVideosPage();
    }


    public SpanishPage openSpanishTab() {
        clickElementBypath(SPANISH_OPTION);
        return new SpanishPage();
    }

    public FAQsPage openFaqsTab() {
        clickElementBypath(FAQS_OPTION);
        return new FAQsPage();
    }

    public FrancePage openFranceTab() {
        clickElementBypath(FRANCE_OPTION);
        return new FrancePage();
    }

    public HomePage openHomeTab() {
        clickElementBypath(HOME_OPTION);
        return new HomePage();
    }

    public ChinesePage openChineseTab() {
        clickElementBypath(CHINESE_OPTION);
        return new ChinesePage();
    }

    public ContactUsPage openContactUsTab() {
        clickElementBypath(CONTACT_US_OPTION);
        return new ContactUsPage();
    }

    public BlogPage openBlogTab() {
        clickElementBypath(BLOG_OPTION);
        return new BlogPage();
    }

    public LoginPage openLoginTab() {
        clickElementBypath(LOGIN_OPTION);
        return new LoginPage();
    }

    public CartPage openCartTab() {
        clickElementBypath(CART_OPTION);
        return new CartPage();
    }

    public CurrencyPage openCurrencyTab(String xpath) {
        clickElementBypath(CURRENCY_OPTION);
        clickElementBypath(xpath);
        return new CurrencyPage();
    }
}
