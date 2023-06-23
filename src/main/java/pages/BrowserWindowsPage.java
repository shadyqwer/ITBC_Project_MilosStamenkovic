package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserWindowsPage extends AlertsFrameWindowsPage {
    private WebElement newTabButton;
    private WebElement newWindowButton;
    private WebElement newWindowMessageButton;

    public BrowserWindowsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNewTabButton() {
        this.newTabButton = getDriver().findElement(By.id("tabButton"));
        return this.newTabButton;
    }

    public WebElement getNewWindowButton() {
        this.newWindowButton = getDriver().findElement(By.id("windowButton"));
        return this.newWindowButton;
    }

    public WebElement getNewWindowMessageButton() {
        this.newWindowMessageButton = getDriver().findElement(By.id("messageWindowButton"));
        return this.newWindowMessageButton;
    }
}
