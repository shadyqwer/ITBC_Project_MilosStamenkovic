package tests;

import data.TestDataProviders;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().goToTextBoxPage();
    }

    @Test(dataProvider = "invalidEmails", dataProviderClass = TestDataProviders.class)
    public void verifyEmailFieldDoesNotAcceptsInvalidEmail(String email) {
        getTextBoxPage().enterTextToEmailField(email);
        getTextBoxPage().clickSubmitButton();
        Assert.assertTrue(getTextBoxPage().getEmailField().getAttribute("class").contains("field-error"));
    }

    @Test
    public void verifyFieldsOutputSameInputs() {
        String expectedName = getFaker().name().fullName();
        String expectedEmail = getFaker().internet().emailAddress();
        String expectedCurrentAddress = getFaker().address().fullAddress();
        String expectedPermanentAddress = getFaker().address().fullAddress();

        getTextBoxPage().enterTextToFullNameField(expectedName);
        getTextBoxPage().enterTextToEmailField(expectedEmail);
        getTextBoxPage().enterTextToCurrentAddressField(expectedCurrentAddress);
        getTextBoxPage().enterTextToPermanentAddressField(expectedPermanentAddress);

        getTextBoxPage().clickSubmitButton();

        getSoftAssert().assertTrue(getTextBoxPage().getSubmittedFullNameField().getText().
                contains(expectedName), "ERROR: Name field prints wrong output.");
        getSoftAssert().assertTrue(getTextBoxPage().getSubmittedEmailField().getText().
                contains(expectedEmail), "ERROR: Email field prints wrong output.");
        getSoftAssert().assertTrue(getTextBoxPage().getSubmittedCurrentAddressField().getText().
                contains(expectedCurrentAddress), "ERROR: Current address field prints wrong output.");
        getSoftAssert().assertTrue(getTextBoxPage().getSubmittedPermanentAddressField().getText().
                contains(expectedPermanentAddress), "ERROR: Permanent address field prints wrong output.");

        getSoftAssert().assertAll();
    }
}
