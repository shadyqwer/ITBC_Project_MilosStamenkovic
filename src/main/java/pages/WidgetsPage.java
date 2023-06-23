package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WidgetsPage extends IndexPage {
    private WebElement accordianPage;
    private WebElement autoCompletePage;
    private WebElement datePickerPage;
    private WebElement sliderPage;
    private WebElement progressBarPage;
    private WebElement tabsPage;
    private WebElement toolTipsPage;
    private WebElement menuPage;
    private WebElement selectMenuPage;

    public WidgetsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAccordianPage() {
        this.accordianPage = getDriver().findElement(By.cssSelector("div.show li#item-0"));
        return this.accordianPage;
    }

    public WebElement getAutoCompletePage() {
        this.autoCompletePage = getDriver().findElement(By.cssSelector("div.show li#item-1"));
        return this.autoCompletePage;
    }

    public WebElement getDatePickerPage() {
        this.datePickerPage = getDriver().findElement(By.cssSelector("div.show li#item-2"));
        return this.datePickerPage;
    }

    public WebElement getSliderPage() {
        this.sliderPage = getDriver().findElement(By.cssSelector("div.show li#item-3"));
        return this.sliderPage;
    }

    public WebElement getProgressBarPage() {
        this.progressBarPage = getDriver().findElement(By.cssSelector("div.show li#item-4"));
        return this.progressBarPage;
    }

    public WebElement getTabsPage() {
        this.tabsPage = getDriver().findElement(By.cssSelector("div.show li#item-5"));
        return this.tabsPage;
    }

    public WebElement getToolTipsPage() {
        this.toolTipsPage = getDriver().findElement(By.cssSelector("div.show li#item-6"));
        return this.toolTipsPage;
    }

    public WebElement getMenuPage() {
        this.menuPage = getDriver().findElement(By.cssSelector("div.show li#item-7"));
        return this.menuPage;
    }

    public WebElement getSelectMenuPage() {
        this.selectMenuPage = getDriver().findElement(By.cssSelector("div.show li#item-8"));
        return this.selectMenuPage;
    }

    public WidgetsPage goToAccordianPage() {
        super.open().goToWidgetsCategory();
        getAccordianPage().click();
        return this;
    }

    public WidgetsPage goToAutoCompletePage() {
        super.open().goToWidgetsCategory();
        getAutoCompletePage().click();
        return this;
    }

    public WidgetsPage goToDatePickerPage() {
        super.open().goToWidgetsCategory();
        getDatePickerPage().click();
        return this;
    }

    public WidgetsPage goToSliderPage() {
        super.open().goToWidgetsCategory();
        getSliderPage().click();
        return this;
    }

    public WidgetsPage goToProgressBarPage() {
        super.open().goToWidgetsCategory();
        getProgressBarPage().click();
        return this;
    }

    public WidgetsPage goToTabsPage() {
        super.open().goToWidgetsCategory();
        getTabsPage().click();
        return this;
    }

    public WidgetsPage goToToolTipsPage() {
        super.open().goToWidgetsCategory();
        getToolTipsPage().click();
        return this;
    }

    public WidgetsPage goToMenuPage() {
        super.open().goToWidgetsCategory();
        getMenuPage().click();
        return this;
    }

    public WidgetsPage goToSelectMenuPage() {
        super.open().goToWidgetsCategory();
        getSelectMenuPage().click();
        return this;
    }
}
