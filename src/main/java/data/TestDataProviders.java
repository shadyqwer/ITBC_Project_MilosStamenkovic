package data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDataProviders {
    @DataProvider(name = "invalidEmails")
    public static Object[][] invalidEmails() {
        return new Object[][]{
                {"@mail.com"}, {"invalid@mail.c"}, {"invalid.com"}, {"invalid@ma#il.com"},
                {".invalid@mail.com"}, {"invalid@@mail.com"}
        };
    }

    @DataProvider(name = "checkBoxes")
    public static Object[][] checkBoxes() {
        return new Object[][]{
                {"Home"}, {"Desktop"}, {"Notes"}, {"Commands"}, {"Documents"}, {"WorkSpace"}, {"React"}, {"Angular"},
                {"Veu"}, {"Office"}, {"Public"}, {"Private"}, {"Classified"}, {"General"}, {"Downloads"}, {"Word"},
                {"Excel"}
        };
    }

    @DataProvider(name = "allCheckBoxes")
    public static Object[][] allCheckBoxes() {
        List<String> elements = Arrays.asList(
                "Home", "Desktop", "Notes", "Commands", "Documents", "WorkSpace",
                "React", "Angular", "Veu", "Office", "Public", "Private", "Classified",
                "General", "Downloads", "Word", "Excel"
        );

        return new Object[][]{{new ArrayList<>(elements)}};
    }

    @DataProvider(name = "selectableList")
    public static Object[][] selectableList() {
        return new Object[][]{
                {"Cras"}, {"Dapibus"}, {"Morbi"}, {"Porta"}
        };
    }

    @DataProvider(name = "selectableGrid")
    public static Object[][] selectableGrid() {
        return new Object[][]{
                {"One"}, {"Two"}, {"Three"}, {"Four"}, {"Five"}, {"Six"}, {"Seven"}, {"Eight"}, {"Nine"}
        };
    }

    @DataProvider(name = "selectOneMenu")
    public static Object[][] selectValueMenu() {
        return new Object[][]{
                {"Dr."}, {"Mr."}, {"Mrs."}, {"Ms."}, {"Prof."}, {"Other"}
        };
    }

    @DataProvider(name = "multiSelectMenu")
    public static Object[][] multiSelectMenu() {
        return new Object[][]{
                {"Green"}, {"Blue"}, {"Black"}, {"Red"}
        };
    }

    @DataProvider(name = "selectValueMenu")
    public static Object[][] selectOneMenu() {
        return new Object[][]{
                {"Group 1, option 1"}, {"Group 1, option 2"}, {"Group 2, option 1"}, {"Group 2, option 2"},
                {"A root option"}, {"Another root option"}
        };
    }

    @DataProvider(name = "oldStyleMenu")
    public static Object[][] oldStyleMenu() {
        return new Object[][]{
                {0, "Red"}, {1, "Blue"}, {2, "Green"}, {3, "Yellow"}, {4, "Purple"}, {5, "Black"},
                {6, "White"}, {7, "Voilet"}, {8, "Indigo"}, {9, "Magenta"}, {10, "Aqua"}
        };
    }

    @DataProvider(name = "standardMultiSelectMenu")
    public static Object[][] standardMultiSelectMenu() {
        return new Object[][]{
                {0, "Volvo"}, {1, "Saab"}, {2, "Opel"}, {3, "Audi"}
        };
    }

}
