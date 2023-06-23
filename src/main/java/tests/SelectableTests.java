package tests;

import data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectableTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getInteractionsPage().goToSelectable();
    }

    @Test(dataProvider = "selectableList", dataProviderClass = TestDataProviders.class)
    public void verifyListItemsCanBeSelectable(String listButton) {
        getSelectablePage().goToListTab();
        getSelectablePage().clickButton(listButton);
        Assert.assertTrue(getSelectablePage().getClickableButton(listButton).getAttribute("class").contains("active"));
    }

    @Test(dataProvider = "selectableGrid", dataProviderClass = TestDataProviders.class)
    public void verifyGridItemsCanBeSelectable(String gridButton) {
        getSelectablePage().goToGridTab();
        getSelectablePage().clickButton(gridButton);
        Assert.assertTrue(getSelectablePage().getClickableButton(gridButton).getAttribute("class").contains("active"));
    }
}
