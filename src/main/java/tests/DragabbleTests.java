package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragabbleTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getInteractionsPage().goToDragabble();
    }

    @Test
    public void verifySimpleDragMeBox() {
        getDragabblePage().goToSimpleTab();
        int xLocationBefore = getDragabblePage().getSimpleDragMeBox().getLocation().getX();
        int yLocationBefore = getDragabblePage().getSimpleDragMeBox().getLocation().getY();
        moveElementByOffset(getDragabblePage().getSimpleDragMeBox(), 10, 10);
        int xLocationAfter = getDragabblePage().getSimpleDragMeBox().getLocation().getX();
        int yLocationAfter = getDragabblePage().getSimpleDragMeBox().getLocation().getY();
        Assert.assertTrue(xLocationBefore != xLocationAfter && yLocationBefore != yLocationAfter);
    }

    @Test
    public void verifyAxisRestrictedXisRestricted() {
        getDragabblePage().goToAxisRestrictedTab();
        int yLocationBefore = getDragabblePage().getOnlyXDragBox().getLocation().getY();
        moveElementByOffset(getDragabblePage().getOnlyXDragBox(), 10, 10);
        int yLocationAfter = getDragabblePage().getOnlyXDragBox().getLocation().getY();
        Assert.assertEquals(yLocationBefore, yLocationAfter);
    }

    @Test
    public void verifyAxisRestrictedYisRestricted() {
        getDragabblePage().goToAxisRestrictedTab();
        int xLocationBefore = getDragabblePage().getOnlyYDragBox().getLocation().getX();
        moveElementByOffset(getDragabblePage().getOnlyYDragBox(), 10, 10);
        int xLocationAfter = getDragabblePage().getOnlyYDragBox().getLocation().getX();
        Assert.assertEquals(xLocationBefore, xLocationAfter);
    }

}
