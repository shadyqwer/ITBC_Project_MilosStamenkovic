package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectMenuPage extends WidgetsPage {
    private WebElement selectValueMenu;
    private WebElement selectValueMenuInputField;
    private WebElement selectOneMenu;
    private WebElement selectOneMenuInputField;
    private Select oldStyleSelectMenu;
    private WebElement multiselectDropMenu;
    private WebElement multiselectDropMenuInputField;
    private Select standardMultiSelectMenu;

    public SelectMenuPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSelectValueMenu() {
        this.selectValueMenu = getDriver().findElement(By.id("withOptGroup"));
        return this.selectValueMenu;
    }

    public WebElement getSelectValueMenuInputField() {
        this.selectValueMenuInputField = getDriver().findElement(By.id("react-select-2-input"));
        return this.selectValueMenuInputField;
    }

    public WebElement getSelectOneMenu() {
        this.selectOneMenu = getDriver().findElement(By.id("selectOne"));
        return this.selectOneMenu;
    }

    public WebElement getSelectOneMenuInputField() {
        this.selectOneMenuInputField = getDriver().findElement(By.id("react-select-3-input"));
        return this.selectOneMenuInputField;
    }

    public WebElement getMultiselectDropMenu() {
        this.multiselectDropMenu = getDriver().findElements(By.className("css-2b097c-container")).get(2);
        return this.multiselectDropMenu;
    }

    public WebElement getMultiselectDropMenuInputField() {
        this.multiselectDropMenuInputField = getDriver().findElement(By.id("react-select-4-input"));
        return this.multiselectDropMenuInputField;
    }

    public Select getOldStyleSelectMenu() {
        this.oldStyleSelectMenu = new Select(getDriver().findElement(By.cssSelector("#oldSelectMenu")));
        return this.oldStyleSelectMenu;
    }

    public Select getStandardMultiSelectMenu() {
        this.standardMultiSelectMenu = new Select(getDriver().findElement(By.id("cars")));
        return this.standardMultiSelectMenu;
    }

    public SelectMenuPage openSelectValue() {
        getSelectValueMenu().click();
        return this;
    }

    public SelectMenuPage enterSelectValueField(String text) {
        getSelectValueMenuInputField().sendKeys(text);
        return this;
    }

    public SelectMenuPage openMultiSelect() {
        getMultiselectDropMenu().click();
        return this;
    }

    public SelectMenuPage enterMultiSelect(String text) {
        getMultiselectDropMenuInputField().clear();
        getMultiselectDropMenuInputField().sendKeys(text);
        return this;
    }

    public SelectMenuPage openSelectOneMenu() {
        getSelectOneMenu().click();
        return this;
    }

    public SelectMenuPage enterSelectOneMenuField(String text) {
        getSelectOneMenuInputField().clear();
        getSelectOneMenuInputField().sendKeys(text);
        return this;
    }

    public SelectMenuPage oldStyleSelectByIndex(int index) {
        getOldStyleSelectMenu().selectByIndex(index);
        return this;
    }

    public String oldStyleMenuValue() {
        return getOldStyleSelectMenu().getFirstSelectedOption().getText();
    }

    public SelectMenuPage standardSelectByIndex(int index) {
        getStandardMultiSelectMenu().selectByIndex(index);
        return this;
    }

    public String standardMenuValue() {
        return getStandardMultiSelectMenu().getFirstSelectedOption().getText();
    }

}

