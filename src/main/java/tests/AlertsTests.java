package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getAlertsFrameWindowsPage().goToAlertsPage();
    }

    @AfterMethod
    public void afterEachTest() {
        getDriver().switchTo().alert().dismiss();
    }

    @Test
    public void verifyAlertButton() {
        getAlertsPage().clickAlertButton();
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "You clicked a button");
    }

    @Test
    public void verifyAlertAfterButton() {
        getAlertsPage().clickAlertAfterButton();
        getWait().until(ExpectedConditions.alertIsPresent());
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "This alert appeared after 5 seconds");
    }

    @Test
    public void verifyConfirmBox() {
        getAlertsPage().clickConfirmBoxButton();
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "Do you confirm action?");
    }

    @Test
    public void verifyPromptBox() {
        getAlertsPage().clickPromptBoxButton();
        Assert.assertEquals(getDriver().switchTo().alert().getText(), "Please enter your name");
    }

}
