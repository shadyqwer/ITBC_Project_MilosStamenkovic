package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ToolTipsTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getWidgetsPage().goToToolTipsPage();
    }

    @Test
    public void verifyHoverOverButton() {
        getActions().moveToElement(getToolTipsPage().getHoverButton()).perform();
        getToolTipsPage().waitForHoverText(getToolTipsPage().getHoverButton());
        Assert.assertEquals(getToolTipsPage().getHoverButton().getAttribute("aria-describedby"),
                "buttonToolTip");
    }

    @Test
    public void verifyHoverOverTextArea() {
        getActions().moveToElement(getToolTipsPage().getHoverTextArea()).perform();
        getToolTipsPage().waitForHoverText(getToolTipsPage().getHoverTextArea());
        Assert.assertEquals(getToolTipsPage().getHoverTextArea().getAttribute("aria-describedby"),
                "textFieldToolTip");
    }

    @Test
    public void verifyHoverOverFirstText() {
        getActions().moveToElement(getToolTipsPage().getHoverFirstWord()).perform();
        getToolTipsPage().waitForHoverText(getToolTipsPage().getHoverFirstWord());
        Assert.assertEquals(getToolTipsPage().getHoverFirstWord().getAttribute("aria-describedby"),
                "contraryTexToolTip");
    }

    @Test
    public void verifyHoverOverSecondText() {
        getActions().moveToElement(getToolTipsPage().getHoverSecondWord()).perform();
        getToolTipsPage().waitForHoverText(getToolTipsPage().getHoverSecondWord());
        Assert.assertEquals(getToolTipsPage().getHoverSecondWord().getAttribute("aria-describedby"),
                "sectionToolTip");
    }
}
