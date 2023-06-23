package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccordianPage extends WidgetsPage {
    private WebElement accordianSectionOne;
    private WebElement accordianSectionTwo;
    private WebElement accordianSectionThree;
    private WebElement accordianSectionOneContent;
    private WebElement accordianSectionTwoContent;
    private WebElement accordianSectionThreeContent;

    public AccordianPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getAccordianSectionOne() {
        this.accordianSectionOne = getDriver().findElement(By.id("section1Heading"));
        return this.accordianSectionOne;
    }

    public WebElement getAccordianSectionTwo() {
        this.accordianSectionTwo = getDriver().findElement(By.id("section2Heading"));
        return this.accordianSectionTwo;
    }

    public WebElement getAccordianSectionThree() {
        this.accordianSectionThree = getDriver().findElement(By.id("section3Heading"));
        return this.accordianSectionThree;
    }

    public WebElement getAccordianSectionOneContent() {
        this.accordianSectionOneContent = getDriver().findElement(By.xpath("//div[@id='section1Content']/parent::div"));
        return this.accordianSectionOneContent;
    }

    public WebElement getAccordianSectionTwoContent() {
        this.accordianSectionTwoContent = getDriver().findElement(By.xpath("//div[@id='section2Content']/parent::div"));
        return this.accordianSectionTwoContent;
    }

    public WebElement getAccordianSectionThreeContent() {
        this.accordianSectionThreeContent = getDriver().findElement(By.xpath("//div[@id='section3Content']/parent::div"));
        return this.accordianSectionThreeContent;
    }

    public AccordianPage openFirstAccordian() {
        getAccordianSectionOne().click();
        return this;
    }

    public AccordianPage openSecondAccordian() {
        getAccordianSectionTwo().click();
        return this;
    }

    public AccordianPage openThirdAccordian() {
        getAccordianSectionThree().click();
        return this;
    }

}
