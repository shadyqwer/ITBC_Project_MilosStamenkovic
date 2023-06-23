package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage {
    private WebElement elementsCategory;
    private WebElement formsCategory;
    private WebElement alertsFrameWindowsCategory;
    private WebElement widgetsCategory;
    private WebElement interactionsCategory;
    private WebElement bookStoreCategory;
    private WebElement seleniumTrainingBanner;

    public IndexPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public IndexPage open() {
        getDriver().get("https://demoqa.com/");
        return this;
    }

    private WebElement getElementsCategory() {
        this.elementsCategory = getDriver().findElement(By.xpath("//div[contains(h5, 'Elements')]"));
        return this.elementsCategory;
    }

    public WebElement getFormsCategory() {
        this.formsCategory = getDriver().findElement(By.xpath("//div[contains(h5, 'Forms')]"));
        return this.formsCategory;
    }

    public WebElement getAlertsFrameWindowsCategory() {
        this.alertsFrameWindowsCategory = getDriver().findElement(By.xpath("//div[contains(h5, 'Frame')]"));
        return this.alertsFrameWindowsCategory;
    }

    public WebElement getWidgetsCategory() {
        this.widgetsCategory = getDriver().findElement(By.xpath("//div[contains(h5, 'Widgets')]"));
        return this.widgetsCategory;
    }

    public WebElement getInteractionsCategory() {
        this.interactionsCategory = getDriver().findElement(By.xpath("//div[contains(h5, 'Interactions')]"));
        return this.interactionsCategory;
    }

    public WebElement getBookStoreCategory() {
        this.bookStoreCategory = getDriver().findElement(By.xpath("//div[contains(h5, 'Book')]"));
        return this.bookStoreCategory;
    }

    public WebElement getSeleniumTrainingBanner() {
        this.seleniumTrainingBanner = getDriver().findElement(By.xpath("//a//img[contains(@class, 'banner-image')]"));
        return this.seleniumTrainingBanner;
    }

    public IndexPage goToElementsCategory() {
        this.open().getElementsCategory().click();
        return this;
    }

    public IndexPage goToFormsCategory() {
        this.open().getFormsCategory().click();
        return this;
    }

    public IndexPage goToAlertsFrameWindowsCategory() {
        this.open().getAlertsFrameWindowsCategory().click();
        return this;
    }

    public IndexPage goToWidgetsCategory() {
        this.open().getWidgetsCategory().click();
        return this;
    }

    public IndexPage goToInteractionsCategory() {
        this.open().getInteractionsCategory().click();
        return this;
    }

    public IndexPage goToBookStoreCategory() {
        this.open().getBookStoreCategory().click();
        return this;
    }

    public IndexPage goToSeleniumTraining() {
        this.open().getSeleniumTrainingBanner().click();
        return this;
    }
}
