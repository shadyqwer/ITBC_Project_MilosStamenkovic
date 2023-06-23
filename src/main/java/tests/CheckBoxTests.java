package tests;

import data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().goToCheckBoxPage();
    }

    @Test(dataProvider = "checkBoxes", dataProviderClass = TestDataProviders.class)
    public void verifyEachCheckBox(String text) {
        getCheckBoxPage().expandAll();
        getCheckBoxPage().checkBox(text);
        Assert.assertTrue(getCheckBoxPage().getCheckBoxInput(text).isSelected());
    }
}
