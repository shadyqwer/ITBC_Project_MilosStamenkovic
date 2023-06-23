package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabsPage extends WidgetsPage {
    private WebElement whatTabButton;
    private WebElement originTabButton;
    private WebElement useTabButton;
    private WebElement moreTabButton;
    private WebElement whatTabText;
    private WebElement originTabText;
    private WebElement useTabText;
    private WebElement moreTabText;

    public TabsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getWhatTabButton() {
        this.whatTabButton = getDriver().findElement(By.id("demo-tab-what"));
        return this.whatTabButton;
    }

    public WebElement getOriginTabButton() {
        this.originTabButton = getDriver().findElement(By.id("demo-tab-origin"));
        return this.originTabButton;
    }

    public WebElement getUseTabButton() {
        this.useTabButton = getDriver().findElement(By.id("demo-tab-use"));
        return this.useTabButton;
    }

    public WebElement getMoreTabButton() {
        this.moreTabButton = getDriver().findElement(By.id("demo-tab-more"));
        return this.moreTabButton;
    }

    public WebElement getWhatTabText() {
        this.whatTabText = getDriver().findElement(By.id("demo-tabpane-what"));
        return this.whatTabText;
    }

    public WebElement getOriginTabText() {
        this.originTabText = getDriver().findElement(By.id("demo-tabpane-origin"));
        return this.originTabText;
    }

    public WebElement getUseTabText() {
        this.useTabText = getDriver().findElement(By.id("demo-tabpane-use"));
        return this.useTabText;
    }

    public WebElement getMoreTabText() {
        this.moreTabText = getDriver().findElement(By.id("demo-tabpane-more"));
        return this.moreTabText;
    }

    public TabsPage clickWhatTab() {
        getWhatTabButton().click();
        return this;
    }

    public TabsPage clickOriginTab() {
        getOriginTabButton().click();
        return this;
    }

    public TabsPage clickUseTab() {
        getUseTabButton().click();
        return this;
    }
}
