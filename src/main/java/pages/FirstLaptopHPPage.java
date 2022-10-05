package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstLaptopHPPage extends BasePage{
    @FindBy(xpath = "//span[@class='buy-button__label ng-star-inserted']")
    private WebElement buyButton;

    @FindBy(xpath = "//a[@data-testid=\"cart-receipt-submit-order\"]")
    private WebElement toOrderButtonOnAlertWindow;

    @FindBy(xpath = "//p[@class=\"product-prices__big product-prices__big_color_red\"]")
    private WebElement priceOfProductOnpProductPage;


    public void clickOnBuyButton(){
        buyButton.click();
    }

    public void clickOnToOrderButtonInAlertWindow(){
        toOrderButtonOnAlertWindow.click();
    }

    public String getPriceOfProductOnpProductPage(){
        return priceOfProductOnpProductPage.getText();
    }

}
