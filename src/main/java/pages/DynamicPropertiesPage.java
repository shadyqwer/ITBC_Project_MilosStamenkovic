package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicPropertiesPage extends ElementsPage {
    private WebElement textWithRandomID;
    private WebElement enableAfterButton;
    private WebElement colorChangeButton;
    private WebElement visibleAfterButton;

    public DynamicPropertiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getEnableAfterButton() {
        this.enableAfterButton = getDriver().findElement(By.id("enableAfter"));
        return this.enableAfterButton;
    }

    public WebElement getColorChangeButton() {
        this.colorChangeButton = getDriver().findElement(By.id("colorChange"));
        return this.colorChangeButton;
    }

    public WebElement getVisibleAfterButton() {
        this.visibleAfterButton = getDriver().findElement(By.id("visibleAfter"));
        return this.visibleAfterButton;
    }

    public WebElement getTextWithRandomID() {
        this.textWithRandomID = getDriver().findElement(By.xpath("//p[contains(text(), 'This')]"));
        return this.textWithRandomID;
    }
}
