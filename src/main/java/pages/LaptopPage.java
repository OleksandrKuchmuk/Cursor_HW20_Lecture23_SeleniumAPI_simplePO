package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LaptopPage extends BasePage{
    @FindBy(xpath = "//select")
    private WebElement sortingDropDownMenu;

    @FindBy(xpath = "//select")
    private WebElement selectFromHighToLowPriceInSortingDropDownMenu;

    @FindBy(xpath = "//input[@class='sidebar-search__input ng-pristine ng-valid ng-touched']")
    private WebElement inputBrandInSideBarSearch;

    @FindBy(xpath = "//a[@class='checkbox-filter__link' and @ data-id='HP']")
    private WebElement checkBoxHP;

    @FindBy(xpath = "//a[@title='Ноутбук HP ZBook Studio G8 Turbo Silver (30N09AV_ITM1)']")
    private WebElement firstLaptopOnPageHp;

    public void clickOnSortingDropDownMenu(){
        sortingDropDownMenu.click();
    }

    public void selectFromHighToLowPriceInSortingDropDownMenu(){
        selectFromHighToLowPriceInSortingDropDownMenu.click();
    }

    public void clickOnInputSearchBrandInSideBar(){
        inputBrandInSideBarSearch.click();
    }

    public void inputChoiceInInputSearchBrandInSideBar(String key){
        inputBrandInSideBarSearch.sendKeys(key);
    }

    public void chooseCheckBoxHP(){
        checkBoxHP.click();
    }

    public void chooseFirstProduct(){
        firstLaptopOnPageHp.click();
    }
}