package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersAndLaptopPage extends BasePage{
    @FindBy(xpath = "//a[@class='tile-cats__heading tile-cats__heading_type_center ng-star-inserted' and @title='Ноутбуки']")
    private WebElement laptopsCategory;

    public void clickOnLaptopsCategory(){
        laptopsCategory.click();
    }
}
