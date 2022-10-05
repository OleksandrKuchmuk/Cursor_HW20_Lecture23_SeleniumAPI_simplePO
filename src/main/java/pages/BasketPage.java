package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage {
    @FindBy(xpath = "//dt[@class='checkout-total__label' and contains(text(), 'товар')]")
    private WebElement countProductsInBasket;

    @FindBy(xpath = "//dd[@class='checkout-total__value checkout-total__value_size_large']")
    private WebElement totalPriseIfProductsInBasket;

    public String getCountProductsInBasket() {
        return countProductsInBasket.getText();
    }

    public String getTotalPriceOfProductsInBasket() {
        return totalPriseIfProductsInBasket.getText();
    }
}
