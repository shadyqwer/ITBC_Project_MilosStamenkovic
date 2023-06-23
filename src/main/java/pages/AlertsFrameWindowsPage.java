package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsFrameWindowsPage extends IndexPage {
    private WebElement browserWindowsPage;
    private WebElement alertsPage;
    private WebElement framesPage;
    private WebElement nestedFramesPage;
    private WebElement modalDialogsPage;

    public AlertsFrameWindowsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getBrowserWindowsPage() {
        this.browserWindowsPage = getDriver().findElement(By.cssSelector("div.show li#item-0"));
        return this.browserWindowsPage;
    }

    public WebElement getAlertsPage() {
        this.alertsPage = getDriver().findElement(By.cssSelector("div.show li#item-1"));
        return this.alertsPage;
    }

    public WebElement getFramesPage() {
        this.framesPage = getDriver().findElement(By.cssSelector("div.show li#item-2"));
        return this.framesPage;
    }

    public WebElement getNestedFramesPage() {
        this.nestedFramesPage = getDriver().findElement(By.cssSelector("div.show li#item-3"));
        return this.nestedFramesPage;
    }

    public WebElement getModalDialogsPage() {
        this.modalDialogsPage = getDriver().findElement(By.cssSelector("div.show li#item-4"));
        return this.modalDialogsPage;
    }

    public AlertsFrameWindowsPage goToBrowserWindowsPage() {
        super.open().goToAlertsFrameWindowsCategory();
        getBrowserWindowsPage().click();
        return this;
    }

    public AlertsFrameWindowsPage goToAlertsPage() {
        super.open().goToAlertsFrameWindowsCategory();
        getAlertsPage().click();
        return this;
    }

    public AlertsFrameWindowsPage goToFramesPage() {
        super.open().goToAlertsFrameWindowsCategory();
        getFramesPage().click();
        return this;
    }

    public AlertsFrameWindowsPage goToNestedFrames() {
        super.open().goToAlertsFrameWindowsCategory();
        getNestedFramesPage().click();
        return this;
    }

    public AlertsFrameWindowsPage goToModalDialogs() {
        super.open().goToAlertsFrameWindowsCategory();
        getModalDialogsPage().click();
        return this;
    }
}
