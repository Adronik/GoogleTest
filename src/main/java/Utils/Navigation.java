package Utils;

import Pages.Start;

public class Navigation {

    public static Start openStartPage() {
        WebDriver.driver.get("https://www.google.com");
        return new Start();
    }

}
