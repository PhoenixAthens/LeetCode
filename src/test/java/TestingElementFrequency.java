import LinkedIN_Learning.Java_Algorithms.StackDS;
import org.junit.Test;
import static junit.framework.TestCase.*;
import static org.junit.Assert.assertNotEquals;

import LinkedIN_Learning.Java_Algorithms.HashStructures;

import java.util.HashMap;
import java.util.Map;

public class TestingElementFrequency {
    @Test
    public void test_element_freq() {
        assertEquals("Test failed for empty string", HashStructures.findFrequencyOfEachElement(new int[]{1, 2, 3, 4, 5, 8, 2, 4, 1, 9, 10, 3, 10}), new HashMap<>(Map.of(1, 2, 2, 2, 3, 2, 4, 2, 5, 1, 8, 1, 9, 1, 10, 2)));
        assertNotEquals("Testing fails", HashStructures.findFrequencyOfEachElement(new int[]{1, 2, 3, 4, 5, 8, 2, 4, 1, 9, 10, 3, 10}), new HashMap<>(Map.of(1, 1, 2, 2, 3, 2, 4, 2, 5, 1, 8, 1, 9, 1, 10, 2, 7, 6)));
    }


}
