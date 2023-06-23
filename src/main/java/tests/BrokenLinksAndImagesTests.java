package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenLinksAndImagesTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().goToBrokenLinksAndImagesPage();
    }

    @Test
    public void verifyValidLink() {
        getBrokenLinksAndImagesPage().clickValidLink();
        Assert.assertTrue(getDriver().getCurrentUrl().contains(getBasePage().homeUrl()));
    }

    @Test
    public void verifyBrokenLink() {
        getBrokenLinksAndImagesPage().clickBrokenLink();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("500"));
    }
}
