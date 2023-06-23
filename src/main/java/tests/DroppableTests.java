package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DroppableTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getInteractionsPage().goToDroppable();
    }

    @Test
    public void verifySimpleDragMeBox() {
        getDroppablePage().goToSimpleTab();
        moveElementTo(getDroppablePage().getDragMeButton(), getDroppablePage().getDropHereSimpleField());
        Assert.assertEquals(getDroppablePage().getDropHereSimpleField().getText(), "Dropped!");
    }

    @Test
    public void verifyAcceptTabAcceptableBox() {
        getDroppablePage().goToAcceptTab();
        moveElementTo(getDroppablePage().getAcceptableButton(), getDroppablePage().getDropHereAcceptField());
        Assert.assertEquals(getDroppablePage().getDropHereAcceptField().getText(), "Dropped!");
    }

    @Test
    public void verifyAcceptTabNotAcceptableBox() {
        getDroppablePage().goToAcceptTab();
        moveElementTo(getDroppablePage().getNotAcceptableButton(), getDroppablePage().getDropHereAcceptField());
        Assert.assertNotEquals(getDroppablePage().getDropHereAcceptField().getText(), "Dropped!");
    }

    @Test
    public void verifyPreventNotGreedyBox() {
        getDroppablePage().goToPreventTab();
        moveElementTo(getDroppablePage().getDragPreventButton(), getDroppablePage().getInnerNotGreedyField());
        Assert.assertEquals(getDroppablePage().getOuterNotGreedyField().getText(), "Dropped!\nDropped!");
    }

    @Test
    public void verifyPreventGreedyBox() {
        getDroppablePage().goToPreventTab();
        moveElementTo(getDroppablePage().getDragPreventButton(), getDroppablePage().getInnerGreedyField());
        Assert.assertNotEquals(getDroppablePage().getOuterGreedyField().getText(), "Dropped!\nDropped!");
    }

    @Test
    public void verifyWillRevertButton() {
        getDroppablePage().goToRevertTab();
        int xLocationBefore = getDroppablePage().getWillRevertButton().getLocation().getX();
        int yLocationBefore = getDroppablePage().getWillRevertButton().getLocation().getY();
        moveElementTo(getDroppablePage().getWillRevertButton(), getDroppablePage().getRevertDropHereField());
        getWait().until(ExpectedConditions.not(ExpectedConditions.attributeContains(getDroppablePage().getWillRevertButton(), "class", "ui-draggable-dragging")));
        int xLocationAfter = getDroppablePage().getWillRevertButton().getLocation().getX();
        int yLocationAfter = getDroppablePage().getWillRevertButton().getLocation().getY();
        Assert.assertTrue(xLocationBefore == xLocationAfter && yLocationBefore == yLocationAfter);
    }

    @Test
    public void verifyWillNotRevertButton() {
        getDroppablePage().goToRevertTab();
        int xLocationBefore = getDroppablePage().getNotRevertButton().getLocation().getX();
        int yLocationBefore = getDroppablePage().getNotRevertButton().getLocation().getY();
        moveElementTo(getDroppablePage().getNotRevertButton(), getDroppablePage().getRevertDropHereField());
        int xLocationAfter = getDroppablePage().getNotRevertButton().getLocation().getX();
        int yLocationAfter = getDroppablePage().getNotRevertButton().getLocation().getY();
        Assert.assertTrue(xLocationBefore != xLocationAfter || yLocationBefore != yLocationAfter);
    }
}
