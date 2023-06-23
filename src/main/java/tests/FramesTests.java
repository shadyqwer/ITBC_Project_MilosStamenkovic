package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getAlertsFrameWindowsPage().goToFramesPage();
    }

    @Test
    public void verifyFirstFrameParent() {
        Assert.assertTrue(getFramesPage().checkChildFrame(getFramesPage().getFirstFrame()));
    }

    @Test
    public void verifySecondFrameParent() {
        Assert.assertTrue(getFramesPage().checkChildFrame(getFramesPage().getSecondFrame()));
    }
}
