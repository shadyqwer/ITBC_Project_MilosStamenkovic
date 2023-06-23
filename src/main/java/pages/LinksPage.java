package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksPage extends ElementsPage {
    private WebElement homeLinkButton;
    private WebElement dynamicHomeLinkButton;
    private WebElement createdLink;
    private WebElement noContentLink;
    private WebElement movedLink;
    private WebElement badRequestLink;
    private WebElement unauthorizedLink;
    private WebElement forbiddenLink;
    private WebElement notFoundLink;
    private WebElement linkResponseField;

    public LinksPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getHomeLinkButton() {
        this.homeLinkButton = getDriver().findElement(By.id("simpleLink"));
        return this.homeLinkButton;
    }

    public WebElement getDynamicHomeLinkButton() {
        this.dynamicHomeLinkButton = getDriver().findElement(By.id("dynamicLink"));
        return this.dynamicHomeLinkButton;
    }

    public WebElement getCreatedLink() {
        this.createdLink = getDriver().findElement(By.id("created"));
        return this.createdLink;
    }

    public WebElement getNoContentLink() {
        this.noContentLink = getDriver().findElement(By.id("no-content"));
        return this.noContentLink;
    }

    public WebElement getMovedLink() {
        this.movedLink = getDriver().findElement(By.id("moved"));
        return this.movedLink;
    }

    public WebElement getBadRequestLink() {
        this.badRequestLink = getDriver().findElement(By.id("bad-request"));
        return this.badRequestLink;
    }

    public WebElement getUnauthorizedLink() {
        this.unauthorizedLink = getDriver().findElement(By.id("unauthorized"));
        return this.unauthorizedLink;
    }

    public WebElement getForbiddenLink() {
        this.forbiddenLink = getDriver().findElement(By.id("forbidden"));
        return this.forbiddenLink;
    }

    public WebElement getNotFoundLink() {
        this.notFoundLink = getDriver().findElement(By.id("invalid-url"));
        return this.notFoundLink;
    }

    public WebElement getLinkResponseField() {
        this.linkResponseField = getDriver().findElement(By.id("linkResponse"));
        return this.linkResponseField;
    }

    public String responseFieldText() {
        return getLinkResponseField().getText();
    }
}
