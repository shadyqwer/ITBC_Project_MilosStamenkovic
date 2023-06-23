package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressBarPage extends ElementsPage {
    private WebElement startStopButton;
    private WebElement resetButton;
    private WebElement progressBar;

    public ProgressBarPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getStartStopButton() {
        this.startStopButton = getDriver().findElement(By.id("startStopButton"));
        return this.startStopButton;
    }

    public WebElement getResetButton() {
        this.resetButton = getDriver().findElement(By.id("resetButton"));
        return this.resetButton;
    }

    public WebElement getProgressBar() {
        this.progressBar = getDriver().findElement(By.id("progressBar"));
        return this.progressBar;
    }

    public ProgressBarPage startStopBar() {
        getStartStopButton().click();
        return this;
    }

    public ProgressBarPage resetBar() {
        getResetButton().click();
        return this;
    }

    public String getProgressBarValue() {
        return getProgressBar().getText();
    }
}
