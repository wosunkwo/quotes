/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class AppTest {
    //test case to check for when my application is able to successfully read a json file and return a string of the files content
    @Test
    public void testReadFileHappy() {
        App classUnderTest = new App();
        String path = "src/main/resources/recentquotes.json";
        assertNotNull("this method call should return a string", classUnderTest.readFile(path));
    }

    //test case to check for when my applications error checker works for an invalid path
   @Test
    public void testReadFileFail() {
        App classUnderTest = new App();
        String path = "someRandomPath";
        assertNull("This should return null if it fails", classUnderTest.readFile(path));
    }

    //test case to check for when my application is able to convert a json string into an array of quotes
    @Test
    public void testConvertToQuoteClass() {
        App classUnderTest = new App();
        String path = "src/main/resources/recentquotes.json";
        BufferedReader jsonReader = classUnderTest.readFile(path);
        assertNotNull("this method call should return a random string", classUnderTest.convertToQuoteClassFromFile(jsonReader));
    }

    //test to check for when my application is able to successfully generate a random quote
    @Test
    public void testGenerateRandomQuote() {
        App classUnderTest = new App();
        String path = "src/main/resources/recentquotes.json";
        BufferedReader jsonReader = classUnderTest.readFile(path);
        Quotes[] quoteArr = classUnderTest.convertToQuoteClassFromFile(jsonReader);
        assertNotNull("this method call should return a string", classUnderTest.generateRandomQuote(quoteArr));
    }


}
