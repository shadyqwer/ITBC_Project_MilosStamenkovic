package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragabblePage extends InteractionsPage {
    private WebElement simpleTab;
    private WebElement axisRestrictedTab;
    private WebElement containerRestrictedTab;
    private WebElement cursorStyleTab;
    private WebElement simpleDragMeBox;
    private WebElement onlyXDragBox;
    private WebElement onlyYDragBox;
    private WebElement stickToCenterBox;
    private WebElement stickToTopLeftBox;
    private WebElement stickToBottomBox;

    public DragabblePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSimpleTab() {
        this.simpleTab = getDriver().findElement(By.id("draggableExample-tab-simple"));
        return this.simpleTab;
    }

    public WebElement getAxisRestrictedTab() {
        this.axisRestrictedTab = getDriver().findElement(By.id("draggableExample-tab-axisRestriction"));
        return this.axisRestrictedTab;
    }

    public WebElement getContainerRestrictedTab() {
        this.containerRestrictedTab = getDriver().findElement(By.id("draggableExample-tab-containerRestriction"));
        return this.containerRestrictedTab;
    }

    public WebElement getCursorStyleTab() {
        this.cursorStyleTab = getDriver().findElement(By.id("draggableExample-tab-cursorStyle"));
        return this.cursorStyleTab;
    }

    public WebElement getSimpleDragMeBox() {
        this.simpleDragMeBox = getDriver().findElement(By.id("dragBox"));
        return this.simpleDragMeBox;
    }

    public WebElement getOnlyXDragBox() {
        this.onlyXDragBox = getDriver().findElement(By.id("restrictedX"));
        return this.onlyXDragBox;
    }

    public WebElement getOnlyYDragBox() {
        this.onlyYDragBox = getDriver().findElement(By.id("restrictedY"));
        return this.onlyYDragBox;
    }

    public WebElement getStickToCenterBox() {
        this.stickToCenterBox = getDriver().findElement(By.id("cursorCenter"));
        return this.stickToCenterBox;
    }

    public WebElement getStickToTopLeftBox() {
        this.stickToTopLeftBox = getDriver().findElement(By.id("cursorTopLeft"));
        return this.stickToTopLeftBox;
    }

    public WebElement getStickToBottomBox() {
        this.stickToBottomBox = getDriver().findElement(By.id("cursorBottom"));
        return this.stickToBottomBox;
    }

    public DragabblePage goToSimpleTab() {
        getSimpleTab().click();
        return this;
    }

    public DragabblePage goToAxisRestrictedTab() {
        getAxisRestrictedTab().click();
        return this;
    }

    public DragabblePage goToContainerRestrictedTab() {
        getContainerRestrictedTab().click();
        return this;
    }

    public DragabblePage goToCursorStyleTab() {
        getCursorStyleTab().click();
        return this;
    }


}
