package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ModalDialogsPage extends AlertsFrameWindowsPage {
    private WebElement smallModalButton;
    private WebElement largeModalButton;
    private WebElement modalDialog;

    public ModalDialogsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSmallModalButton() {
        this.smallModalButton = getDriver().findElement(By.id("showSmallModal"));
        return this.smallModalButton;
    }

    public WebElement getLargeModalButton() {
        this.largeModalButton = getDriver().findElement(By.id("showLargeModal"));
        return this.largeModalButton;
    }

    public WebElement getModalDialog() {
        this.modalDialog = getDriver().findElement(By.className("modal-dialog"));
        return this.modalDialog;
    }

    public ModalDialogsPage openSmallModal() {
        getSmallModalButton().click();
        return this;
    }

    public ModalDialogsPage openLargeModal() {
        getLargeModalButton().click();
        return this;
    }

    public int getModalDialogSize() {
        return getModalDialog().getSize().getWidth();
    }
}
