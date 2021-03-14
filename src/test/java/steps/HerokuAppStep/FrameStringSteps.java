package steps.HerokuAppStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.herokuapp.FramePage;
import utils.Driver;

public class FrameStringSteps {

    WebDriver driver;
    FramePage framePage;


    @Given("the user open the herokuapp frames")
    public void the_user_open_the_herokuapp_frames() {

        driver = Driver.getDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");

    }
    @Then("the user send paragraph")
    public void the_user_send_paragraph(String docString) {

        framePage = new FramePage(driver);
        driver.switchTo().frame("mce_0_ifr");
        driver.switchTo().frame(docString);


    }
}
