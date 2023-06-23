package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TextBoxPage extends ElementsPage {
    private WebElement fullNameField;
    private WebElement emailField;
    private WebElement currentAddressField;
    private WebElement permanentAddressField;
    private WebElement submitButton;
    private WebElement submittedFullNameField;
    private WebElement submittedEmailField;
    private WebElement submittedCurrentAddressField;
    private WebElement submittedPermanentAddressField;

    public TextBoxPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFullNameField() {
        this.fullNameField = getDriver().findElement(By.id("userName"));
        return this.fullNameField;
    }

    public WebElement getEmailField() {
        this.emailField = getDriver().findElement(By.id("userEmail"));
        return this.emailField;
    }

    public WebElement getCurrentAddressField() {
        this.currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return this.currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        this.permanentAddressField = getDriver().findElement(By.id("permanentAddress"));
        return this.permanentAddressField;
    }

    public WebElement getSubmitButton() {
        this.submitButton = getDriver().findElement(By.id("submit"));
        return this.submitButton;
    }

    public WebElement getSubmittedFullNameField() {
        this.submittedFullNameField = getDriver().findElement(By.id("name"));
        return this.submittedFullNameField;
    }

    public WebElement getSubmittedEmailField() {
        this.submittedEmailField = getDriver().findElement(By.id("email"));
        return this.submittedEmailField;
    }

    public WebElement getSubmittedCurrentAddressField() {
        this.submittedCurrentAddressField = getDriver().findElement(By.xpath("//p[@id='currentAddress']"));
        return this.submittedCurrentAddressField;
    }

    public WebElement getSubmittedPermanentAddressField() {
        this.submittedPermanentAddressField = getDriver().findElement(By.xpath("//p[@id='permanentAddress']"));
        return this.submittedPermanentAddressField;
    }

    public TextBoxPage enterTextToFullNameField(String text) {
        getFullNameField().sendKeys(text);
        return this;
    }

    public TextBoxPage enterTextToEmailField(String text) {
        getEmailField().sendKeys(text);
        return this;
    }

    public TextBoxPage enterTextToCurrentAddressField(String text) {
        getCurrentAddressField().sendKeys(text);
        return this;
    }

    public TextBoxPage enterTextToPermanentAddressField(String text) {
        getPermanentAddressField().sendKeys(text);
        return this;
    }

    public TextBoxPage clickSubmitButton() {
        getSubmitButton().click();
        return this;
    }

    public String checkSubmittedFullName() {
        return getSubmittedFullNameField().getText();
    }

    public String checkSubmittedEmail() {
        return getSubmittedEmailField().getText();
    }

    public String checkSubmittedCurrentAddress() {
        return getSubmittedCurrentAddressField().getText();
    }

    public String checkSubmittedPermanentAddress() {
        return getSubmittedPermanentAddressField().getText();
    }
}
