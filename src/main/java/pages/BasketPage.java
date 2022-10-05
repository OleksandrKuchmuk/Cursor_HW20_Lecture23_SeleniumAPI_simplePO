package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {
    @FindBy(xpath = "//dt[@class='checkout-total__label' and contains(text(), 'товар')]")
    private WebElement countProductsInBasket;

    @FindBy(xpath = "//dd[@class='checkout-total__value checkout-total__value_size_large']")
    private WebElement totalPriseIfProductsInBasket;

    @FindBy(xpath = "//button[@class='button button--white button--small popup-menu__toggle popup-menu__toggle--confirm']")
    private WebElement removeAllFromBasket;

    @FindBy(xpath = "//button[@class='button button--medium button--gray ng-star-inserted']")
    private WebElement confirmRemovingAllFromBasket;

    public String getCountProductsInBasket() {
        return countProductsInBasket.getText();
    }

    public String getTotalPriceOfProductsInBasket() {
        return totalPriseIfProductsInBasket.getText();
    }

    public void removeAllProductsFromBasket() {
        removeAllFromBasket.click();
    }

    public void setConfirmRemovingAllFromBasket() {
        countProductsInBasket.click();
    }
}
