package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaMainPage extends BasePage{
    @FindBy(xpath = "//button[@id='fat-menu']")
    private WebElement catalogButton;

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchBar;

    @FindBy(xpath = "//button[contains(text(), 'Знайти')]")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@class='header__button ng-star-inserted header__button--active']")
    private WebElement BasketButtonOnMainPage;


    public void clickOnCatalogBtn() {
        catalogButton.click();
    }

    public void clickOnSearchBar() {
        searchBar.click();
    }

    public void clearSearchBar(){
        searchBar.clear();
    }

    public void inputQueryToSearchBar(String text){
        searchBar.sendKeys(text);
    }

    public void pushSearchButton(){
searchButton.click();
    }








}
