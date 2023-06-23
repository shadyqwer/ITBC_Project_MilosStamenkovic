package tests;

import data.TestDataProviders;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectMenuTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getWidgetsPage().goToSelectMenuPage();
    }

    @Test(dataProvider = "selectValueMenu", dataProviderClass = TestDataProviders.class)
    public void verifySelectValue(String value) {
        getSelectMenuPage().openSelectValue();
        getSelectMenuPage().enterSelectValueField(value);
        Assert.assertTrue(getSelectMenuPage().getSelectValueMenu().getText().contains(value));
    }

    @Test(dataProvider = "selectOneMenu", dataProviderClass = TestDataProviders.class)
    public void verifySelectOneMenu(String value) {
        getSelectMenuPage().openSelectOneMenu();
        getSelectMenuPage().enterSelectOneMenuField(value);
        Assert.assertTrue(getSelectMenuPage().getSelectOneMenu().getText().contains(value));
    }

    @Test(dataProvider = "multiSelectMenu", dataProviderClass = TestDataProviders.class)
    public void verifyMultiSelectMenu(String value) {
        getSelectMenuPage().openMultiSelect();
        getSelectMenuPage().enterMultiSelect(value);
        getActions().moveToElement(getSelectMenuPage().getMultiselectDropMenuInputField()).sendKeys(Keys.RETURN).perform();
        Assert.assertTrue(getSelectMenuPage().getMultiselectDropMenu().getText().contains(value + ", selected"));
    }

    @Test(dataProvider = "oldStyleMenu", dataProviderClass = TestDataProviders.class)
    public void verifyOldStyleSelectMenu(int index, String expectedValue) {
        getSelectMenuPage().oldStyleSelectByIndex(index);
        Assert.assertEquals(getSelectMenuPage().oldStyleMenuValue(), expectedValue);
    }

    @Test(dataProvider = "standardMultiSelectMenu", dataProviderClass = TestDataProviders.class)
    public void verifyStandardMultiSelect(int index, String expectedValue) {
        getSelectMenuPage().standardSelectByIndex(index);
        Assert.assertEquals(getSelectMenuPage().standardMenuValue(), expectedValue);
    }
}
