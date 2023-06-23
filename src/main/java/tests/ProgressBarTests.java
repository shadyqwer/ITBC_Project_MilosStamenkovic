package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProgressBarTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getWidgetsPage().goToProgressBarPage();
    }

    @Test
    public void verifyProgressBarReachesFull() {
        getProgressBarPage().startStopBar();
        assertVisibilityOfElement(getProgressBarPage().getResetButton());
        Assert.assertEquals(getProgressBarPage().getProgressBarValue(), "100%");
    }

    @Test
    public void verifyProgressBarCanReset() {
        getProgressBarPage().startStopBar();
        assertVisibilityOfElement(getProgressBarPage().getResetButton());
        getProgressBarPage().resetBar();
        Assert.assertEquals(getProgressBarPage().getProgressBarValue(), "0%");
    }

    @Test
    public void verifyProgressBarCanBeStopped() {
        getProgressBarPage().startStopBar();
        getProgressBarPage().startStopBar();
        Assert.assertNotEquals(getProgressBarPage().getProgressBarValue(), "0%");
    }

}
