package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectablePage extends InteractionsPage {
    private WebElement listTabButton;
    private WebElement gridTabButton;
    private WebElement clickableButton;

    public SelectablePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getListTabButton() {
        this.listTabButton = getDriver().findElement(By.xpath("//a[text()='List']"));
        return this.listTabButton;
    }

    public WebElement getGridTabButton() {
        this.gridTabButton = getDriver().findElement(By.xpath("//a[text()='Grid']"));
        return this.gridTabButton;
    }

    public SelectablePage goToListTab() {
        getListTabButton().click();
        return this;
    }

    public SelectablePage goToGridTab() {
        getGridTabButton().click();
        return this;
    }

    public WebElement getClickableButton(String text) {
        clickableButton = getDriver().findElement(By.xpath("//li[contains(text(), '" + text + "')]"));
        return this.clickableButton;
    }

    public SelectablePage clickButton(String text) {
        getClickableButton(text).click();
        return this;
    }
}
