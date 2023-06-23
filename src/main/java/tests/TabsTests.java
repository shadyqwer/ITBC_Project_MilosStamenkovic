package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TabsTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getWidgetsPage().goToTabsPage();
    }

    @Test
    public void verifyWhatTab() {
        getTabsPage().clickWhatTab();
        Assert.assertTrue(getTabsPage().getWhatTabText().isDisplayed());
    }

    @Test
    public void verifyOriginTab() {
        getTabsPage().clickOriginTab();
        Assert.assertTrue(getTabsPage().getOriginTabText().isDisplayed());
    }

    @Test
    public void verifyUseTab() {
        getTabsPage().clickUseTab();
        Assert.assertTrue(getTabsPage().getUseTabText().isDisplayed());
    }

    @Test
    public void verifyMoreTabInvisible() {
        Assert.assertEquals(getTabsPage().getMoreTabButton().getAttribute("aria-disabled"), "true");
    }
}
