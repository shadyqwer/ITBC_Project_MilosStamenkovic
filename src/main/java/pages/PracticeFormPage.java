package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import data.Gender;
import data.Hobbies;

import java.io.File;
import java.util.Set;

public class PracticeFormPage extends FormsPage {

    private WebElement firstNameField;
    private WebElement lastNameField;
    private WebElement emailField;
    private WebElement genderMaleRadioButton;
    private WebElement genderFemaleRadioButton;
    private WebElement genderOtherRadioButton;
    private WebElement mobileNumberField;
    private WebElement dateOfBirthField;
    private Select dateOfBirthYearSelect;
    private Select dateOfBirthMonthSelect;
    private WebElement subjectsAutocompleteField;
    private WebElement hobbiesSportsCheckbox;
    private WebElement hobbiesReadingCheckbox;
    private WebElement hobbiesMusicCheckbox;
    private WebElement uploadPictureField;
    private WebElement currentAddressField;
    private WebElement selectStateField;
    private WebElement selectCityField;
    private WebElement submitButton;
    private WebElement submittedStudentName;
    private WebElement submittedStudentEmail;
    private WebElement submittedGender;
    private WebElement submittedMobile;
    private WebElement submittedDateOfBirth;
    private WebElement submittedSubjects;
    private WebElement submittedHobbies;
    private WebElement submittedPicture;
    private WebElement submittedAddress;
    private WebElement submittedStateAndCity;
    private WebElement submittedInfoDialog;

    public PracticeFormPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getFirstNameField() {
        this.firstNameField = getDriver().findElement(By.id("firstName"));
        return this.firstNameField;
    }

    public WebElement getLastNameField() {
        this.lastNameField = getDriver().findElement(By.id("lastName"));
        return this.lastNameField;
    }

    public WebElement getEmailField() {
        this.emailField = getDriver().findElement(By.id("userEmail"));
        return this.emailField;
    }

    public WebElement getGenderMaleRadioButton() {
        this.genderMaleRadioButton = getDriver().findElement(By.cssSelector("label[for='gender-radio-1']"));
        return this.genderMaleRadioButton;
    }

    public WebElement getGenderFemaleRadioButton() {
        this.genderFemaleRadioButton = getDriver().findElement(By.cssSelector("label[for='gender-radio-2']"));
        return this.genderFemaleRadioButton;
    }

    public WebElement getGenderOtherRadioButton() {
        this.genderOtherRadioButton = getDriver().findElement(By.cssSelector("label[for='gender-radio-3']"));
        return this.genderOtherRadioButton;
    }

    public WebElement getMobileNumberField() {
        this.mobileNumberField = getDriver().findElement(By.id("userNumber"));
        return this.mobileNumberField;
    }

    public WebElement getDateOfBirthField() {
        this.dateOfBirthField = getDriver().findElement(By.id("dateOfBirthInput"));
        return this.dateOfBirthField;
    }

    public Select getDateOfBirthYearSelect() {
        this.dateOfBirthYearSelect = new Select(getDriver().findElement(By.className("react-datepicker__year-select")));
        return this.dateOfBirthYearSelect;
    }

    public Select getDateOfBirthMonthSelect() {
        this.dateOfBirthMonthSelect = new Select(getDriver().findElement(By.className("react-datepicker__month-select")));
        return this.dateOfBirthMonthSelect;
    }

    public WebElement getSubjectsAutocompleteField() {
        this.subjectsAutocompleteField = getDriver().findElement(By.id("subjectsContainer"));
        return this.subjectsAutocompleteField;
    }

    public WebElement getHobbiesSportsCheckbox() {
        this.hobbiesSportsCheckbox = getDriver().findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        return this.hobbiesSportsCheckbox;
    }

    public WebElement getHobbiesReadingCheckbox() {
        this.hobbiesReadingCheckbox = getDriver().findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
        return this.hobbiesReadingCheckbox;
    }

    public WebElement getHobbiesMusicCheckbox() {
        this.hobbiesMusicCheckbox = getDriver().findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
        return this.hobbiesMusicCheckbox;
    }

    public WebElement getUploadPictureField() {
        this.uploadPictureField = getDriver().findElement(By.id("uploadPicture"));
        return this.uploadPictureField;
    }

    public WebElement getCurrentAddressField() {
        this.currentAddressField = getDriver().findElement(By.id("currentAddress"));
        return this.currentAddressField;
    }

    public WebElement getSelectStateField() {
        this.selectStateField = getDriver().findElement(By.id("react-select-3-input"));
        return this.selectStateField;
    }

    public WebElement getSelectCityField() {
        this.selectCityField = getDriver().findElement(By.id("react-select-4-input"));
        return this.selectCityField;
    }

    public WebElement getSubmitButton() {
        this.submitButton = getDriver().findElement(By.id("submit"));
        return this.submitButton;
    }

