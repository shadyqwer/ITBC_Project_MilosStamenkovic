package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBoxPage extends ElementsPage {
    private WebElement expandAllButton;
    private WebElement collapseAllButton;
    private WebElement resultMessage;
    private WebElement checkBoxLabel;
    private WebElement checkBoxInput;

    public CheckBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getExpandAllButton() {
        this.expandAllButton = getDriver().findElement(By.cssSelector("button[title='Expand all']"));
        return this.expandAllButton;
    }

    public CheckBoxPage expandAll() {
        getExpandAllButton().click();
        return this;
    }

    public WebElement getCheckBoxLabel(String text) {
        this.checkBoxLabel = getDriver().findElement(By.xpath("//label[contains(., '" + text + "')]"));
        return this.checkBoxLabel;
    }

    public CheckBoxPage checkBox(String text) {
        getCheckBoxLabel(text).click();
        return this;
    }

    public WebElement getCheckBoxInput(String text) {
        this.checkBoxInput = getDriver().findElement(By.xpath("//label[contains(., '" + text + "')]//input"));
        return this.checkBoxInput;
    }

    public WebElement getCollapseAllButton() {
        this.collapseAllButton = getDriver().findElement(By.cssSelector("button[title='Collapse all']"));
        return this.collapseAllButton;
    }

    public CheckBoxPage collapseAll() {
        getCollapseAllButton().click();
        return this;
    }

    public WebElement getResultMessage() {
        this.resultMessage = getDriver().findElement(By.id("result"));
        return this.resultMessage;
    }

    public String resultText() {
        return getResultMessage().getText();
    }
}
