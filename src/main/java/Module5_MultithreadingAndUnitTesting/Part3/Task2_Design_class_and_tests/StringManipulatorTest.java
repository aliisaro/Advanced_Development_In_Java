package Module5_MultithreadingAndUnitTesting.Part3.Task2_Design_class_and_tests;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StringManipulatorTest {
    @Test
    public void canConcatenate() {
        // Arrange
        StringManipulator stringManipulator = new StringManipulator();
        String str1 = "Hello";
        String str2 = " World";
        String expectedConcatenation = "Hello World";

        // Act
        String actualConcatenation = stringManipulator.concatenate(str1, str2);

        // Assert
        assertEquals(expectedConcatenation, actualConcatenation);
    }

    @Test
    public void canFindLength() {
        StringManipulator stringManipulator = new StringManipulator();

        String str = "Hello";
        int expectedLength = 5;

        int length = stringManipulator.findLength(str);
        assertEquals(expectedLength, length);
    }

    @Test
    public void canConvertToUppercae() {
        StringManipulator stringManipulator = new StringManipulator();

        String str = "Hello";
        String expectedOutput = "HELLO";

        String output = stringManipulator.convertToUpperCase(str);
        assertEquals(expectedOutput, output);
    }

    @Test
    public void canConvertToLowercase() {
        StringManipulator stringManipulator = new StringManipulator();

        String str = "Hello";
        String expectedOutput = "hello";

        String output = stringManipulator.convertToLowerCase(str);
        assertEquals(expectedOutput, output);
    }

    @Test
    public void canCheckSubstring() {
        StringManipulator stringManipulator = new StringManipulator();
        String str = "Hello";

        String subStr = "World";

        boolean containsSubStr = stringManipulator.containsSubstring(str, subStr);
        assertFalse(containsSubStr); // Expecting false since "World" does not exist in "Hello"
    }
}
