package Pages;

import Constants.Constants;

import static Constants.Constants.QUANTITY_PURCHASE_BOOK_FIELD;

public class BooksByLanguagePurchaseBookPage extends BasePage {

    public static final String BUTTON_ADD_TO_CART = "//*[@id='AddToCart-product-template']";


    public boolean isPageTitleVisible() {
        return elementExists(Constants.PURCHASE_BOOK_IMG);
    }

    public void addToCartPurchaseBooks(String testing_data) {
        clearElementFieldByXpath(QUANTITY_PURCHASE_BOOK_FIELD);
        sendTextToElementByXpath(QUANTITY_PURCHASE_BOOK_FIELD,testing_data);
        clickElementBypath(BUTTON_ADD_TO_CART);
    }

}