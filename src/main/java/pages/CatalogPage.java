package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogPage extends BasePage{
    @FindBy(xpath = "//a[contains(text(), 'Ноутбуки та комп’ютери')]")
    private WebElement laptopsAndComputersButton;

    public void clickOnLaptopsAndComputersButton(){
        laptopsAndComputersButton.click();
    }
}