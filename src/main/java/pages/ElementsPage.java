package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsPage extends IndexPage {
    private WebElement textBoxPage;
    private WebElement checkBoxPage;
    private WebElement radioButtonPage;
    private WebElement webTablesPage;
    private WebElement buttonsPage;
    private WebElement linksPage;
    private WebElement brokenLinksImagesPage;
    private WebElement uploadAndDownloadPage;
    private WebElement dynamicPropertiesPage;

    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getTextBoxPage() {
        this.textBoxPage = getDriver().findElement(By.cssSelector("div.show li#item-0"));
        return this.textBoxPage;
    }

    public WebElement getCheckBoxPage() {
        this.checkBoxPage = getDriver().findElement(By.cssSelector("div.show li#item-1"));
        return this.checkBoxPage;
    }

    public WebElement getRadioButtonPage() {
        this.radioButtonPage = getDriver().findElement(By.cssSelector("div.show li#item-2"));
        return this.radioButtonPage;
    }

    public WebElement getWebTablesPage() {
        this.webTablesPage = getDriver().findElement(By.cssSelector("div.show li#item-3"));
        return this.webTablesPage;
    }

    public WebElement getButtonsPage() {
        this.buttonsPage = getDriver().findElement(By.cssSelector("div.show li#item-4"));
        return this.buttonsPage;
    }

    public WebElement getLinksPage() {
        this.linksPage = getDriver().findElement(By.cssSelector("div.show li#item-5"));
        return this.linksPage;
    }

    public WebElement getBrokenLinksImagesPage() {
        this.brokenLinksImagesPage = getDriver().findElement(By.cssSelector("div.show li#item-6"));
        return this.brokenLinksImagesPage;
    }

    public WebElement getUploadAndDownloadPage() {
        this.uploadAndDownloadPage = getDriver().findElement(By.cssSelector("div.show li#item-7"));
        return this.uploadAndDownloadPage;
    }

    public WebElement getDynamicPropertiesPage() {
        this.dynamicPropertiesPage = getDriver().findElement(By.cssSelector("div.show li#item-8"));
        return this.dynamicPropertiesPage;
    }

    public ElementsPage goToTextBoxPage() {
        super.open().goToElementsCategory();
        getTextBoxPage().click();
        return this;
    }

    public ElementsPage goToCheckBoxPage() {
        super.open().goToElementsCategory();
        getCheckBoxPage().click();
        return this;
    }

    public ElementsPage goToRadioButtonPage() {
        super.open().goToElementsCategory();
        getRadioButtonPage().click();
        return this;
    }

    public ElementsPage goToWebTablesPage() {
        super.open().goToElementsCategory();
        getWebTablesPage().click();
        return this;
    }

    public ElementsPage goToButtonsPage() {
        super.open().goToElementsCategory();
        getButtonsPage().click();
        return this;
    }

    public ElementsPage goToLinksPage() {
        super.open().goToElementsCategory();
        getLinksPage().click();
        return this;
    }

    public ElementsPage goToBrokenLinksAndImagesPage() {
        super.open().goToElementsCategory();
        getBrokenLinksImagesPage().click();
        return this;
    }

    public ElementsPage goToUploadAndDownloadPage() {
        super.open().goToElementsCategory();
        getUploadAndDownloadPage().click();
        return this;
    }

    public ElementsPage goToDynamicPropertiesPage() {
        super.open().goToElementsCategory();
        getDynamicPropertiesPage().click();
        return this;
    }

}
