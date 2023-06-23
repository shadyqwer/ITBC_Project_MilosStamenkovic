package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends ElementsPage {
    private WebElement yesButtonLabel;
    private WebElement yesButtonInput;
    private WebElement impressiveButtonLabel;
    private WebElement impressiveButtonInput;
    private WebElement noButtonLabel;
    private WebElement noButtonInput;
    private WebElement resultText;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getYesButtonLabel() {
        this.yesButtonLabel = getDriver().findElement(By.xpath("//label[@for='yesRadio']"));
        return this.yesButtonLabel;
    }

    public WebElement getYesButtonInput() {
        this.yesButtonInput = getDriver().findElement(By.id("yesRadio"));
        return this.yesButtonInput;
    }

    public WebElement getImpressiveButtonLabel() {
        this.impressiveButtonLabel = getDriver().findElement(By.xpath("//label[@for='impressiveRadio']"));
        return this.impressiveButtonLabel;
    }

    public WebElement getImpressiveButtonInput() {
        this.impressiveButtonInput = getDriver().findElement(By.id("impressiveRadio"));
        return this.impressiveButtonInput;
    }

    public WebElement getNoButtonLabel() {
        this.noButtonLabel = getDriver().findElement(By.xpath("//label[@for='noRadio']"));
        return this.noButtonLabel;
    }

    public WebElement getNoButtonInput() {
        this.noButtonInput = getDriver().findElement(By.id("noRadio"));
        return this.noButtonInput;
    }

    public WebElement getResultText() {
        this.resultText = getDriver().findElement(By.className("mt-3"));
        return this.resultText;
    }

    public RadioButtonPage clickYesButton() {
        getYesButtonLabel().click();
        return this;
    }

    public RadioButtonPage clickImpressiveButton() {
        getImpressiveButtonLabel().click();
        return this;
    }

    public RadioButtonPage clickNoButton() {
        getNoButtonLabel().click();
        return this;
    }

    public String getResultTextMessage() {
        return getResultText().getText();
    }
}
