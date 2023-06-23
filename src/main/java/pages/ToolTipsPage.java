package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolTipsPage extends WidgetsPage {
    private WebElement hoverButton;
    private WebElement hoverTextArea;
    private WebElement hoverFirstWord;
    private WebElement hoverSecondWord;

    public ToolTipsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHoverButton() {
        this.hoverButton = getDriver().findElement(By.id("toolTipButton"));
        return this.hoverButton;
    }

    public WebElement getHoverTextArea() {
        this.hoverTextArea = getDriver().findElement(By.id("toolTipTextField"));
        return this.hoverTextArea;
    }

    public WebElement getHoverFirstWord() {
        this.hoverFirstWord = getDriver().findElement(By.xpath("//a[contains(text(), 'Contrary')]"));
        return this.hoverFirstWord;
    }

    public WebElement getHoverSecondWord() {
        this.hoverSecondWord = getDriver().findElement(By.xpath("//a[contains(text(), '1.10.32')]"));
        return this.hoverSecondWord;
    }

    public ToolTipsPage waitForHoverText(WebElement element) {
        getWait().until(ExpectedConditions.attributeToBeNotEmpty(element, "aria-describedby"));
        return this;
    }
}
