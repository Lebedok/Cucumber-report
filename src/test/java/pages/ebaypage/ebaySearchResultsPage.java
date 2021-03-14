package pages.ebaypage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ebaySearchResultsPage {

    public ebaySearchResultsPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//h3[@class='s-item__title']")
    public List<WebElement>listOfLinks;

    @FindBy(xpath = "//ol[@class=pagination__item]//li")
    public List<WebElement> pages;


}
