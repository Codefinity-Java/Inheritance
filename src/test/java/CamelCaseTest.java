import org.example.MakeStringCamelCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CamelCaseTest {

    private final MakeStringCamelCase CamelCaseUtil = new MakeStringCamelCase();

    @Test
    public void testRegularString() {
        String input = "hello_world-this_is_a-test";
        String expected = "helloWorldThisIsATest";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringWithLeadingAndTrailingSpaces() {
        String input = "  spaced_string  ";
        String expected = "spacedString";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringWithRepeatedSeparators() {
        String input = "one__two---three";
        String expected = "oneTwoThree";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringWithUpperCaseCharacters() {
        String input = "HELLO_WORLD";
        String expected = "helloWorld";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSingleCharacterString() {
        String input = "x";
        String expected = "x";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testSingleWordString() {
        String input = "test";
        String expected = "test";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testStringWithSeparatorsInMiddleOfWords() {
        String input = "multi-_word";
        String expected = "multiWord";
        String result = CamelCaseUtil.makeStringCamelCase(input);
        Assertions.assertEquals(expected, result);
    }
}
