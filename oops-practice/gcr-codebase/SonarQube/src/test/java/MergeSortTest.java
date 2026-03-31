import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void shouldSortArrayCorrectly() {

        int[] input = {42, 7, 89, 13, 56, 3};
        int[] expected = {3, 7, 13, 42, 56, 89};

        MergeSort.sort(input);

        assertArrayEquals(expected, input);
    }
}
