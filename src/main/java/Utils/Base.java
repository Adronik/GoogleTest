package Utils;

import org.openqa.selenium.support.PageFactory;

public class Base extends PageFactory {

    public Base() {
        initElements(WebDriver.driver, this);
    }

}