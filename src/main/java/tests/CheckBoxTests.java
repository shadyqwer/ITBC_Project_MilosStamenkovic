package tests;

import data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

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

    @Test(dataProvider = "allCheckBoxes", dataProviderClass = TestDataProviders.class)
    public void verifyAllCheckBoxes(ArrayList<String> checkBoxes) {
        getCheckBoxPage().expandAll();

        for (String box : checkBoxes) {
            getCheckBoxPage().checkBox(box);
            getSoftAssert().assertTrue(getCheckBoxPage().getCheckBoxInput(box).isSelected());

            getCheckBoxPage().checkBox(box);
            getSoftAssert().assertFalse(getCheckBoxPage().getCheckBoxInput(box).isSelected());
        }
        getSoftAssert().assertAll();
    }
}
