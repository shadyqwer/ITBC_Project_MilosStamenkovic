package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import data.Hobbies;
import data.Gender;

import java.io.File;
import java.util.EnumSet;
import java.util.Set;

public class PracticeFormTests extends BaseTest {

    @BeforeMethod
    public void beforeEachTest() {
        getFormsPage().goToPracticeFormPage();
    }

    @Test
    public void verifyPracticeForm() {
        Set<Hobbies> hobbies = EnumSet.of(Hobbies.SPORTS, Hobbies.READING, Hobbies.MUSIC);
        File uploadFile = new File("src/main/java/data/sampleFile.jpeg");
        String firstName = getFaker().name().firstName();
        String lastName = getFaker().name().lastName();
        Gender gender = Gender.MALE;
        String mobile = getFaker().number().digits(10);
        String address = getFaker().address().fullAddress();
        String state = "Uttar Pradesh";
        String city = "Agra";

        getPracticeFormPage()
                .enterFirstName(firstName)
                .enterLastName(lastName)
                .selectGender(gender)
                .enterMobileNumber(mobile)
                .selectDate("05", "11", "1990")
                .selectHobbies(hobbies)
                .uploadFile(uploadFile)
                .currentAddress(address)
                .selectState(state)
                .selectCity(city)
                .submitForm();

        assertVisibilityOfElement(getPracticeFormPage().getSubmittedInfoDialog());

        getSoftAssert().assertEquals(getPracticeFormPage().getSubmittedStudentName().getText(),firstName + " " + lastName);
        getSoftAssert().assertEquals(getPracticeFormPage().getSubmittedGender().getText(), gender.getString());
        getSoftAssert().assertEquals(getPracticeFormPage().getSubmittedMobile().getText(), mobile);
        getSoftAssert().assertEquals(getPracticeFormPage().getSubmittedAddress().getText(), address);
        getSoftAssert().assertTrue(uploadFile.getAbsolutePath().contains(getPracticeFormPage().getSubmittedPicture().getText()));
        getSoftAssert().assertEquals(getPracticeFormPage().getSubmittedStateAndCity().getText(), state + " " + city);
        for (Hobbies hobby : hobbies) {
            getSoftAssert().assertTrue(getPracticeFormPage().getSubmittedHobbies().getText().contains(hobby.getString()));
        }


        getSoftAssert().assertAll();
    }
}
