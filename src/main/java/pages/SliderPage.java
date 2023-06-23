package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SliderPage extends WidgetsPage {
    private WebElement sliderBox;
    private WebElement sliderInput;
    private WebElement sliderValueBox;

    public SliderPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getSliderBox() {
        this.sliderBox = getDriver().findElement(By.id("sliderContainer"));
        return this.sliderBox;
    }

    public WebElement getSliderInput() {
        this.sliderInput = getDriver().findElement(By.cssSelector("div#sliderContainer input"));
        return this.sliderInput;
    }

    public WebElement getSliderValueBox() {
        this.sliderValueBox = getDriver().findElement(By.id("sliderValue"));
        return this.sliderValueBox;
    }

    public SliderPage moveSliderLeftBy(int value) {
        for (int i = 0; i < value; i++) {
            getSliderInput().sendKeys(Keys.ARROW_LEFT);
        }
        return this;
    }

    public SliderPage moveSliderRightBy(int value) {
        for (int i = 0; i < value; i++) {
            getSliderInput().sendKeys(Keys.ARROW_RIGHT);
        }
        return this;
    }

    public int getSliderValue() {
        return Integer.parseInt(getSliderValueBox().getAttribute("value"));
    }
}
