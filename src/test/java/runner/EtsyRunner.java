package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-html-report.html",
                "json:target/cucumber.json",
                "junit:target/cucumber.xml",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/etsy/EtsySearchOutline.feature",
        glue = {"steps/etsySteps", "steps/Hooks"},
        dryRun = false,
        tags = "@outline"
)
public class EtsyRunner {


}
