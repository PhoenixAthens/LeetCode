import org.junit.Test;
import static org.junit.Assert.*;
import java.util.*;
import LinkedIN_Learning.Java_Algorithms.HashStructures;

public class TestFindMissing {

    @Test
    public void testFindMissing_NoMissingNumbers() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {2, 1, 5, 3, 4};
        assertTrue("Failed for no missing numbers", HashStructures.findMissingMembers(firstArray, secondArray).isEmpty());
    }

    @Test
    public void testFindMissing_SingleMissingNumber() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {1, 2, 3, 5};
        List<Integer> missing = HashStructures.findMissingMembers(firstArray, secondArray);
        assertTrue("Failed for single missing number", missing.equals(Arrays.asList(4)));
    }

    @Test
    public void testFindMissing_MultipleMissingNumbers() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5};
        List<Integer> missing = HashStructures.findMissingMembers(firstArray, secondArray);
        assertTrue("Failed for multiple missing numbers", missing.equals(Arrays.asList(1, 2, 3, 4)));
    }

    @Test
    public void testFindMissing_AllMissingNumbers() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {};
        List<Integer> missing = HashStructures.findMissingMembers(firstArray, secondArray);
        assertTrue("Failed for all missing numbers", missing.equals(Arrays.asList(1, 2, 3, 4, 5)));
    }
}