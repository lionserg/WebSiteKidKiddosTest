package Pages;


import Constants.Constants;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {
    public static final String HEADER = "//*[@id='shopify-section-cart-template']/div/div[1]/h1";


    public boolean isPageTitleVisible() {
        return elementExists(HEADER);
    }


    public Integer verifyQuantityBookAddToCart() {

        String value = findElementByXpath(Constants.QUANTITY_PURCHASE_BOOK_FIELD).getAttribute("value");
        int result = Integer.parseInt(value);
        return result;

    }

}
