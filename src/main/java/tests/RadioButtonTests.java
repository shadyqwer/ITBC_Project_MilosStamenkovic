package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().goToRadioButtonPage();
    }

    @Test
    public void verifyYesRadioButton() {
        getRadioButtonPage().clickYesButton();
        Assert.assertTrue(getRadioButtonPage().getYesButtonInput().isSelected());
    }

    @Test
    public void verifyImpressiveRadioButton() {
        getRadioButtonPage().clickImpressiveButton();
        Assert.assertTrue(getRadioButtonPage().getImpressiveButtonInput().isSelected());
    }

    @Test
    public void verifyNoRadioButton() {
        getRadioButtonPage().clickNoButton();
        Assert.assertFalse(getRadioButtonPage().getNoButtonInput().isSelected());
    }
}
