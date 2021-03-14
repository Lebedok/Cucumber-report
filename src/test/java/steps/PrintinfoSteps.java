package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PrintinfoSteps {

    @Given("the user prints firstname")
    public void the_user_prints_firstname() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Nargiza");
    }
    @When("the user prints lastname")
    public void the_user_prints_lastname() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Konushalieva");
    }
    @Then("the user should see the fullname")
    public void the_user_should_see_the_fullname() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Nargiza Konushalieva");
    }
    @Then("the user prints city")
    public void the_user_prints_city() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("New York");
    }

    @Given("the user prints the city")
    public void the_user_prints_the_city() {
        System.out.println("Chicago");
    }

    @Then("the user prints state")
    public void the_user_prints_state() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Illinois");
    }
    @Then("the user prints age")
    public void the_user_prints_age() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("30");
    }
    @Then("the user should see the school name")
    public void the_user_should_see_the_school_name() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Techtorial");
    }



}
