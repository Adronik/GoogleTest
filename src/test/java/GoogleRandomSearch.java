import Pages.Start;
import Utils.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleRandomSearch {

    @Test
    public void googleSearchTest() {
        Start startPage = Navigation.openStartPage();
        String word = startPage.enterSomeRandomData();
        startPage.clickSearch();
        String pageTitle = Navigation.getPageTitle();
        Assert.assertEquals(word, pageTitle);
        System.out.println(pageTitle);
    }

}