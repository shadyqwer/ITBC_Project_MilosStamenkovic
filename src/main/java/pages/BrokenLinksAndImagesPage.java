package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrokenLinksAndImagesPage extends ElementsPage {
    private WebElement validImage;
    private WebElement brokenImage;
    private WebElement validLink;
    private WebElement brokenLink;

    public BrokenLinksAndImagesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getValidImage() {
        this.validImage = getDriver().findElement(By.xpath("//p[contains(text(), 'Valid')]/following::img"));
        return this.validImage;
    }

    public WebElement getBrokenImage() {
        this.brokenImage = getDriver().findElement(By.xpath("//p[contains(text(), 'Broken')]/following::img"));
        return this.brokenImage;
    }

    public WebElement getValidLink() {
        this.validLink = getDriver().findElement(By.xpath("//a[contains(text(), 'Valid')]"));
        return this.validLink;
    }

    public WebElement getBrokenLink() {
        this.brokenLink = getDriver().findElement(By.xpath("//a[contains(text(), 'Broken')]"));
        return this.brokenLink;
    }

    public BrokenLinksAndImagesPage clickValidLink() {
        getValidLink().click();
        return this;
    }

    public BrokenLinksAndImagesPage clickBrokenLink() {
        getBrokenLink().click();
        return this;
    }
}
