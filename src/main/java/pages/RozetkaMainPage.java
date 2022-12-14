package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RozetkaMainPage extends BasePage {
    private static final Logger LOGGER = LogManager.getLogger(RozetkaMainPage.class);

    @FindBy(xpath = "//input")
    private WebElement searchBar;

    @FindBy(xpath = "//button[contains(text(), 'Знайти')]")
    private WebElement searchButton;

    public RozetkaMainPage clickOnSearchBar() {
        LOGGER.info("Click on SearchBar");
        searchBar.click();
        return this;
    }

    public RozetkaMainPage clearSearchBar() {
        LOGGER.info("Clear SearchBar");
        searchBar.clear();
        return this;
    }

    public RozetkaMainPage inputQueryToSearchBar(String text) {
        LOGGER.info("Send query '" + text + "' to searchBar");
        searchBar.sendKeys(text);
        return this;
    }

    public RozetkaMainPage pushSearchButton() {
        LOGGER.info("Click on search button and go to AllLaptopPage");
        searchButton.click();
        return this;
    }
}