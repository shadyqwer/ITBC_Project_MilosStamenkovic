package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ElementsTests extends IndexTests {

    @Test
    public void verifyTextBoxPageUrl() {
        getElementsPage().goToTextBoxPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/text-box"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyCheckBoxPageUrl() {
        getElementsPage().goToCheckBoxPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/checkbox"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyRadioButtonPageUrl() {
        getElementsPage().goToRadioButtonPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/radio-button"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyWebTablesPageUrl() {
        getElementsPage().goToWebTablesPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/webtables"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyButtonsPageUrl() {
        getElementsPage().goToButtonsPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/buttons"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyLinksPageUrl() {
        getElementsPage().goToLinksPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/links"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyBrokenLinksAndImagesUrl() {
        getElementsPage().goToBrokenLinksAndImagesPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/broken"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyUploadAndDownloadUrl() {
        getElementsPage().goToUploadAndDownloadPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/upload-download"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }

    @Test
    public void verifyDynamicPropertiesPageUrl() {
        getElementsPage().goToDynamicPropertiesPage();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("/dynamic-properties"), "ERROR: Wrong page opens " +
                getDriver().getCurrentUrl());
    }
}
