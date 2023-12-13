import org.junit.Test;
import static junit.framework.TestCase.*;
import LinkedIN_Learning.Java_Algorithms.HashStructures;
import java.util.LinkedList;
import java.util.List;

public class TestingCircularLinkedList {
    @Test
    public void testingCircularLinkedList() {
        //assertEquals("Test failed for empty string", HashStructures.findFrequencyOfEachElement(new int[]{1, 2, 3, 4, 5, 8, 2, 4, 1, 9, 10, 3, 10}), new HashMap<>(Map.of(1, 2, 2, 2, 3, 2, 4, 2, 5, 1, 8, 1, 9, 1, 10, 2)));
        //assertNotEquals("Testing fails", HashStructures.findFrequencyOfEachElement(new int[]{1, 2, 3, 4, 5, 8, 2, 4, 1, 9, 10, 3, 10}), new HashMap<>(Map.of(1, 1, 2, 2, 3, 2, 4, 2, 5, 1, 8, 1, 9, 1, 10, 2, 7, 6)));
        assertTrue(HashStructures.
                DetectCycleInLinkedList(new LinkedList<>(
                        List.of(new String[]{"Anmol",String.valueOf("Anmol".hashCode())},
                                new String[]{"John",String.valueOf("John".hashCode())},
                                new String[]{"Jacob",String.valueOf("Jacob".hashCode())},
                                new String[]{"Bill",String.valueOf("Bill".hashCode())},
                                new String[]{"Jake",String.valueOf("Jake".hashCode())}))));
        assertFalse(HashStructures.
                DetectCycleInLinkedList(new LinkedList<>(
                        List.of(new String[]{"Anmol",String.valueOf("Anmol".hashCode())},
                                new String[]{"John",String.valueOf("John".hashCode())},
                                new String[]{"Jacob",String.valueOf("Jacob".hashCode())},
                                new String[]{"Bill",String.valueOf("Bill".hashCode())},
                                new String[]{"Anmol",String.valueOf("Anmol".hashCode())}))));

    }
}
