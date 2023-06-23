package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class FramesPage extends AlertsFrameWindowsPage {
    private WebElement firstFrame;
    private WebElement secondFrame;
    private WebElement parentFrame;

    public FramesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFirstFrame() {
        this.firstFrame = getDriver().findElement(By.id("frame1Wrapper"));
        return this.firstFrame;
    }

    public WebElement getSecondFrame() {
        this.secondFrame = getDriver().findElement(By.id("frame2Wrapper"));
        return this.secondFrame;
    }

    public WebElement getParentFrame() {
        this.parentFrame = getDriver().findElement(By.id("framesWrapper"));
        return this.parentFrame;
    }

    public boolean checkChildFrame(WebElement child) {
        List<WebElement> children = getParentFrame().findElements(By.xpath(".//*"));
        for (WebElement ch : children) {
            if (ch.equals(child)) {
                return true;
            }
        }
        return false;
    }
}
