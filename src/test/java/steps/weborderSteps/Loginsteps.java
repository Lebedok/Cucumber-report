package steps.weborderSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborder.LoginPage;
import utils.ConfigReader;
import utils.Driver;

public class Loginsteps {

    WebDriver driver;
    LoginPage loginPage;
    @Given("the user navigates to the WebOrder")
    public void the_user_navigates_to_the_web_order() {
        driver = Driver.getDriver();
        driver.navigate().to(ConfigReader.getProperty("webOrderUrl"));


    }
    @When("the user provides the credentials")
    public void the_user_provides_the_credentials() {
        loginPage = new LoginPage(driver);
        loginPage.login(ConfigReader.getProperty("webOrderUsername"),ConfigReader.getProperty("webOrderPassword"));
    }
    @Then("the user is on the Home page")
    public void the_user_is_on_the_home_page() {
        String expectedTitle = "ORDER DETAILS - Weborder";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Home Page validation After Login", expectedTitle,actualTitle);

    }
}
