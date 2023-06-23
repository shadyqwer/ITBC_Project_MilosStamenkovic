package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WidgetsTests extends BaseTest {

    @Test
    public void checkAccordianPageUrl() {
        getWidgetsPage().goToAccordianPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/accordian"));
    }

    @Test
    public void checkAutoCompletePageUrl() {
        getWidgetsPage().goToAutoCompletePage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/auto-complete"));
    }

    @Test
    public void checkDataPickerPageUrl() {
        getWidgetsPage().goToDatePickerPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/date-picker"));
    }

    @Test
    public void checkSliderPageUrl() {
        getWidgetsPage().goToSliderPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/slider"));
    }

    @Test
    public void checkProgressBarPageUrl() {
        getWidgetsPage().goToProgressBarPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/progress-bar"));
    }

    @Test
    public void checkTabsPageUrl() {
        getWidgetsPage().goToTabsPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/tabs"));
    }

    @Test
    public void checkToolTipsPageUrl() {
        getWidgetsPage().goToToolTipsPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/tool-tips"));
    }

    @Test
    public void checkMenuPageUrl() {
        getWidgetsPage().goToMenuPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/menu"));
    }

    @Test
    public void checkSelectMenuPageUrl() {
        getWidgetsPage().goToSelectMenuPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/select-menu"));
    }
}
