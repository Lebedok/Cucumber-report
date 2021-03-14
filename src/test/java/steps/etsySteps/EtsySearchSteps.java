package steps.etsySteps;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.etsyHomePage.EtsyPage;
import utils.BrowserUtils;
import utils.Driver;

import java.io.IOException;

public class EtsySearchSteps {

    WebDriver driver;
    EtsyPage etsyPage;

    @Before
    public void beforeScenario(){
        // it will run before each scenario
        System.out.println("Before Annotaion.");
    }


    @Before("@tc2")
    public void conditionalAnnotation(){
        System.out.println("Conditional annotations");
    }
    @After
    public void afterScenario(Scenario scenario) throws IOException {
        System.out.println("After Annotation");

        if (scenario.isFailed()){
            BrowserUtils.takeScreenShot();

        }
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("Before each step");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("After each step");
    }


    @Given("the user navigates to {string}")
    public void the_user_navigates_to(String url) {
        driver = Driver.getDriver();
        driver.get(url);

    }
    @When("the user search with {string}")
    public void the_user_search_with(String searcValue) {
        etsyPage = new EtsyPage(driver);
        etsyPage.sendSearchKey(searcValue);

    }
    @Then("the user should see the title {string}")
    public void the_user_should_see_the_title(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Validation of title",expectedTitle,actualTitle);


    }
}
