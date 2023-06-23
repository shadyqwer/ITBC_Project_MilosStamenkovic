package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ModalDialogsTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getAlertsFrameWindowsPage().goToModalDialogs();
    }

    @Test
    public void verifySmallModalDialogSize() {
        getModalDialogsPage().openSmallModal();
        Assert.assertEquals(getModalDialogsPage().getModalDialogSize(), 300);
    }

    @Test
    public void verifyLargeModalDialogSize() {
        getModalDialogsPage().openLargeModal();
        Assert.assertEquals(getModalDialogsPage().getModalDialogSize(), 800);
    }
}