    public WebElement getSubmittedInfoDialog() {
        this.submittedInfoDialog = getDriver().findElement(By.className("modal-content"));
        return this.submittedInfoDialog;
    }

    public WebElement getSubmittedStudentName() {
        this.submittedStudentName =
                getDriver().findElement(By.xpath("//td[text()='Student Name']/following-sibling::td"));
        return this.submittedStudentName;
    }

    public WebElement getSubmittedStudentEmail() {
        this.submittedStudentEmail =
                getDriver().findElement(By.xpath("//td[text()='Student Email']/following-sibling::td"));
        return this.submittedStudentEmail;
    }

    public WebElement getSubmittedGender() {
        this.submittedGender =
                getDriver().findElement(By.xpath("//td[text()='Gender']/following-sibling::td"));
        return this.submittedGender;
    }

    public WebElement getSubmittedMobile() {
        this.submittedMobile =
                getDriver().findElement(By.xpath("//td[text()='Mobile']/following-sibling::td"));
        return this.submittedMobile;
    }

    public WebElement getSubmittedDateOfBirth() {
        this.submittedDateOfBirth =
                getDriver().findElement(By.xpath("//td[text()='Date of Birth']/following-sibling::td"));
        return this.submittedDateOfBirth;
    }

    public WebElement getSubmittedSubjects() {
        this.submittedSubjects =
                getDriver().findElement(By.xpath("//td[text()='Subjects']/following-sibling::td"));
        return this.submittedSubjects;
    }

    public WebElement getSubmittedHobbies() {
        this.submittedHobbies =
                getDriver().findElement(By.xpath("//td[text()='Hobbies']/following-sibling::td"));
        return this.submittedHobbies;
    }

    public WebElement getSubmittedPicture() {
        this.submittedPicture =
                getDriver().findElement(By.xpath("//td[text()='Picture']/following-sibling::td"));
        return this.submittedPicture;
    }

    public WebElement getSubmittedAddress() {
        this.submittedAddress =
                getDriver().findElement(By.xpath("//td[text()='Address']/following-sibling::td"));
        return this.submittedAddress;
    }

    public WebElement getSubmittedStateAndCity() {
        this.submittedStateAndCity =
                getDriver().findElement(By.xpath("//td[text()='State and City']/following-sibling::td"));
        return this.submittedStateAndCity;
    }

    public PracticeFormPage enterFirstName(String text) {
        getFirstNameField().clear();
        getFirstNameField().sendKeys(text);
        return this;
    }

    public PracticeFormPage enterLastName(String text) {
        getLastNameField().clear();
        getLastNameField().sendKeys(text);
        return this;
    }

    public PracticeFormPage enterEmail(String text) {
        getEmailField().clear();
        getEmailField().sendKeys(text);
        return this;
    }

    public PracticeFormPage selectGender(Gender gender) {
        if (gender == Gender.MALE) {
            getGenderMaleRadioButton().click();
        } else if (gender == Gender.FEMALE) {
            getGenderFemaleRadioButton().click();
        } else if (gender == Gender.OTHER) {
            getGenderOtherRadioButton().click();
        }
        return this;
    }

    public PracticeFormPage enterMobileNumber(String text) {
        getMobileNumberField().clear();
        getMobileNumberField().sendKeys(text);
        return this;
    }

    public PracticeFormPage selectDate(String day, String month, String year) {
        getDateOfBirthField().click();
        getDateOfBirthYearSelect().selectByValue(year);
        getDateOfBirthMonthSelect().selectByValue(month);
        String dayXpath = "//div[contains(@class, 'react-datepicker__day--0" +
                day + "') and contains(@aria-label, '" + year + "')]";
        getDriver().findElement(By.xpath(dayXpath)).click();
        return this;
    }

    public PracticeFormPage selectHobbies(Set<Hobbies> hobbies) {
        for (Hobbies hobby : hobbies) {
            if (hobby == Hobbies.MUSIC) {
                getHobbiesMusicCheckbox().click();
            } else if (hobby == Hobbies.SPORTS) {
                getHobbiesSportsCheckbox().click();
            } else if (hobby == Hobbies.READING) {
                getHobbiesReadingCheckbox().click();
            }
        }
        return this;
    }

    public PracticeFormPage uploadFile(File file) {
        getUploadPictureField().sendKeys(file.getAbsolutePath());
        return this;
    }

    public PracticeFormPage currentAddress(String text) {
        getCurrentAddressField().clear();
        getCurrentAddressField().sendKeys(text);
        return this;
    }

    public PracticeFormPage selectState(String text) {
        getSelectStateField().sendKeys(text);
        getDriver().findElement(By.xpath("//div[contains(@id,'react-select')]")).click();
        return this;
    }

    public PracticeFormPage selectCity(String text) {
        getSelectCityField().sendKeys(text);
        getDriver().findElement(By.xpath("//div[contains(@id,'react-select')]")).click();
        return this;
    }

    public PracticeFormPage submitForm() {
        getSubmitButton().click();
        return this;
    }
}
