package steps.EspoCrmSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.weborder.HomePage;

public class EspoCrm {

    WebDriver driver;

    @Given("the user navigates to login page")
    public void the_user_navigates_to_login_page() {

    }
    @Then("the user opens home page")
    public void the_user_opens_home_page() {

    }
    @Then("the user should see the function names")
    public void the_user_should_see_the_function_names(io.cucumber.datatable.DataTable dataTable) {
        HomePage homepage = new HomePage(driver);



    }

}
