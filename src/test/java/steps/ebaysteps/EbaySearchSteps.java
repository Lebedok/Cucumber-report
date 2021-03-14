package steps.ebaysteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.ebaypage.EbayHomePage;
import pages.ebaypage.ebaySearchResultsPage;
import utils.ConfigReader;
import utils.Driver;

public class EbaySearchSteps {

    WebDriver driver;
    EbayHomePage ebayHomePage;
    ebaySearchResultsPage ebaySearchResultsPage;


    @Given("user is on ebay home page")
    public void user_is_on_ebay_home_page() throws InterruptedException {
        driver = Driver.getDriver();
        driver.get("https://ebay.com");

    }

    @When("the user searches for iMac 2020")
    public void the_user_searches_for_i_mac() {
        ebayHomePage = new EbayHomePage(driver);
        ebayHomePage.searchBox.sendKeys(ConfigReader.getProperty("searchValue"));
        ebayHomePage.searchButton.click();

    }
    @Then("user sees results about iMac only")
    public void user_sees_results_about_i_mac_only() {
        ebaySearchResultsPage = new ebaySearchResultsPage(driver);
        for (WebElement link: ebaySearchResultsPage.listOfLinks) {
            System.out.println(link.getText());

        }

    }
    @Then("there are more than 3 pages of results")
    public void there_are_more_than_pages_of_results() {
        ebaySearchResultsPage = new ebaySearchResultsPage(driver);
        int actualPageNumber = ebaySearchResultsPage.pages.size();
        Assert.assertTrue(actualPageNumber >3);

    }


}
