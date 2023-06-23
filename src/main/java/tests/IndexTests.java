package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexTests extends BaseTest {

    @Test
    public void verifyElementsCategoryUrl() {
        getIndexPage().goToElementsCategory();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/elements"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyFormsCategoryUrl() {
        getIndexPage().goToFormsCategory();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/forms"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyAlertsFrameWindowsCategoryUrl() {
        getIndexPage().goToAlertsFrameWindowsCategory();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/alertsWindows"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyWidgetCategoryUrl() {
        getIndexPage().goToWidgetsCategory();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/widgets"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyInteractionsCategoryUrl() {
        getIndexPage().goToInteractionsCategory();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/interaction"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyBookStoreCategoryUrl() {
        getIndexPage().goToBookStoreCategory();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/books"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }
}
