package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends ElementsPage {
    private WebElement doubleClickMeButton;
    private WebElement rightClickMeButton;
    private WebElement dynamicClickMeButton;
    private WebElement doubleClickSuccessMessage;
    private WebElement rightClickSuccessMessage;
    private WebElement dynamicClickSuccessMessage;

    public ButtonsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getDoubleClickMeButton() {
        this.doubleClickMeButton = getDriver().findElement(By.id("doubleClickBtn"));
        return this.doubleClickMeButton;
    }

    public WebElement getRightClickMeButton() {
        this.rightClickMeButton = getDriver().findElement(By.id("rightClickBtn"));
        return this.rightClickMeButton;
    }

    public WebElement getDynamicClickMeButton() {
        this.dynamicClickMeButton = getDriver().findElement(By.xpath("//button[text() = 'Click Me']"));
        return this.dynamicClickMeButton;
    }

    public WebElement getDoubleClickSuccessMessage() {
        this.doubleClickSuccessMessage = getDriver().findElement(By.id("doubleClickMessage"));
        return this.doubleClickSuccessMessage;
    }

    public WebElement getRightClickSuccessMessage() {
        this.rightClickSuccessMessage = getDriver().findElement(By.id("rightClickMessage"));
        return this.rightClickSuccessMessage;
    }

    public WebElement getDynamicClickSuccessMessage() {
        this.dynamicClickSuccessMessage = getDriver().findElement(By.id("dynamicClickMessage"));
        return this.dynamicClickSuccessMessage;
    }
}
