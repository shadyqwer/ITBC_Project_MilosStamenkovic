package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccordianTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getWidgetsPage().goToAccordianPage();
        getAccordianPage().openFirstAccordian();
    }

    @Test
    public void checkFirstAccordian() {
        getAccordianPage().openFirstAccordian();
        Assert.assertTrue(getAccordianPage().getAccordianSectionOneContent().isDisplayed());
    }

    @Test
    public void checkSecondAccordian() {
        getAccordianPage().openSecondAccordian();
        Assert.assertTrue(getAccordianPage().getAccordianSectionTwoContent().isDisplayed());
    }

    @Test
    public void checkThirdAccordian() {
        getAccordianPage().openThirdAccordian();
        Assert.assertTrue(getAccordianPage().getAccordianSectionThreeContent().isDisplayed());
    }
}
