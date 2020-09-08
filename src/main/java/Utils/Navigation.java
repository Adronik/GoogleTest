package Utils;

import Pages.Start;

public class Navigation {

    public static Start openStartPage() {
        WebDriver.driver.get("https://www.google.com");
        return new Start();
    }

    public static String getPageTitle() {
        return WebDriver.driver.getTitle().split("-")[0].trim();
    }

}