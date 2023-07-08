package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class LinksTests extends BaseTest {
    @BeforeMethod
    public void beforeEachTest() {
        getElementsPage().goToLinksPage();
    }

    @Test
    public void verifySimpleHomeLinkOpensNewTab() {
        getLinksPage().getHomeLinkButton().click();
        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        Assert.assertEquals(getBasePage().homeUrl(), getDriver().getCurrentUrl());
    }

    @Test
    public void verifyDynamicHomeLinkText() {
        String firstDynamicText = getLinksPage().getDynamicHomeLinkButton().getText();
        getDriver().navigate().refresh();
        String secondDynamicText = getLinksPage().getDynamicHomeLinkButton().getText();
        Assert.assertNotEquals(firstDynamicText, secondDynamicText);
    }

    @Test
    public void verifyCreatedApiCall() {
        getLinksPage().getCreatedLink().click();
        Assert.assertTrue(getLinksPage().responseFieldText().contains("201") &&
                getLinksPage().responseFieldText().contains("Created"));
    }

    @Test
    public void verifyNoContentApiCall() {
        getLinksPage().getNoContentLink().click();
        Assert.assertTrue(getLinksPage().responseFieldText().contains("204") &&
                getLinksPage().responseFieldText().contains("No Content"));
    }

    @Test
    public void verifyMovedApiCall() {
        getLinksPage().getMovedLink().click();
        Assert.assertTrue(getLinksPage().responseFieldText().contains("301") &&
                getLinksPage().responseFieldText().contains("Moved Permanently"));
    }

    @Test
    public void verifyBadRequestApiCall() {
        getLinksPage().getBadRequestLink().click();
        Assert.assertTrue(getLinksPage().responseFieldText().contains("400") &&
                getLinksPage().responseFieldText().contains("Bad Request"));
    }

    @Test
    public void verifyUnauthorizedApiCall() {
        getLinksPage().getUnauthorizedLink().click();
        Assert.assertTrue(getLinksPage().responseFieldText().contains("401") &&
                getLinksPage().responseFieldText().contains("Unauthorized"));
    }

    @Test
    public void verifyForbiddenApiCall() {
        getLinksPage().getForbiddenLink().click();
        Assert.assertTrue(getLinksPage().responseFieldText().contains("403") &&
                getLinksPage().responseFieldText().contains("Forbidden"));
    }

    @Test
    public void verifyNotFoundApiCall() {
        getLinksPage().getNotFoundLink().click();
        Assert.assertTrue(getLinksPage().responseFieldText().contains("404") &&
                getLinksPage().responseFieldText().contains("Not Found"));
    }
}
