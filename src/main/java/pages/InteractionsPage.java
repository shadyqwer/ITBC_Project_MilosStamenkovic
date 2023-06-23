package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InteractionsPage extends IndexPage {
    private WebElement sortablePage;
    private WebElement selectablePage;
    private WebElement resizablePage;
    private WebElement droppablePage;
    private WebElement dragabblePage;

    public InteractionsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSortablePage() {
        this.sortablePage = getDriver().findElement(By.cssSelector("div.show li#item-0"));
        return this.sortablePage;
    }

    public WebElement getSelectablePage() {
        this.selectablePage = getDriver().findElement(By.cssSelector("div.show li#item-1"));
        return this.selectablePage;
    }

    public WebElement getResizablePage() {
        this.resizablePage = getDriver().findElement(By.cssSelector("div.show li#item-2"));
        return this.resizablePage;
    }

    public WebElement getDroppablePage() {
        this.droppablePage = getDriver().findElement(By.cssSelector("div.show li#item-3"));
        return this.droppablePage;
    }

    public WebElement getDragabblePage() {
        this.dragabblePage = getDriver().findElement(By.cssSelector("div.show li#item-4"));
        return this.dragabblePage;
    }

    public InteractionsPage goToSortable() {
        super.open().goToInteractionsCategory();
        getSortablePage().click();
        return this;
    }

    public InteractionsPage goToSelectable() {
        super.open().goToInteractionsCategory();
        getSelectablePage().click();
        return this;
    }

    public InteractionsPage goToResizable() {
        super.open().goToInteractionsCategory();
        getResizablePage().click();
        return this;
    }

    public InteractionsPage goToDroppable() {
        super.open().goToInteractionsCategory();
        getDroppablePage().click();
        return this;
    }

    public InteractionsPage goToDragabble() {
        super.open().goToInteractionsCategory();
        getDragabblePage().click();
        return this;
    }
}
