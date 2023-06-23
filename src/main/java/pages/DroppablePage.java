package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DroppablePage extends InteractionsPage {
    private WebElement simpleTab;
    private WebElement acceptTab;
    private WebElement preventPropogationTab;
    private WebElement revertDraggableTag;
    private WebElement dragMeButton;
    private WebElement dropHereSimpleField;
    private WebElement acceptableButton;
    private WebElement notAcceptableButton;
    private WebElement dropHereAcceptField;
    private WebElement dragPreventButton;
    private WebElement outerNotGreedyField;
    private WebElement innerNotGreedyField;
    private WebElement outerGreedyField;
    private WebElement innerGreedyField;
    private WebElement willRevertButton;
    private WebElement notRevertButton;
    private WebElement revertDropHereField;

    public DroppablePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSimpleTab() {
        this.simpleTab = getDriver().findElement(By.id("droppableExample-tab-simple"));
        return this.simpleTab;
    }

    public WebElement getAcceptTab() {
        this.acceptTab = getDriver().findElement(By.id("droppableExample-tab-accept"));
        return this.acceptTab;
    }

    public WebElement getPreventPropogationTab() {
        this.preventPropogationTab = getDriver().findElement(By.id("droppableExample-tab-preventPropogation"));
        return this.preventPropogationTab;
    }

    public WebElement getRevertDraggableTag() {
        this.revertDraggableTag = getDriver().findElement(By.id("droppableExample-tab-revertable"));
        return this.revertDraggableTag;
    }

    public WebElement getDragMeButton() {
        this.dragMeButton = getDriver().findElement(By.id("draggable"));
        return this.dragMeButton;
    }

    public WebElement getDropHereSimpleField() {
        this.dropHereSimpleField = getDriver().findElement(By.id("droppable"));
        return this.dropHereSimpleField;
    }

    public WebElement getAcceptableButton() {
        this.acceptableButton = getDriver().findElement(By.id("acceptable"));
        return this.acceptableButton;
    }

    public WebElement getNotAcceptableButton() {
        this.notAcceptableButton = getDriver().findElement(By.id("notAcceptable"));
        return this.notAcceptableButton;
    }

    public WebElement getDropHereAcceptField() {
        this.dropHereAcceptField = getDriver().findElement(By.cssSelector("div#droppableExample-tabpane-accept div#droppable"));
        return this.dropHereAcceptField;
    }

    public WebElement getDragPreventButton() {
        this.dragPreventButton = getDriver().findElement(By.id("dragBox"));
        return this.dragPreventButton;
    }

    public WebElement getOuterNotGreedyField() {
        this.outerNotGreedyField = getDriver().findElement(By.id("notGreedyDropBox"));
        return this.outerNotGreedyField;
    }

    public WebElement getInnerNotGreedyField() {
        this.innerNotGreedyField = getDriver().findElement(By.id("notGreedyInnerDropBox"));
        return this.innerNotGreedyField;
    }

    public WebElement getOuterGreedyField() {
        this.outerGreedyField = getDriver().findElement(By.id("greedyDropBox"));
        return this.outerGreedyField;
    }

    public WebElement getInnerGreedyField() {
        this.innerGreedyField = getDriver().findElement(By.id("greedyDropBoxInner"));
        return this.innerGreedyField;
    }

    public WebElement getWillRevertButton() {
        this.willRevertButton = getDriver().findElement(By.id("revertable"));
        return this.willRevertButton;
    }

    public WebElement getNotRevertButton() {
        this.notRevertButton = getDriver().findElement(By.id("notRevertable"));
        return this.notRevertButton;
    }

    public WebElement getRevertDropHereField() {
        this.revertDropHereField = getDriver().findElement(By.cssSelector("div#revertableDropContainer div#droppable"));
        return this.revertDropHereField;
    }

    public DroppablePage goToSimpleTab() {
        getSimpleTab().click();
        return this;
    }

    public DroppablePage goToAcceptTab() {
        getAcceptTab().click();
        return this;
    }

    public DroppablePage goToPreventTab() {
        getPreventPropogationTab().click();
        return this;
    }

    public DroppablePage goToRevertTab() {
        getRevertDraggableTag().click();
        return this;
    }

}
