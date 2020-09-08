package Pages;

import Utils.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.Random;

public class Start extends Base {

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='tfB0Bf']/descendant::input[1]")
    private WebElement searchButtonDropdown;

    @FindBy(xpath = "//*[@class='FPdoLc tfB0Bf']/descendant::input[1]")
    private WebElement searchButton;




    public String enterSomeRandomData() {
        String[] strArr = { "Awesome", "Your", "answear", "month"};
        Random rand = new Random();
        int res = rand.nextInt(strArr.length);
        searchField.sendKeys(strArr[res]);
        return strArr[res];
    }

    public void clickSearch() {
        if (searchButtonDropdown.isDisplayed()) {
            searchButtonDropdown.click();
        }
        searchButton.click();
    }

}