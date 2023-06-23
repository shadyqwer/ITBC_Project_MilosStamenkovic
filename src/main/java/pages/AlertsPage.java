package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPage extends AlertsFrameWindowsPage {
    private WebElement alertButton;
    private WebElement alertAfterButton;
    private WebElement confirmBoxButton;
    private WebElement promptBoxButton;

    public AlertsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAlertButton() {
        this.alertButton = getDriver().findElement(By.id("alertButton"));
        return this.alertButton;
    }

    public WebElement getAlertAfterButton() {
        this.alertAfterButton = getDriver().findElement(By.id("timerAlertButton"));
        return this.alertAfterButton;
    }

    public WebElement getConfirmBoxButton() {
        this.confirmBoxButton = getDriver().findElement(By.id("confirmButton"));
        return this.confirmBoxButton;
    }

    public WebElement getPromptBoxButton() {
        this.promptBoxButton = getDriver().findElement(By.id("promtButton"));
        return this.promptBoxButton;
    }

    public AlertsPage clickAlertButton() {
        getAlertButton().click();
        return this;
    }

    public AlertsPage clickAlertAfterButton() {
        getAlertAfterButton().click();
        return this;
    }

    public AlertsPage clickConfirmBoxButton() {
        getConfirmBoxButton().click();
        return this;
    }

    public AlertsPage clickPromptBoxButton() {
        getPromptBoxButton().click();
        return this;
    }
}
