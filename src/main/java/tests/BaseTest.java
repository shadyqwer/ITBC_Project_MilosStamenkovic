package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.asserts.SoftAssert;
import pages.*;
import pages.DynamicPropertiesPage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class BaseTest {
    private WebDriver driver;
    private WebDriverWait wait;
    private SoftAssert softAssert;
    private Actions actions;
    private JavascriptExecutor js;
    private Faker faker;
    private BasePage basePage;
    private IndexPage indexPage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private ButtonsPage buttonsPage;
    private RadioButtonPage radioButtonPage;
    private LinksPage linksPage;
    private CheckBoxPage checkBoxPage;
    private BrokenLinksAndImagesPage brokenLinksAndImagesPage;
    private DynamicPropertiesPage dynamicPropertiesPage;
    private AlertsFrameWindowsPage alertsFrameWindowsPage;
    private ModalDialogsPage modalDialogsPage;
    private FramesPage framesPage;
    private WidgetsPage widgetsPage;
    private TabsPage tabsPage;
    private ToolTipsPage toolTipsPage;
    private AlertsPage alertsPage;
    private AccordianPage accordianPage;
    private InteractionsPage interactionsPage;
    private SelectablePage selectablePage;
    private DroppablePage droppablePage;
    private DragabblePage dragabblePage;
    private SliderPage sliderPage;
    private SelectMenuPage selectMenuPage;
    private ProgressBarPage progressBarPage;


    public WebDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }

    public SoftAssert getSoftAssert() {
        return softAssert;
    }

    public Actions getActions() {
        return this.actions;
    }

    public JavascriptExecutor getJs() {
        return this.js;
    }

    public Faker getFaker() {
        return faker;
    }

    public BasePage getBasePage() {
        return this.basePage;
    }

    public IndexPage getIndexPage() {
        return this.indexPage;
    }

    public ElementsPage getElementsPage() {
        return this.elementsPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }

    public LinksPage getLinksPage() {
        return linksPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public CheckBoxPage getCheckBoxPage() {
        return checkBoxPage;
    }

    public BrokenLinksAndImagesPage getBrokenLinksAndImagesPage() {
        return brokenLinksAndImagesPage;
    }

    public DynamicPropertiesPage getDynamicPropertiesPage() {
        return dynamicPropertiesPage;
    }

    public AlertsFrameWindowsPage getAlertsFrameWindowsPage() {
        return this.alertsFrameWindowsPage;
    }

    public ModalDialogsPage getModalDialogsPage() {
        return this.modalDialogsPage;
    }

    public FramesPage getFramesPage() {
        return this.framesPage;
    }

    public WidgetsPage getWidgetsPage() {
        return widgetsPage;
    }

    public TabsPage getTabsPage() {
        return tabsPage;
    }

    public ToolTipsPage getToolTipsPage() {
        return toolTipsPage;
    }

    public AlertsPage getAlertsPage() {
        return this.alertsPage;
    }

    public AccordianPage getAccordianPage() {
        return this.accordianPage;
    }

    public InteractionsPage getInteractionsPage() {
        return interactionsPage;
    }

    public SelectablePage getSelectablePage() {
        return selectablePage;
    }

    public DroppablePage getDroppablePage() {
        return droppablePage;
    }

    public DragabblePage getDragabblePage() {
        return dragabblePage;
    }

    public SliderPage getSliderPage() {
        return sliderPage;
    }

    public SelectMenuPage getSelectMenuPage() {
        return selectMenuPage;
    }

    public ProgressBarPage getProgressBarPage() {
        return progressBarPage;
    }

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        softAssert = new SoftAssert();
        js = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        faker = new Faker();
        basePage = new BasePage(driver, wait);
        indexPage = new IndexPage(driver, wait);
        elementsPage = new ElementsPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        linksPage = new LinksPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver, wait);
        brokenLinksAndImagesPage = new BrokenLinksAndImagesPage(driver, wait);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wait);
        alertsFrameWindowsPage = new AlertsFrameWindowsPage(driver, wait);
        modalDialogsPage = new ModalDialogsPage(driver, wait);
        framesPage = new FramesPage(driver, wait);
        widgetsPage = new WidgetsPage(driver, wait);
        tabsPage = new TabsPage(driver, wait);
        toolTipsPage = new ToolTipsPage(driver, wait);
        alertsPage = new AlertsPage(driver, wait);
        accordianPage = new AccordianPage(driver, wait);
        interactionsPage = new InteractionsPage(driver, wait);
        selectablePage = new SelectablePage(driver, wait);
        droppablePage = new DroppablePage(driver, wait);
        dragabblePage = new DragabblePage(driver, wait);
        sliderPage = new SliderPage(driver, wait);
        selectMenuPage = new SelectMenuPage(driver, wait);
        progressBarPage = new ProgressBarPage(driver, wait);

        getDriver().manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void cleanUp() {
        List<String> allOpenedTabs = new ArrayList<>(getDriver().getWindowHandles());
        for (String tab : allOpenedTabs) {
            getDriver().switchTo().window(tab);
            getDriver().close();
        }
    }

    public void assertVisibilityOfElement(WebElement element) {
        getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }

    public void assertElementIsClickable(WebElement element) {
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public void moveElementTo(WebElement from, WebElement to) {
        getActions().dragAndDrop(from, to).perform();
    }

    public void moveElementByOffset(WebElement element, int xOffset, int yOffset) {
        getActions().dragAndDropBy(element, xOffset, yOffset).perform();
    }
}
