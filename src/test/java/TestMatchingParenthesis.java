import org.junit.Test;
import static junit.framework.TestCase.*;
import LinkedIN_Learning.Java_Algorithms.StackDS;

public class TestMatchingParenthesis {

    @Test
    public void testMatchingParenthesis_EmptyString() {
        assertTrue("Test failed for empty string", StackDS.matchingParenthesis(""));
    }

    @Test
    public void testMatchingParenthesis_StringWithNoParenthesis() {
        assertTrue("Test failed for string with no parentheses", StackDS.matchingParenthesis("abcdefg"));
    }

    @Test
    public void testMatchingParenthesis_StringWithBalancedParenthesis() {
        assertTrue("Test failed for string with balanced parentheses", StackDS.matchingParenthesis("a(b(c)d)e"));
    }

    @Test
    public void testMatchingParenthesis_OnlyOpenParenthesis() {
        assertFalse("Test failed for string with only open parentheses", StackDS.matchingParenthesis("((((("));
    }

    @Test
    public void testMatchingParenthesis_OnlyCloseParenthesis() {
        assertFalse("Test failed for string with only close parentheses", StackDS.matchingParenthesis(")))))"));
    }

    @Test
    public void testMatchingParenthesis_UnbalancedParenthesis() {
        assertFalse("Test failed for string with unbalanced parentheses", StackDS.matchingParenthesis("(((a))"));
    }
}