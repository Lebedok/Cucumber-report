package pages.EspoPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EspoHomePage {

    public EspoHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }


}
