package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsFrameWindowsTests extends BaseTest {
    @Test
    public void verifyBrowserWindowsPageUrl() {
        getAlertsFrameWindowsPage().goToBrowserWindowsPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/browser-windows"));
    }

    @Test
    public void verifyAlertsPageUrl() {
        getAlertsFrameWindowsPage().goToAlertsPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/alerts"));
    }

    @Test
    public void verifyFramesPageUrl() {
        getAlertsFrameWindowsPage().goToFramesPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/frames"));
    }

    @Test
    public void verifyNestedFramesPageUrl() {
        getAlertsFrameWindowsPage().goToNestedFrames();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/nestedframes"));
    }

    @Test
    public void verifyModalDialogsPageUrl() {
        getAlertsFrameWindowsPage().goToModalDialogs();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/modal-dialogs"));
    }
}
