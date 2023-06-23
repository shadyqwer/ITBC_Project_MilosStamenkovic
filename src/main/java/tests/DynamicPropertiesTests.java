package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DynamicPropertiesTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().goToDynamicPropertiesPage();
    }

    @Test
    public void verifyEnableAfterButton() {
        assertElementIsClickable(getDynamicPropertiesPage().getEnableAfterButton());
        Assert.assertTrue(getDynamicPropertiesPage().getEnableAfterButton().isEnabled());
    }

    @Test
    public void verifyColorChangeButton() {
        String firstColor = getDynamicPropertiesPage().getColorChangeButton().getAttribute("class");
        assertElementIsClickable(getDynamicPropertiesPage().getEnableAfterButton());
        String secondColor = getDynamicPropertiesPage().getColorChangeButton().getAttribute("class");
        Assert.assertNotEquals(firstColor, secondColor);
    }

    @Test
    public void verifyTextIDChanges() {
        String firstID = getDynamicPropertiesPage().getTextWithRandomID().getAttribute("id");
        getDriver().navigate().refresh();
        String secondID = getDynamicPropertiesPage().getTextWithRandomID().getAttribute("id");
        Assert.assertNotEquals(firstID, secondID);
    }

    @Test
    public void verifyVisibleAfterButton() {
        assertVisibilityOfElement(getDynamicPropertiesPage().getVisibleAfterButton());
        Assert.assertTrue(getDynamicPropertiesPage().getVisibleAfterButton().isEnabled());
    }
}
