package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage extends IndexPage {
    private WebElement practiceFormPage;

    public FormsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getPracticeFormPage() {
        this.practiceFormPage = getDriver().findElement(By.cssSelector("div.show li#item-0"));
        return this.practiceFormPage;
    }

    public FormsPage goToPracticeFormPage() {
        super.open().goToFormsCategory();
        getPracticeFormPage().click();
        return this;
    }
}
