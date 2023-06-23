package runner;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {
    public static void main(String[] args) {
        TestNG testNG = new TestNG();
        XmlSuite suite = new XmlSuite();
        suite.setName("DEMOQA Suite");

        XmlTest test = new XmlTest(suite);
        test.setName("DEMOQA Test");

        List<XmlClass> classes = new ArrayList<>();
        String testFolderPath = "src/main/java/tests";
        File folder = new File(testFolderPath);
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                    String fullClassName = "tests." + file.getName().replace(".java", "");
                    classes.add(new XmlClass(fullClassName));
                }
            }

        test.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);

        testNG.setXmlSuites(suites);
        testNG.run();
    }
}
