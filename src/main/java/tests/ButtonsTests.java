package tests;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().goToButtonsPage();
    }

    @Test
    public void verifyDoubleClickMeButton() {
        getActions().doubleClick(getButtonsPage().getDoubleClickMeButton()).perform();
        Assert.assertTrue(getButtonsPage().getDoubleClickSuccessMessage().getText().contains("double click"));
    }

    @Test
    public void verifyRightClickMeButton() {
        getActions().contextClick(getButtonsPage().getRightClickMeButton()).perform();
        Assert.assertTrue(getButtonsPage().getRightClickSuccessMessage().getText().contains("right click"));
    }

    @Test
    public void verifyDynamicClickMeButton() {
        getButtonsPage().getDynamicClickMeButton().click();
        Assert.assertTrue(getButtonsPage().getDynamicClickSuccessMessage().getText().contains("dynamic click"));
    }
}
