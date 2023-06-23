package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SliderTest extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getWidgetsPage().goToSliderPage();
    }

    @Test
    public void verifySliderMoves() {
        getSliderPage().moveSliderLeftBy(5);
        int valueBefore = getSliderPage().getSliderValue();
        getSliderPage().moveSliderRightBy(1);
        int valueAfter = getSliderPage().getSliderValue();
        Assert.assertNotEquals(valueBefore, valueAfter);
    }

    @Test
    public void verifySliderMinValue() {
        getSliderPage().moveSliderLeftBy(101);
        Assert.assertEquals(getSliderPage().getSliderValue(), 0);
    }

    @Test
    public void verifySliderMaxValue() {
        getSliderPage().moveSliderRightBy(101);
        Assert.assertEquals(getSliderPage().getSliderValue(), 100);
    }
}
